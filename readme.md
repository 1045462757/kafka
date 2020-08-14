## kafka启动

### 1.启动zookeeper
    ./bin/windows/zookeeper-server-start.bat ./config/zookeeper.properties
    
### 2.启动kafka
    ./bin/windows/kafka-server-start.bat ./config/server.properties
     
### 3.创建主题
    .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
     
### 4.启动生产者
    .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test
     
### 5.启动消费者
    .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
     
### 6.查看主题
    .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092