#!/bin/sh

ant compile

java -jar lib/evosuite-1.0.3.jar \
    -projectCP=bin \
    -class edu.ncsu.csc326.coffeemaker.Inventory \
    -Dsearch_budget=60 \
    -Dtest_comments=false

