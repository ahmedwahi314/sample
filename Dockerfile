FROM tomcat:9.0

ADD target/calculatorweb-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
#COPY target/calculatorweb-1.0-SNAPSHOT /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]

