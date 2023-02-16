package OOP_all.lections.lec5.Task2.Core.Models;

public class Contact implements Comparable<Contact>{

    public String name;
    public String lastName;
    public String numberPhone;
    // public String company;
    public String description;

    public Contact(String firstName, String lastName, String numberPhone,String description) {
        this.name = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.description = description;
    }

    @Override
    public int compareTo(Contact o) {

        return Integer.compare(this.numberPhone.length(), o.numberPhone.length());
    }

    @Override
    public boolean equals(Object obj){
        Contact t = (Contact) obj;
        return this.name == t.name && this.lastName == t.lastName;
    }
    
}
