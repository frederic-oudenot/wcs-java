package com.wild;

public class ClassRoom {
    public static void main(String[] args) {
        Wild jc = new Wild("Jean-Claude", true);
        Wild henri = new Wild("Henri", false);

        System.out.println(jc.whoIAm());
        System.out.println(henri.whoIAm());

    }
}
