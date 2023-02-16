package OOP_all.lections.lec5.Task2.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import OOP_all.lections.lec5.Task2.Core.Infrastructure.Phonebook;
import OOP_all.lections.lec5.Task2.Core.Models.Contact;

public class Model {

    public Phonebook phonebook;
    private int currentIndex;
    private String path;

    public Model(String path){
        this.path = path;
        phonebook = new Phonebook();
        currentIndex = 0;
    }

    public Phonebook getPhonebook(){
        
        return this.phonebook;
    }

    public int getCurrentIndex(){
        return this.currentIndex;
    }

    public void setCurrentIndex(int index){
        this.currentIndex = index;
    }

    public Contact currentContact(){

        if(currentIndex >= 0){
            return phonebook.getContact(currentIndex);
        }
        return null;
    }

    public void load(){
        try{

            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String fname = bf.readLine();
            while(fname!=null){
                
                String lname = bf.readLine();
                String description = bf.readLine();
                String number = bf.readLine();
                this.phonebook.addContact(new Contact(fname,lname,number,description));
                fname = bf.readLine();
            }

            bf.close();
            fr.close();
        }catch(Exception e){

            e.printStackTrace();
        }
    }

    public void save(){

        try(FileWriter fileWriter = new FileWriter(path,false)){

            for(int i = 0 ; i < phonebook.count(); i++){
                Contact contact = phonebook.getContact(i);
                fileWriter.append(String.format("%s\n", contact.name));
                fileWriter.append(String.format("%s\n", contact.lastName));
                fileWriter.append(String.format("%s\n",contact.numberPhone));
                fileWriter.append(String.format("%s\n", contact.description));
            }

            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    
}
