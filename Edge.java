/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraphui.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andrejgajdos
 */
public class Edge {
    
    int id;
    
    // source node id
    int source;
    
    // tagret node id
    int target;
    
    // weight of link is used for counting edge size in visualization
    int linkWeight;
    
    // all edge messages
    List<Message> messages = new ArrayList<>();
    
    // all edge keywords
    Map<Integer, Collection<String>> keywords = new HashMap<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getLinkWeight() {
        return linkWeight;
    }

    public void setLinkWeight(int linkWeight) {
        this.linkWeight = linkWeight;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Map<Integer, Collection<String>> getKeywords() {
        return keywords;
    }

    public void setKeywords(Map<Integer, Collection<String>> keywords) {
        this.keywords = keywords;
    }
    
}
