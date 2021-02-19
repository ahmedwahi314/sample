FROM jamesdbloom/docker-java8-maven AS maven_builder
WORKDIR /build
COPY pom.xml .

COPY src/ /build/src
RUN mvn clean install


FROM openjdk:8-jre

COPY --from=maven_builder /build/target/calculator-1.0-SNAPSHOT.jar .
COPY input.txt .

#We can either use CMD or ENTRYPOINT. But for the sake of trying all possible commands

CMD java -cp calculator-1.0-SNAPSHOT.jar:/build/target/classes/ Driver < ./input.txt

#ENTRYPOINT ["java","-cp" ,"calculator-1.0-SNAPSHOT.jar:/build/target/classes", "Driver"]
