FROM openjdk:8
ADD target/docker-demo.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]



#To use a Java container as both the build and runtime environment.
#FROM openjdk:8
#COPY . /usr/src/myapp
#WORKDIR /usr/src/myapp
#RUN javac Main.java
#CMD ["java", "Main"]
