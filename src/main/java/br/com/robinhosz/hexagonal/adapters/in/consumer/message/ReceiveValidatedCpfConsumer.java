package br.com.robinhosz.hexagonal.adapters.in.consumer.message;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @KafkaListener(topics = "tp-cpf-validation", groupId = "robinhosz")
    public void receive(CustomerMessage customerMessage) {
        System.out.println("Received message: " + customerMessage);

        //Send message receive to updateCustomerPort
    }

}
