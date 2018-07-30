package com.arimac.SwaggerHub.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Miles {

    private int guest_miles;
    private int tier_miles;
    private int tier_segment;
    private String guest_name;
    private boolean tier_status;
    private int expiring_miles;

    public Miles() {
    }

    public Miles(int guest_miles, int tier_miles, int tier_segment, String guest_name, boolean tier_status, int expiring_miles) {
        this.guest_miles = guest_miles;
        this.tier_miles = tier_miles;
        this.tier_segment = tier_segment;
        this.guest_name = guest_name;
        this.tier_status = tier_status;
        this.expiring_miles = expiring_miles;
    }



    public int getGuest_miles() {
        return guest_miles;
    }

    public void setGuest_miles(int guest_miles) {
        this.guest_miles = guest_miles;
    }

    public int getTier_miles() {
        return tier_miles;
    }

    public void setTier_miles(int tier_miles) {
        this.tier_miles = tier_miles;
    }

    public int getTier_segment() {
        return tier_segment;
    }

    public void setTier_segment(int tier_segment) {
        this.tier_segment = tier_segment;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public boolean isTier_status() {
        return tier_status;
    }

    public void setTier_status(boolean tier_status) {
        this.tier_status = tier_status;
    }

    public int getExpiring_miles() {
        return expiring_miles;
    }

    public void setExpiring_miles(int expiring_miles) {
        this.expiring_miles = expiring_miles;
    }
}
