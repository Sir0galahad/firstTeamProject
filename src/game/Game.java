/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author millc9988
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader file = null;
        try{
            URL url = Game.class.getResource("Input.txt");
            
            //creating a file reader
            file = new FileReader(url.getFile());
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        Scanner in = new Scanner(file);
        int num = in.nextInt();
        in.nextLine();
        Contact[] Contacts = new Contact[num];
        for (int i = 0; i < num; i++) {
            String name = in.next();
            String phoneNumber = in.next();
            String email = in.nextLine();
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNum(phoneNumber);
            Contacts[i]=c;
        }
        for (int i = 0; i < Contacts.length; i++) {
            System.out.println(Contacts[i].toString());
        }
    }
}
