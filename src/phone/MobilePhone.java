/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.ArrayList;

/**
 *
 * @author Osvaldo
 */
public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        contacts = new ArrayList<Contact>();
    }
    
    public boolean addContact (Contact contact){
        if(findContact(contact.getName()) == -1){
            contacts.add(contact);
            return true;
        }
        return false;
    }
    
    public boolean removeContact(String name, String number){
        return removeContact(new Contact(name,number));
    }
    
    public boolean removeContact(String name){
        return removeContact(new Contact(name,"654984516"));
    }
    
    public boolean addContact (String name, String number){
        return addContact(new Contact(name,number));
    }
    
    
    public boolean removeContact (Contact contact){
        int position = findContact(contact.getName());
        if (position == -1){
            return false;
        }
        contacts.remove(position);
        return true;
    }
    
    public boolean updateContact(Contact contact){
        int position = findContact(contact.getName());
        if (position == -1){
            return false;
        }
        contacts.get(position).setName(contact.getName());
        contacts.get(position).setNumber(contact.getNumber());
        return true;
    }
    
    public boolean updateContact(String name, String number){
        return updateContact(new Contact(name,number));
    }
    
    public void listContact(){
        for(Contact temp : contacts){
            System.out.println(temp.toString());
        }
    }
    
    
    /*public Contact findContact(String name){
        for(Contact temp: contacts){
            if(temp.getName().equals(name)){
                return temp;
            }
            
        }
        return null;
    }*/
    
    public int findContact(String name){
        for(int i=0; i <contacts.size(); i++){
            if(contacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(String name){
        int position = findContact(name);
        if(position ==1){
            return "Conact not found";
        }else{
            return contacts.get(position).toString();
        }
    }

}
