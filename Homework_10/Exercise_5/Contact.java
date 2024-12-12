package Homework_10.Exercise_5;

import java.util.TreeMap;

public class Contact {
    private static TreeMap<String,Contact> contacts = new TreeMap<>();

    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
        contacts.put(name,this);
    }

    public void setName(String name) {
        if (!this.name.equals(name)){
            contacts.remove(this.name);
            contacts.put(name,this);
            this.name = name;
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static TreeMap<String, Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return name + " : " + number;
    }
}
