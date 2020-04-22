.PHONY: clean clean-test clean-pyc clean-build help
.DEFAULT_GOAL := help

define BROWSER_PYSCRIPT
import os, webbrowser, sys

from urllib.request import pathname2url

webbrowser.open("file://" + pathname2url(os.path.abspath(sys.argv[1])))
endef
export BROWSER_PYSCRIPT

define PRINT_HELP_PYSCRIPT
import re, sys

for line in sys.stdin:
	match = re.match(r'^([a-zA-Z_-]+):.*?## (.*)$$', line)
	if match:
		target, help = match.groups()
		print("%-20s %s" % (target, help))
endef
export PRINT_HELP_PYSCRIPT

BROWSER := python -c "$$BROWSER_PYSCRIPT"

help:
	@python -c "$$PRINT_HELP_PYSCRIPT" < $(MAKEFILE_LIST)

clean: clean-build clean-pyc clean-test ## remove all build, test, coverage and Python artifacts

clean-build: ## remove build artifacts
	rm -fr build/
	rm -fr dist/
	rm -fr .eggs/
	find . -name '*.egg-info' -exec rm -fr {} +
	find . -name '*.egg' -exec rm -f {} +

clean-pyc: ## remove Python file artifacts
	find . -name '*.pyc' -exec rm -f {} +
	find . -name '*.pyo' -exec rm -f {} +
	find . -name '*~' -exec rm -f {} +
	find . -name '__pycache__' -exec rm -fr {} +

clean-test: ## remove test and coverage artifacts
	rm -fr .tox/
	rm -f .coverage
	rm -fr htmlcov/
	rm -fr .pytest_cache

lint: ## check style with flake8
	poetry run flake8 vsot tests

test: ## run tests quickly with the default Python
	poetry run pytest

test-all: ## run tests on every Python version with tox
	tox

coverage: ## check code coverage quickly with the default Python
	poetry run coverage run --source vsot -m pytest
	poetry run coverage report -m
	poetry run coverage html
	$(BROWSER) htmlcov/index.html

build:
	poetry build

release-check:
	poetry run python -m readme_renderer README.rst >/dev/null

release: release-check build ## package and upload a release
	poetry publish

install: clean ## install the package to the active Python's site-packages
	python setup.py install


grammar:
	docker build -f docker/Dockerfile.antlr -t vsot-antlr docker ## Normally will use cache
	docker run -v $(shell pwd)/vsot:/vsot vsot-antlr:latest -Dlanguage=Python3 -no-listener -visitor /vsot/antlr/HTMLParser.g4 /vsot/antlr/HTMLLexer.g4
	rm -r gen
