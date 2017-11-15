/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author millc9988
 */
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    
    public Contact(String name){
        this.name = name;
    }
    
    public void setNum(String num){
        this.phoneNumber = num;
    }
    public void setEmail(String mail){
        this.email = mail;
    }
    @Override
    public String toString(){
        String format = this.name + "\n";
        format += "Phone: "+this.phoneNumber+"\n";
        format += "Email: "+this.email+"\n";
        return format;
    }
}
