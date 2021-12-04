package com.java_8_training.examples.design.practical;

import java.util.ArrayList;
import java.util.List;

/**
 * .
 */
public class SecurityTrigger
{

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer)
    {
        observers.add(observer);
    }

    public void remove(Observer observer)
    {
        observers.remove(observer);
    }

    public void alert(String room)
    {
        observers.forEach(observer -> observer.onAlert(room));
    }

    public static void main(String[] args)
    {
        SecurityTrigger alerter = new SecurityTrigger();

        alerter.add(SecurityTrigger::phoneSystem);
        alerter.add(SecurityTrigger::securityAlert);

        alerter.alert("Lounge");

        alerter.remove(SecurityTrigger::securityAlert);

        alerter.alert("Dining Room");
    }

    private static void securityAlert(String room)
    {
        System.err.println("Intruder in room: " + room);
    }

    private static void phoneSystem(String room)
    {
        System.out.println("Dialling 999 ...");
        System.out.println("Police Please");
        System.out.println("We've got an intruder in acasia avenue! Please come now!");
    }

}
