RUN /bin/bash -c "/usr/bin/mysqld_safe --skip-grant-tables &" && \
  sleep 5 && \
  mysql -u root -e "CREATE DATABASE bazaar" && \
FROM openjdk:8
ADD target/spring-boot.jar spring-boot.jar
EXPOSE 8111
ENTRYPOINT ["java","-jar","spring-boot.jar"]

