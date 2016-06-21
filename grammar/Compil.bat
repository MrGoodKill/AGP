@echo off
SET CLASSPATH=.;.\antlr-4.5.3-complete.jar;%CLASSPATH%
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun =java org.antlr.v4.gui.TestRig $*
start antlr4 Hello.g4
echo Wait for it...
ping 192.0.2.2 -n 1 -w 1500 > nul
javac Hello*.java
echo.
echo.
echo Deplacement des fichiers .java
echo.
copy "HelloLexer.java" "../src/HelloLexer.java"
copy "HelloParser.java" "../src/HelloParser.java"
copy "HelloBaseListener.java" "../src/HelloBaseListener.java"
copy "HelloListener.java" "../src/HelloListener.java"
echo.
echo.
echo Fini !
echo.
echo.
grun Hello r -gui test.txt