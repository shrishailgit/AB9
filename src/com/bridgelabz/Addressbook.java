package com.bridgelabz;

import java.util.ArrayList;

import java.util.Scanner;

public class Addressbook {

	Contact person;
    Scanner sc = new Scanner(System.in);

    
    ArrayList<Contact> list = new ArrayList<Contact>();
    
    public void add(){
    	
    	
       person = new Contact();

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code : ");
        Long zipCode = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNum = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail : ");
        String email = sc.nextLine();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZip(Math.toIntExact(zipCode));
        person.setPhoneNumber(String.valueOf(phoneNum));
        person.setEmail(email);

        System.out.println(person);
    }

}
