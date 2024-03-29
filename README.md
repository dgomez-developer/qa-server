# Questions&amp;Answers server

Repository that stores the source code of the Q&amp;A server.

Very simple Spring Boot server coded in Kotlin that uses Gradle as dependencies manager.

The API support REST & GraphQL requests.

Contains a Procfile to deploy the server in Heroku.

## How to run

```aidl
./gradlew bootRun
```

The following documentation will be available:

* Swagger documentation: http://localhost:500/swagger-ui.html.
* GraphQL server: http://localhost:5000/graphql
* GraphQL Playground: http://localhost:5000/playground
* GraphiQL: http://localhost:5000/graphiql
* GraphQL Voyager: http://localhost:5000/voyager



## License

    Copyright 2019 Debora Gomez

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
