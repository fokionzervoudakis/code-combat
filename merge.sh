#!/bin/bash

set -e

rm all.txt

for f in $(find src/ -name *.java -not -path */annotation*)
do
	cat $f >> all.txt
	printf '=%.0s' {1..50} >> all.txt
	echo >> all.txt
done
