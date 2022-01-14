Kafka tutorial based on https://www.baeldung.com/spring-kafka


# Kafka commands:

List topics:
kafka-topics.sh --list --bootstrapServer kafka1:9093

create topic:
kafka-topics.sh --create --bootstrapServer kafka1:9093 --replication-factor 3 --partitions 1 --topic java-kafka-test-topic  

Describe topic:
kafka-topics.sh --describe --bootstrapServer kafka1:9093 --topic java-kafka-test-topic

Delete topic:
kafka-topics.sh --describe --bootstrapServer kafka1:9093 --topic java-kafka-test-topic

kafka-console-producer.sh --broker-list kafka1:9093 --topic java-kafka-test-topic

kafka-console-consumer.sh --bootstrap-server kafka1:9093 --from-beginning --topic java-kafka-test-topic 
kafka-console-consumer.sh --bootstrap-server kafka2:9094,kafka3:9095 --from-beginning --topic java-kafka-test-topic 

References:
* https://enmilocalfunciona.io/aprendiendo-apache-kafka-parte-3-configuracion-con-replicacion/