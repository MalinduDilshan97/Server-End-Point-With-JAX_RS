package com.arimac.SwaggerHub.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Chat {

    private int chatId;
    private String response;

    public Chat() {
    }

    public Chat(int chatId, String response) {
        this.chatId = chatId;
        this.response = response;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
