package fr.wildcodeschool.bestplanecalculator.Model;

/**
 * Created by romain on 03/01/17.
 */

public class PassengerModel {

    private float weight;
    private String name;
    private String spot;

    public  PassengerModel (){}

    public PassengerModel(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSpot(){
        return this.spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }
}
