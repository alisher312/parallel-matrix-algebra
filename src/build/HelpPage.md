matrixalg - parallel algorithms for matrix algebra.

Usage: matrixalg <mode> [<args>]

**matrixalg** is an attempt to implement parallel algorithms for matrix operations, starting with infamous matrix multiplication.

There are two modes of the program execution:

**Agent mode** usage: matrixalg [options]

Used as a passive agent listening for an operator connection, solving its own part of problem and reporting back to the operator.

Options

 :   -v, --verbose   increase verbosity


**Operator mode** usage: matrixalg op <command> <infile> <outfile>

This mode is used for finding available agents on the network, an agent reliability assessment and work load distribution.

Commands

:   m   Matrix multiplication