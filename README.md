# Dierenarts praktijk assessment applicatie

De applicatie is gebouwd met java 21, maven en spring-boot.

Een in memory H2 database wordt gestart met de applicatie. Wijzigingen in de database gaan verloren bij het opnieuw opstarten van de applicatie.

De applicatie kan opgestart worden met een IDE of
```bash
mvn spring-boot:run
```
of 
```bash
mvn package
java -jar target/veterinary-clinic-0.0.1-SNAPSHOT.jar
```
