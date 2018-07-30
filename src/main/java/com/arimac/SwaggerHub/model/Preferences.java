package com.arimac.SwaggerHub.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Preferences {

    private String preference_1;
    private String preference_2;
    private String preference_3;

    public Preferences() {

    }

    public Preferences(String preference_1, String preference_2, String preference_3) {
        this.preference_1 = preference_1;
        this.preference_2 = preference_2;
        this.preference_3 = preference_3;
    }

    public String getPreference_1() {
        return preference_1;
    }

    public void setPreference_1(String preference_1) {
        this.preference_1 = preference_1;
    }

    public String getPreference_2() {
        return preference_2;
    }

    public void setPreference_2(String preference_2) {
        this.preference_2 = preference_2;
    }

    public String getPreference_3() {
        return preference_3;
    }

    public void setPreference_3(String preference_3) {
        this.preference_3 = preference_3;
    }
}
