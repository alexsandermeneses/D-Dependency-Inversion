package org.example;

import org.example.payment.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}