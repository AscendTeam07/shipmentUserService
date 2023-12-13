
# Stage 2: Create the final image
FROM openjdk:8-jre-slim
VOLUME /tmp
WORKDIR /app
EXPOSE 9601
ARG JAR_FILE=target/shipmentUserService-0.0.1-SNAPSHOT.jar
COPY --from=build /app/${JAR_FILE} shipmentUserService.jar
ENTRYPOINT ["java","-jar","/shipmentUserService.jar"]
