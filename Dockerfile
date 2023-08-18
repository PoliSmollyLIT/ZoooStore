FROM openjdk:17
RUN mkdir /zoostoreApp
WORKDIR /zoostoreApp
COPY rest/target/ZoooStoreApplication.jar /zoostoreApp
CMD ["java","-jar","/zoostoreApp/ZoooStoreApplication.jar"]
EXPOSE 8080