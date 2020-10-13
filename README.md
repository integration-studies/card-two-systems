# Card Two

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `card-two-systems-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/card-two-systems-1.0-SNAPSHOT-runner.jar`.

## Docker Build

### JVM

```shell script
docker build -f src/main/docker/Dockerfile.jvm -t claudioed/card-two .
```

### NATIVE

Build Artifact

```shell script
mvn package -Pnative -Dquarkus.native.container-build=true
```

Build image
```shell script
# docker build -f src/main/docker/Dockerfile.native -t claudioed/card-two:native .
```