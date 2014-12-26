/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraphui.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrejgajdos
 */
public class Account {
    
    int id;
    
    List<String> firstNames = new ArrayList<>();
    List<String> surnames = new ArrayList<>();
    List<String> nicknames = new ArrayList<>();
    List<String> eMails = new ArrayList<>();
    List<String> phoneNumbers = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(List<String> firstNames) {
        this.firstNames = firstNames;
    }

    public List<String> getSurnames() {
        return surnames;
    }

    public void setSurnames(List<String> surnames) {
        this.surnames = surnames;
    }

    public List<String> getNickNames() {
        return nicknames;
    }

    public void setNickNames(List<String> nickNames) {
        this.nicknames = nickNames;
    }

    public List<String> geteMails() {
        return eMails;
    }

    public void seteMails(List<String> eMails) {
        this.eMails = eMails;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    
}
