@echo off
set ACTIVEMQ_HOME="/home/owpk/gh/apache-activemq-5.16.4"
set ACTIVEMQ_BASE="/home/owpk/gh/apache-activemq-5.16.4/bin/bridge/br-1"

set PARAM=%1
:getParam
shift
if "%1"=="" goto end
set PARAM=%PARAM% %1
goto getParam
:end

%ACTIVEMQ_HOME%/bin/activemq %PARAM%