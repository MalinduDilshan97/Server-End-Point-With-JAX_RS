package com.arimac.SwaggerHub.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Card {

    private String name;
    private String cardNumber;

    public Card() {
    }

    public Card(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
