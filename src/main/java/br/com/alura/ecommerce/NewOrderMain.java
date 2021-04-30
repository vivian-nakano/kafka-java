package br.com.alura.ecommerce;

import org.apache.kafka.clientes.producer.KafKaProducer;

public class NewOrderMain {

    public static void main(String[] args) {
        var producer = new KafkaProducer<String, String>(properties());
    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, )
    }
}
