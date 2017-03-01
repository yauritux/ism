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

1. Build the sources through one single [maven](https://maven.apache.org), i.e. `mvn clean package`
2. Build the docker image as following: `docker build --tag=yauritux/ism .`

## Running
1. `docker run --rm=true yauritux/ism`

# Issues

Please report any issues or file RFEs on [GitHub](https://github.com/yauritux/ism/issues)

