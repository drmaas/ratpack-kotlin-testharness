# ratpack-kotlin-testharness
Small test application for ratpack-kotlin dsl
## Run it
```
gradle clean shadowJar
java -jar build/libs/ratpack-kotlin-testharness-1.0-SNAPSHOT.jar
```
## Test it
```
curl localhost:9000/test;echo
```