/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class Phone {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myPhone = new MobilePhone();
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int option;
        printMenu();
        option =scanner.nextInt();
        while(option>0 && option < 7){
            switch(option){
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:    
                    removeContact();
                    break;
                case 4:  
                    queryContact();
                    break;
                case 5:
                    listContact();
                    break;
                case 6:
                    printMenu();
                    break;
                default:
                    break;
            }
            System.out.println("Option? ");
            option = scanner.nextInt();
        }
        
    }
    
    public static void printMenu(){
        System.out.println(" Menu : ");
        System.out.println(" 0. Quit ");
        System.out.println(" 1. Add Conact");
        System.out.println(" 2. Update Contact");
        System.out.println(" 3. Delete Conact");
        System.out.println(" 4. Query Contacts");
        System.out.println(" 5. List all Contacts");
        System.out.println(" 6. Print Options");
        System.out.print("Option? ");
    }
    
    public static void addContact(){
        Scanner leer = new Scanner(System.in);
        String name,number;
        System.out.print("Contact name :");
        name = leer.nextLine();
        System.out.print("Conact number: ");
        number = leer.nextLine();
        
        if(myPhone.addContact(name,number)){
            System.out.println("Contact sucessfully added");
        }else{
            System.out.println("Contact already in list");
        }
    }
    
    public static void updateContact(){
        Scanner leer = new Scanner(System.in);
        String name,number;
        System.out.print("Contact name : ");
        name = leer.nextLine();
        System.out.print("Conact new number: ");
        number = leer.nextLine();
        
        if(myPhone.updateContact(name, number)){
            System.out.println("Contact sucessfully updated");
        }else{
            System.out.println("Contact not found in list");
        }
    }
    
    public static void removeContact(){
        Scanner leer = new Scanner(System.in);
        String name,number;
        System.out.print("Contact name :");
        name = leer.nextLine();
        
        if(myPhone.removeContact(name)){
            System.out.println("Contact sucessfully remove");
        }else{
            System.out.println("Contact not found in list");
        }
    }
    
    public static void queryContact(){
        Scanner leer = new Scanner(System.in);
        String name,number;
        System.out.print("Contact name: ");
        name = leer.next();
        myPhone.queryContact(name);
    }
    
    public static void listContact(){
        myPhone.listContact();
    }

}
