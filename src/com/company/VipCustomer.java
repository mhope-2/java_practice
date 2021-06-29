package com.company;

/**
 *
 */
public class VipCustomer {

   private String name;
   private double creditLimit;
   private String emailAddress;

    public VipCustomer() {
        this("Michael", 289.09, "mhope@mhope.com");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
        System.out.println("Constructor with 2 args called");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Constructor with 3 args called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
