# FROM websphere-liberty:full-java11-openj9
FROM websphere-liberty:webProfile8
COPY --chown=1001:0  ./build/libs/java-ee-core.war /config/dropins/app.war
COPY --chown=1001:0  ./src/main/liberty/config/server.xml /config/
RUN configure.sh
