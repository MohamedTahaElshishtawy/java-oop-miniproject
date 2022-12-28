/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_system.project;

import java.util.ArrayList;

class Airports_Name {

    ArrayList<String> list;

    public Airports_Name() {
        this.list = new ArrayList<>();
        list.add("Cairo");
        list.add("Riyadh");
        list.add("Doha");
        list.add("Kabul");
        list.add("Tirana");
        list.add("Bogota");
        list.add("Dili");
        list.add("Prague");
        list.add("Philistine");
        list.add("Abu Dhabi");
    }

    public ArrayList<String> getList() {
        return list;
    }
}
 