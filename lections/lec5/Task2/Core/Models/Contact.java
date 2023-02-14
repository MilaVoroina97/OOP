package OOP_all.lections.lec5.Task2.Core.Models;

public class Contact implements Comparable<Contact>{

    public String name;
    public String lastName;
    public int numberPhone;
    public String company;
    public String description;

    public Contact(String firstName, String lastName, int numberPhone,String company,String description) {
        this.name = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.description = description;
    }

    @Override
    public int compareTo(Contact o) {

        return 0;
    }

    @Override
    public boolean equals(Object obj){
        Contact t = (Contact) obj;
        return this.name == t.name && this.lastName == t.lastName;
    }
    
}
