/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialgraphui.model;

/**
 *
 * @author andrejgajdos
 */
public class Discussion extends Message{
    
    // source of discussion message like name of website
    String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    
}
