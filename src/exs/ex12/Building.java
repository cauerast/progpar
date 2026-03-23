package exs.ex12;

import java.util.ArrayList;

public class Building {
    private String name;
    private String address;
    private ArrayList<Apartment> apartments;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
        this.apartments = new ArrayList<Apartment>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Apartment> getApartments() {
        return this.apartments;
    }

    public void setApartments(ArrayList<Apartment> apartments) {
        this.apartments = apartments;
    }

    public void buildApartment(int number, int layer){
        Apartment ap = new Apartment(number, layer);
        this.apartments.add(ap);
    }

    @Override
    public String toString() {
        return "\nBuilding ->" +
                "\n\tname: " + this.name +
                "\n\taddress: " + this.address +
                "\n\tapartments: " + this.apartments;
    }
}
