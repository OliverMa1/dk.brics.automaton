# dk.brics.automaton

Copyright (C) 2001-2022 Anders Møller

This source code in this package may be used under the terms of the
BSD license.  Please read the file 'COPYING' for details.

This package contains a full DFA/NFA implementation with Unicode
alphabet and support for all standard regular expression operations.

The jar and javadoc files can be built using `ant` or `mvn package`.
(The source package includes pre-built files.)

Release artifacts for the Ostrich fork are published under the existing
`dk.brics:automaton:<version>` coordinates via the GitHub Pages Maven
repository at `https://oliverma1.github.io/dk.brics.automaton/releases`.

To publish a new stable release, bump the version in `pom.xml`, push the
change, and create a matching git tag `v<version>`. The `publish` workflow
builds the artifact and updates the GitHub Pages Maven repository.

For more information, go to the package home page at
https://www.brics.dk/automaton/.


Anders Møller,
amoeller@cs.au.dk
