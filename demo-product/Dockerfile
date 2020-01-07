FROM openjdk:8
ADD build/libs/demo-product-0.0.1-SNAPSHOT.jar application.jar
EXPOSE 8081
RUN groupadd product &&  useradd product -m -s /bin/bash -g product
USER product
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "application.jar"]
