# Java - Kafka tutorial
Kafka tutorial: https://www.baeldung.com/spring-kafka

## To deploy Kafka cluster in Docker:

Execute in terminal ´docker-compose up´ with the file /src/main/resources/kafka_docker/docker-compose.yaml

### /etc/hosts:

Insert in the file '/etc/hosts' the following hostname kafka1 kafka2 kafka3 kafka4:

'127.0.0.1 localhost sonarqube kafka1 kafka2 kafka3'

## To test the application

### Publish a message

curl --location --request POST 'http://localhost:8090/api/' \
    --header 'Content-Type: application/json' \
    --data-raw 'mensaje-test'

## Kafka commands:

### List topics:

kafka-topics.sh --list --bootstrapServer kafka1:9093

### create topic:

kafka-topics.sh --create --bootstrapServer kafka1:9093 --replication-factor 3 --partitions 1 --topic
java-kafka-test-topic

### Describe topic:

kafka-topics.sh --describe --bootstrapServer kafka1:9093 --topic java-kafka-test-topic

### Delete topic:

kafka-topics.sh --describe --bootstrapServer kafka1:9093 --topic java-kafka-test-topic

### Create producer

kafka-console-producer.sh --broker-list kafka1:9093 --topic java-kafka-test-topic

### Create consumer

kafka-console-consumer.sh --bootstrap-server kafka1:9093 --from-beginning --topic java-kafka-test-topic

References:

* https://enmilocalfunciona.io/aprendiendo-apache-kafka-parte-3-configuracion-con-replicacion/