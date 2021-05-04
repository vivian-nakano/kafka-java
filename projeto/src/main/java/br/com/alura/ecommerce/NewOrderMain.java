package br.com.alura.ecommerce;

import org.apache.kafka.clients.producer.KafKaProducer;

public class NewOrderMain {

    public static void main(String[] args) {

        var producer = new KafkaProducer<String, String>(properties());
        var value = "123","155","1555";
        var record = new ProducerRecord<>(topic:"ECOMMERCE_NEW_ORDER", value, value);
        producer.send(record);
    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }
}
