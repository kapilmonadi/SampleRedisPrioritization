# SampleRedisPrioritization
A sample Spring Boot project to showcase implementation of Prioritization logic with the help of Redis / Redisson client library

## Running Redis locally using Docker image
### Plain vanilla Redis (for using as a simple key value store)
docker run -d -p 6379:6379 --name kapil-local-redis redis

### Redis Stack (Includes Redis Server, Redis Insight and few other modules)
docker run -d -p 6379:6379 -p 8001:8001 --name kapil-local-redis-stack redis/redis-stack:latest

## Configuring Spring Boot application to connect to the locally running instance of redis
### Add the following to application.properties / application.yml
 - spring.data.redis.host=localhost
 - spring.data.redis.port=6379

