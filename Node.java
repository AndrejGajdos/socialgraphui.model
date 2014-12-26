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
public class Node {
    
    int id;
    
    // value is used for counting node size in visualization
    int radius;
    
    // true if nodes account is processed
    boolean central;
    
    Account acc;
    
    // first occurence in communication
    Calendar firstOccurence;
    
    // last occurence in communication
    Calendar lastOccurence;
    
    Map<Integer, Collection<String>> keywords = new HashMap<>();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isCentral() {
        return central;
    }

    public void setCentral(boolean isCentral) {
        this.central = isCentral;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }
    
    public Calendar getFirstOccurence() {
        return firstOccurence;
    }

    public void setFirstOccurence(Calendar firstOccurence) {
        this.firstOccurence = firstOccurence;
    }

    public Calendar getLastOccurence() {
        return lastOccurence;
    }

    public void setLastOccurence(Calendar lastOccurence) {
        this.lastOccurence = lastOccurence;
    }

    public Map<Integer, Collection<String>> getKeywords() {
        return keywords;
    }

    public void setKeywords(Map<Integer, Collection<String>> keywords) {
        this.keywords = keywords;
    }
    
}
