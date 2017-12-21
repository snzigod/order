@echo off
SET APP_MAINCLASS=com.sn.smart.order.Provider
SET JMX_OPTS= -Xms128m -Xmx512m
SET WD=%~d0%~p0
SET APP_HOME=%WD%..
SET APP_HOME_CP=%APP_HOME%;%APP_HOME%/*;%APP_HOME%/lib/*;
java -cp %APP_HOME_CP% %JMX_OPTS% %APP_MAINCLASS%
@pause
