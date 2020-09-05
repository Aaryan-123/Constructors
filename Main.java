package com.aaryanbhogale;

public class Main {

    public static void main(String[] args) {
        Account aaryansAccount = new Account();

        aaryansAccount.setNumber("34");
        aaryansAccount.setBalance(8.5);
        aaryansAccount.setCustomerEmailAddress("aaryanbhogale@gmail.com");
        aaryansAccount.setCustomerName("Aaryan Bhogale");
        aaryansAccount.setCustomerPhoneNumber("0123456789");

        aaryansAccount.withdrawal(100.0);
        System.out.println("");

        aaryansAccount.deposit(1000);
        aaryansAccount.withdrawal(2000);
        System.out.println("");

        aaryansAccount.deposit(1000);
        aaryansAccount.withdrawal(2000);

//    Account alankarsAccount = new Account();
//    alankarsAccount.deposit(100);
//    alankarsAccount.withdrawal(120);
    }
}
