===================================================
(unmaintained) VSOT - Like black_, but for Django/Jinja2 HTML templates
===================================================


.. image:: https://img.shields.io/pypi/v/vsot.svg
        :target: https://pypi.python.org/pypi/vsot

.. image:: https://img.shields.io/travis/benhowes/vsot.svg
        :target: https://travis-ci.com/benhowes/vsot

.. image:: https://img.shields.io/github/license/benhowes/vsot
        :alt: License - MIT

Note: I recommend looking at the following formatters/indenters instead:
- Full formatting (as VSOT attempts): https://github.com/Riverside-Healthcare/djLint
- Just indentation: https://github.com/rtts/djhtml

HTML Template formatter

Use VSOT to automatically format your django/Jinja2 HTML templates. No need to manually reflow text or tags when you add/remove content.

It has been tested on small files, however there is a lot more to be done an a lot of edge cases which are not handled all that nicely at the moment. Use at your own risk, and only if you have the means to verify the output is correct!

Free software: MIT license


Features
--------

* Mimics black in terms of options and configuration.
* Automatically supports all built in django/jinja2 tags
* Safe - VSOT ensures that it does not change the meaning of the templates


Installation
------------

.. code-block:: console

    pip install vsot

Dev Setup
---------

Requirements:
- Python 3.6 or later
- Docker
- Python poetry (see `poetry docs`_)

1. Clone repo

2. Installation

.. code-block:: console

    poetry install


Credits
-------

- A lot of the code for this was repurposed from black_
- Antlr4_ is used for the parser, along with using the `HTML parser from the antlr library`_ as a starting point
- This package was created with Cookiecutter_ and the `audreyr/cookiecutter-pypackage`_ project template.

.. _Cookiecutter: https://github.com/audreyr/cookiecutter
.. _`audreyr/cookiecutter-pypackage`: https://github.com/audreyr/cookiecutter-pypackage
.. _black: https://github.com/psf/black
.. _`poetry docs`: https://python-poetry.org/docs/#installation
.. _Antlr4: https://github.com/antlr/antlr4
.. _`HTML parser from the antlr library`: https://github.com/antlr/grammars-v4
