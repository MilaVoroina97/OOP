package OOP_all.lections.lec5.Task2.Core.MVP;

import OOP_all.lections.lec5.Task2.Core.Models.Contact;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, String pathDb){
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile(){

        model.load();
        if(model.getPhonebook().count() > 0){
            model.setCurrentIndex(0);
            var contact = model.currentContact();
            view.setFirstName(contact.name);
            view.setLastName(contact.lastName);
            view.setNumber(contact.numberPhone);
            view.setDescription(contact.description);
        }

    }

    public void addToModel(){
        model.getPhonebook().addContact(new Contact(view.getFirstName(), view.getLastName(), view.getNumber(), view.getDescription()));
    }

    public void remove(){
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getNumber(), view.getDescription());
        model.getPhonebook().removeContact(contact);
        if(model.phonebook.count() < 1){
            model.setCurrentIndex(-1);
            view.setFirstName("");
            view.setLastName("");
            view.setNumber("");
            view.setDescription("");
        }else{

            model.setCurrentIndex(model.getCurrentIndex()-1);
            if(model.getCurrentIndex() < 0) model.setCurrentIndex(0);
            Contact temp = model.currentContact();
            view.setFirstName(temp.name);
            view.setLastName(temp.lastName);
            view.setNumber(temp.numberPhone);
            view.setDescription(temp.description);
        }

    }

    public void saveToFile(){
        model.save();
    }

    public void next(){
        if(model.getCurrentIndex() > 0){
            if(model.getCurrentIndex() + 1 < model.getPhonebook().count()){
                model.setCurrentIndex(model.getCurrentIndex()+1);
                Contact temp = model.currentContact();
                view.setFirstName(temp.name);
                view.setLastName(temp.lastName);
                view.setNumber(temp.numberPhone);
                view.setDescription(temp.description);
            }
        }

    }

    public void prev(){

        if(model.getCurrentIndex() > 0){
            if(model.getCurrentIndex() - 1 > -1){
                model.setCurrentIndex(model.getCurrentIndex()-1);
                Contact temp = model.currentContact();
                view.setFirstName(temp.name);
                view.setLastName(temp.lastName);
                view.setNumber(temp.numberPhone);
                view.setDescription(temp.description);

            }
        }

    }


    
}
