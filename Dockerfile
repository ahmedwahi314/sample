FROM jamesdbloom/docker-java8-maven AS maven_builder
WORKDIR /build
COPY pom.xml .

COPY src/ /build/src
RUN mvn clean install


FROM openjdk:8-jre

COPY --from=maven_builder /build/target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar .
COPY input.txt .

#We can either use CMD or ENTRYPOINT. But for the sake of trying all possible commands

CMD java -jar calculator-1.0-SNAPSHOT-jar-with-dependencies.jar < ./input.txt
#ENTRYPOINT ["java","-jar" ,"calculator-1.0-SNAPSHOT.jar", "Driver"]
