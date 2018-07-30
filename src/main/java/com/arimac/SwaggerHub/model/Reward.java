package com.arimac.SwaggerHub.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reward {

    private int rewardId;
    private int miles;
    private String description;
    private String image;
    private String url;

    public Reward() {
    }

    public Reward(int rewardId, int miles, String description, String image, String url) {
        this.rewardId = rewardId;
        this.miles = miles;
        this.description = description;
        this.image = image;
        this.url = url;
    }

    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
