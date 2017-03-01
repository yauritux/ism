FROM jboss/wildfly
MAINTAINER yauritux@gmail.com
ADD target/ism-1.0.0-jar-with-dependencies.jar /opt/jboss/wildfly/standalone/deployments/
RUN /opt/jboss/wildfly/bin/add-user.sh admin Admin#70365 --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
