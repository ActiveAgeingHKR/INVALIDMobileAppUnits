package com.example.iuliu.aa;

import java.util.ArrayList;

/**
 * Created by Iuliu on 2016-10-18.
 */

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String adress;
    private String persNumber;
    private ArrayList <Medicine> customerMedicine;
    private ArrayList<Visitor> customerVisitor;
    private ArrayList<Incidents> customerIncidents;
    public Customer(String customerId, String firstName,String lastName,String birthDate, String adress,String persNumber){
        this.setCustomerId(customerId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthDate(birthDate);
        this.setAdress(adress);
        this.setPersNumber(persNumber);
        setCustomerMedicine(new ArrayList<Medicine>());
        setCustomerVisitor(new ArrayList<Visitor>());
        setCustomerIncidents(new ArrayList<Incidents>());


    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPersNumber() {
        return persNumber;
    }

    public void setPersNumber(String persNumber) {
        this.persNumber = persNumber;
    }

    public ArrayList<Medicine> getCustomerMedicine() {
        return customerMedicine;
    }

    public void setCustomerMedicine(ArrayList<Medicine> customerMedicine) {
        this.customerMedicine = customerMedicine;
    }

    public ArrayList<Visitor> getCustomerVisitor() {
        return customerVisitor;
    }

    public void setCustomerVisitor(ArrayList<Visitor> customerVisitor) {
        this.customerVisitor = customerVisitor;
    }

    public ArrayList<Incidents> getCustomerIncidents() {
        return customerIncidents;
    }

    public void setCustomerIncidents(ArrayList<Incidents> customerIncidents) {
        this.customerIncidents = customerIncidents;
    }
}

