FROM java:8

EXPOSE 8080

ADD target/nike.jar nike.jar

ENTRYPOINT ["java", "-jar", "nike.jar"]