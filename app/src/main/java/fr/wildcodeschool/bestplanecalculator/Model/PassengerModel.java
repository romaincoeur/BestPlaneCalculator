package fr.wildcodeschool.bestplanecalculator.Model;

/**
 * Created by romain on 03/01/17.
 */

public class PassengerModel {

    private float weight;
    private String name;

    public  PassengerModel (){}

    public PassengerModel(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
