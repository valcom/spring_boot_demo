FROM eclipse-temurin:17.0.7_7-jre-alpine
RUN mkdir /opt/app
COPY target/spring-boot.jar /opt/app
EXPOSE 8080
CMD ["java", "-jar", "/opt/app/spring-boot.jar","--spring.config.location=/opt/config/application.properties"]