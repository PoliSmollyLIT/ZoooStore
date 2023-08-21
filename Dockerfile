FROM openjdk:17
RUN mkdir /zoostoreApp
WORKDIR /zoostoreApp
COPY rest/target/ZoooStoreApplication.jar /zoostoreApp/zoo-store.jar
CMD ["java","-jar","zoo-store.jar"]
EXPOSE 8080