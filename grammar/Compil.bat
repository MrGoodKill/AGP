@echo off
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
pause
