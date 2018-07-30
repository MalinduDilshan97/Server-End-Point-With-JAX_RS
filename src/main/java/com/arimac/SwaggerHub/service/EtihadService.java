package com.arimac.SwaggerHub.service;



import com.arimac.SwaggerHub.model.*;

import java.util.*;


public class EtihadService {



    public User enrolment(User user){
        return user;
    }

    public List<Preferences> getAllPreference(){
        List<Preferences> preferencesList= new ArrayList<>();
        Preferences preferences= new Preferences("123","123","123");
        Preferences preferences2= new Preferences("1234","1234","1234");
        preferencesList.add(preferences);
        preferencesList.add(preferences2);
        return preferencesList;
    }

    public boolean updatePreference(){
        return true;
    }

    public Map<String,Object> getUserData(){
        Map<String,Object> map= new HashMap<>();
        //List<User> objectList= new ArrayList<>();
        User user= new User(1,"j","j","d","s","w","s","s","2");
        Miles miles= new Miles(1,2,3,"j",true,4);
        map.put("User",user);
        map.put("Miles",miles);
        return map;
    }

    public Transaction getTransaction(){
        Transaction transaction= new Transaction(1,"222",23.9);
        return transaction;
    }

    public List<Card> getCards(){
        List<Card> cards= new ArrayList<>();
        Card card= new Card("HSBC Visa Card","43524235423455");
        cards.add(card);
        return cards;
    }

    public Reward getReward(){
        Reward reward= new Reward(1,2,"1332","2234","222222");
        return reward;
    }

    public Chat userChat(){
        Chat chat= new Chat(1111,"Do you want to get more details about your miles?");
        return chat;

    }

}
