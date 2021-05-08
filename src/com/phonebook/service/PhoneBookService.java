package com.phonebook.service;

import com.phonebook.dal.PhoneBookDB;
import com.phonebook.model.PhoneBook;

import java.util.Map;

public class PhoneBookService {
    PhoneBookDB phoneBookDB = new PhoneBookDB();

    public void add(PhoneBook phoneBook) throws Exception{
        phoneBookDB.add(phoneBook);
    }

    public PhoneBook find(String phone){
        return PhoneBookDB.phoneBookList.get(phone);
    }

    public void updateFile() throws Exception {
        phoneBookDB.saveFile();
    }

    public boolean remove(String phone) throws Exception{
        boolean result = phoneBookDB.remove(phone);
        phoneBookDB.saveFile();
        return result;
    }

    public void printPhoneBook(){
        for (Map.Entry<String,PhoneBook> entry : PhoneBookDB.phoneBookList.entrySet()){
            System.out.println(entry.getKey()+ " | " + entry.getValue().toStringInfo());
        }
    }

    public void loadData() throws Exception{
        phoneBookDB.readFile();
    }

    public int size(){
       return PhoneBookDB.phoneBookList.size();
    }
}
