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
public class Email extends Message{
    
    String subject;
    
    // true if email wasnt created from qotation
    boolean isOriginal;
    
    // names of attachemnts in email message
    List<String> attachments = new ArrayList<>();
    
    // recepients not to be disclosed to other recepients
    List<String> bCC = new ArrayList<>();
    
    // secondary, informational recepients
    List<String> cC = new ArrayList<>();

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public List<String> getbCC() {
        return bCC;
    }

    public void setbCC(List<String> bCC) {
        this.bCC = bCC;
    }

    public List<String> getcC() {
        return cC;
    }

    public void setcC(List<String> cC) {
        this.cC = cC;
    }
    
}
