#!/bin/sh
mvn package && java -jar target/dwarfs-1.0-SNAPSHOT.jar >target/lamp-results.txt
