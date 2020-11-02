# quarkus-openapi
Testing some dynamic processing of OpenAPI to reduce the number of annotations needed.  Will be injecting ur from `application.properties` into the run-time generated `openapi` file as well, to be able to use swagger-ui against dev/test/prod environments.

- [x] Generation of OpenAPI definitions for /hello
- [x] Include static `main/resources/META-INF/openapi.yaml` containing /byebye definition
- [x] Security is also included in static `main/resources/META-INF/openapi.yaml`
- [x] Defines security schems for basic auth, api key, oauth2 and oidc
- [x] OAS filter to change oauth2 authorizationUrl based on run-time properties (or ENV)
- [x] Setting documentation using `mp.openapi.extensions.smallrye` properties

Access the openapi file using `curl` below or test the openapi using the [swagger-ui](http://localhost:8080/swagger-ui/).
```
curl http://localhost:8080/openapi
```

## Running the application in dev mode (Java 11+)
You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```
