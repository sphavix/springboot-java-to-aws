FROM eclipse-temurin:17-jdk-alpine
LABEL authors="siphamandla.zolakhe"
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/springboot-java-service.jar springboot-java-service.jar
ENTRYPOINT ["java", "-jar", "/springboot-java-service.jar"]