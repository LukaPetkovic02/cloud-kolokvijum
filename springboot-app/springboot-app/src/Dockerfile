# Koristi se openjdk sličica kao osnova
FROM openjdk:11

# Kopira JAR fajl aplikacije u kontejner
COPY target/springboot-app.jar /app/springboot-app.jar

# Postavlja radni direktorijum
WORKDIR /app

# Izvršava Maven clean install komandu unutar kontejnera
RUN mvn clean install

# Izlaže port 8080
EXPOSE 8085

# Pokreće aplikaciju
CMD ["java", "-jar", "springboot-app.jar"]
