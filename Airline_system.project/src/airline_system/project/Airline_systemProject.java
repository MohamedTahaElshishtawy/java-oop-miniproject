/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_system.project;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class Airline_systemProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Airports_Name airport = new Airports_Name();
        System.out.println("Welcome!");
        System.out.println("Our available Country airports to travel ");
        System.out.println(airport.list);
        System.out.println("Choose the suitable choise from the list");
        System.out.println("1-TO reserve a ticket click 1");
        System.out.println("2-To Exit click zero ");
        Scanner input = new Scanner(System.in);
        String x;
        System.out.println("Enter the selected number : ");
        x = input.next();

        switch (x) {
            case "1":
                System.out.println("Please,enter the name of passenger : ");
                String y;
                y = input.next();
                System.out.println("Please,enter the address of passenger : ");
                String z;
                z = input.next();
                System.out.println("Please,enter the number of the passenger reservation  : ");
                int q;
                q = input.nextInt();
                System.out.println("Please,From where you want to reserve the ticket : ");
                String m;
                m = input.next();
                System.out.println("Please,to where you want to reserve the ticket : ");
                String b;
                b = input.next();

                System.out.println("Please, enter the time of  the plane arrival : ");
                String t;
                t = input.next();
                System.out.println("Please,enter the flight capacity : ");

                int g;
                g = input.nextInt();
                System.out.println("Please,Write the date of flight ");
                String h;
                h = input.next();
                System.out.println("Please,enter todays date ");
                String v;
                v = input.next();

                Passenger psgn = new Passenger(y, z, q);
                shudele_flight shdl = new shudele_flight(m, b, t, g, h);
                Reservation rsv = new Reservation(psgn, shdl, v);

                break;

            case "2":
                System.out.println("Goodbye");
                break;

            default:
                System.out.println("invalid input value ");

        }

    }

}
