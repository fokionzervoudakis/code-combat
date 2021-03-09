#!/bin/bash

set -e

rm -rf build/
mkdir -p build/classes build/testclasses

javac \
	-cp .:lib/*:lib/log/* \
	-d build/classes/ \
	-sourcepath src/ `find src/* -name *.java`

javac \
	-cp .:build/classes/:lib/*:lib/log/*:lib/test/* \
	-d build/testclasses/ \
	-sourcepath testsrc/ `find testsrc/* -name *.java`

junit=lib/test/junit-platform-console-standalone-1.3.2.jar

# enable assertions
java -ea -cp .:${junit}:build/classes/:build/testclasses/:lib/*:lib/test/* \
	org.junit.platform.console.ConsoleLauncher \
		--details tree \
		--scan-classpath \
		--include-classname '.*Test.*'
