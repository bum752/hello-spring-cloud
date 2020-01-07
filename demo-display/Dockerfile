FROM openjdk:8
ADD build/libs/demo-display-0.0.1-SNAPSHOT.jar application.jar
EXPOSE 8081
RUN groupadd display &&  useradd display -m -s /bin/bash -g display
USER display
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "application.jar"]
