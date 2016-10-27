#!/bin/sh

ant compile

java -classpath bin:lib/randoop-all-3.0.6.jar randoop.main.Main gentests \
    --classlist=coffeemaker.all \
    --timelimit=60 \
    --no-error-revealing-tests=true \
    --junit-package-name=edu.ncsu.csc326.coffeemaker \
    --junit-output-dir=randoop-tests
