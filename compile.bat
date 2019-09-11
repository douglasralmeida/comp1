SETLOCAL

SET "ECLIPSE_PATH=D:\eclipse"
SET "ECLIPSE_JAR=plugins\org.eclipse.jdt.core_3.18.0.v20190522-0428.jar"

java -jar %ECLIPSE_PATH%\%ECLIPSE_JAR% -d bin\ src\pacotePrincipal\

ENDLOCAL