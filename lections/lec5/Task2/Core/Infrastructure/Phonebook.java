package OOP_all.lections.lec5.Task2.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import OOP_all.lections.lec5.Task2.Core.Models.Contact;

public class Phonebook {

    private List<Contact> contacts;
    public Phonebook(){
        contacts = new ArrayList<Contact>();
    }
    public boolean addContact(Contact contact){

        boolean added = false;
        if(!contacts.contains(contact)){
            contacts.add(contact);
            added = true;
        }else System.out.println("This contact already in your phonebook.");
        return added;

    }

    public Contact getContact(int index){
        for(int i = 0; i < contacts.size(); i++){
            if(i == index) return contacts.get(index);
            else System.out.println("There is not such index");
        }
        return null;
    }

    public void updateContact(int index, Contact newContact) throws IndexOutOfBoundsException{
        if(index < 0 || index > this.contacts.size())
            System.out.printf("Index %d out of bounds for length %d\n", index, this.contacts.size());
        else{
            for(int i = 0; i < contacts.size(); i++){
                if(i == index){
                contacts.set(index, newContact);
                break;
                }
            }
        }
    }


    public boolean removeContact(Contact contact){
        boolean removed = false;
        if(contacts.indexOf(contact) != -1){

            contacts.remove(contact);
            removed = true;
        }
        return removed;
    }

    public List<Contact> getAllContacts(){
        return contacts;
    }

    public int count(){
        return contacts.size();
    }
}
