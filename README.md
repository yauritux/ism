# ISM 
Integrated Scoring Model Implementation in Jython

You can find all Jython sources within `src/main/resources/Lib`

Jython sources will be wrapped and exposed through EJB (Session bean).

# Usage

## Prerequisites
1. [Maven](https://maven.apache.org)
2. [Docker](https://docs.docker.com/engine/installation/)
3. [PostgreSQL](https://www.postgresql.org/)

## Deployments

1. Build the sources through one single [maven](https://maven.apache.org) command, i.e. `mvn clean package`
2. Build the docker image using this command: `docker build --tag=yauritux/ism .`

## Running
1. `docker run --rm=true --name ism-engine -p 8080:8080 -p 9990:9990 -it yauritux/ism`
2. If you're using [Docker](https://www.docker.com) with *Linux* as your operating system, then you can check the IP Address of your running docker instance by using this command: `docker inspect -f '{{ .NetworkSettings.IPAddress }}' ism-engine`
3. If you're using [Docker](https://www.docker.com) with operating system other than *Linux*, then you can check the IP Address of your running docker instance as follow:
```sh
docker-machine ip
```

# Issues

Please report any issues or file RFEs on [GitHub](https://github.com/yauritux/ism/issues)

