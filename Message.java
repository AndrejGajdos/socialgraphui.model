/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraphui.model;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andrejgajdos
 */
public class Message {
    
    int id;
    MessageType type;
    Calendar date;
    Account sender;
    Account recepient;
    String text;
    
    // all message keywords
    Map<Integer, Collection<String>> keywords = new HashMap<>();

    public Message() {
        
        if (this instanceof Email)
            this.type = MessageType.MAIL;
        if (this instanceof PhoneCall)
            this.type = MessageType.PHONE;
        if (this instanceof Discussion)
            this.type = MessageType.DISCUSSION;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getRecepient() {
        return recepient;
    }

    public void setRecepient(Account recepient) {
        this.recepient = recepient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<Integer, Collection<String>> getKeywords() {
        return keywords;
    }

    public void setKeywords(Map<Integer, Collection<String>> keywords) {
        this.keywords = keywords;
    }
    
}
