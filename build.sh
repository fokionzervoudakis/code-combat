#!/bin/bash

set -e

rm -rf build/
mkdir -p build/classes build/testclasses

javac \
	--release 12 --enable-preview \
	-cp .:lib/*:lib/log/* \
	-d build/classes/ \
	-sourcepath src/ `find src/* -name *.java`

javac \
	--release 12 --enable-preview \
	-cp .:build/classes/:lib/*:lib/log/*:lib/test/* \
	-d build/testclasses/ \
	-sourcepath testsrc/ `find testsrc/* -name *.java`

junit=lib/test/junit-platform-console-standalone-1.3.2.jar

java \
	--enable-preview \
	-cp .:${junit}:build/classes/:build/testclasses/:lib/*:lib/test/* \
		org.junit.platform.console.ConsoleLauncher \
			--details tree \
			--scan-classpath \
			--include-classname '.*Test.*'

