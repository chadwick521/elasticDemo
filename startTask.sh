#!/bin/sh

nohup /usr/java/jdk1.8.0_60/bin/java -jar $1 & echo $! > ./pid.file &