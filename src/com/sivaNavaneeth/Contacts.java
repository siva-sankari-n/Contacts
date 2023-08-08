package com.sivaNavaneeth;

import java.util.ArrayList;

public class Contacts {
    private String phonenumber;
    private String name;

    private ArrayList<String> contactnumber=new ArrayList<>();

     public void store(String name){

          contactnumber.add(name);
     }
     public int findcontacts (String contact){
         return this.contactnumber.indexOf(contact);
     }
}
