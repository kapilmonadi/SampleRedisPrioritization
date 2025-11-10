# SampleRedisPrioritization
A sample Spring Boot project to showcase implementation of Prioritization logic with the help of Redis / Redisson client library

## Running Redis locally using Docker image
docker run -d -p 6379:6379 --name kapil-local-redis redis

## Configuring Spring Boot application to connect to the locally running instance of redis
### Add the following to application.properties / application.yml
 - spring.data.redis.host=localhost
 - spring.data.redis.port=6379

