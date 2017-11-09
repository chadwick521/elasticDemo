#!/bin/sh

JAVA_HOME=/usr/java/jdk1.8.0_60/
export JAVA_HOME

nohup java -jar $1 & echo $! > ./pid.file &