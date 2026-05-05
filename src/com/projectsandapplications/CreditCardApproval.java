package com.projectsandapplications;

import java.util.Scanner;

public class CreditCardApproval {
    static Scanner sc = new Scanner(System.in);

    static boolean getAadhaarCard() {
        System.out.println("Enter Aadhaar number:");
        String aadhaar = sc.next();
        return aadhaar.matches("\\d{12}");
    }

    static boolean getPanCard() {
        System.out.println("Enter PAN card:");
        String pan = sc.next();
        return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
    }

    static boolean getPhoneNo() {
        System.out.println("Enter phone number:");
        String phone = sc.next();
        return phone.matches("[6-9]\\d{9}");
    }

    static int getCibilScore() {
        System.out.println("Enter CIBIL score:");
        return sc.nextInt();
    }

    static double getMonthlyIncome() {
        System.out.println("Enter monthly income:");
        return sc.nextDouble();
    }

    static int getAge() {
        System.out.println("Enter age:");
        return sc.nextInt();
    }

    static String getEmploymentType() {
        System.out.println("Enter employment type (salaried/self-employed):");
        return sc.next();
    }

    static String getAddress() {
        System.out.println("Enter flat no:");
        String flat = sc.next();

        System.out.println("Enter plot no:");
        String plot = sc.next();

        System.out.println("Enter city:");
        String city = sc.next();

        System.out.println("Enter pin:");
        String pin = sc.next();

        return "Flat: " + flat + ", Plot: " + plot + ", City: " + city + ", Pin: " + pin;
    }

    public static void main(String[] args) {
        System.out.println("*** Credit Card Approval System ***");

        int cibil = getCibilScore();
        double income = getMonthlyIncome();
        int age = getAge();
        String employment = getEmploymentType();

        boolean pan = getPanCard();
        boolean aadhaar = getAadhaarCard();
        boolean phone = getPhoneNo();
        String address = getAddress();

        if (pan && aadhaar && phone) {
            if (cibil >= 750 && income >= 15000 && age >= 21) {
                System.out.println("Entered into verification stage...");

                if (employment.equalsIgnoreCase("salaried") || 
                    employment.equalsIgnoreCase("self-employed")) {

                    System.out.println(" Congratulations! Credit Card Approved!");

                    if (cibil > 800) {
                        System.out.println(" You are eligible for PREMIUM Credit Card");
                    } else {
                        System.out.println(" You are eligible for BASIC Credit Card");
                    }

                } else {
                    System.out.println(" Employment type not valid");
                }

            } else {
                System.out.println(" Credit Card Rejected (Low CIBIL / Income / Age)");
            }
        } else {
            System.out.println(" Invalid Documents");
        }
    }
}


