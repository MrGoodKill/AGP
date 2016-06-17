@echo off
SET CLASSPATH=.;.\antlr-4.5-complete.jar;%CLASSPATH%
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun =java org.antlr.v4.runtime.misc.TestRig $*
start antlr4 Hello.g4
echo Wait for it...
ping 192.0.2.2 -n 1 -w 1500 > nul
javac Hello*.java -verbose
echo.
echo.
echo Termine !
echo.
echo.
grun Hello r -gui test.txt