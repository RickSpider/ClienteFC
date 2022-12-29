#!/bin/bash

rm jar/ClienteFC2.jar
rm jar/ClienteFC.jar
ant build-jar2
ant build-jar

cp jar/ClienteFC2.jar ~/numeroM/proyectos/vidrioluz/WEB-INF/lib/ClienteFC2.jar 
cp jar/ClienteFC2.jar ~/JaspersoftWorkspace/MyReports/lib/ClienteFC2.jar 



