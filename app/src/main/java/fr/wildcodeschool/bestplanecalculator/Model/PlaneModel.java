package fr.wildcodeschool.bestplanecalculator.Model;

/**
 * Created by romain on 03/01/17.
 */

public class PlaneModel {

    private String name;
    private float weightMin;
    private float weightMax;
    private float maxFuel;
    private float luggage;
    private float leverArmEmpty;
    private float leverArmForward;
    private float leverArmBackward;
    private float leverArmLuggage;
    private float leverArmFuel;
    private float densityFuel;
    private float leverMin;
    private float leverMax;

    public PlaneModel(float leverMax, String name, float weightMin, float weightMax, float maxFuel, float luggage, float leverArmEmpty, float leverArmForward, float leverArmBackward, float leverArmLuggage, float leverArmFuel, float densityFuel, float leverMin) {
        this.leverMax = leverMax;
        this.name = name;
        this.weightMin = weightMin;
        this.weightMax = weightMax;
        this.maxFuel = maxFuel;
        this.luggage = luggage;
        this.leverArmEmpty = leverArmEmpty;
        this.leverArmForward = leverArmForward;
        this.leverArmBackward = leverArmBackward;
        this.leverArmLuggage = leverArmLuggage;
        this.leverArmFuel = leverArmFuel;
        this.densityFuel = densityFuel;
        this.leverMin = leverMin;
    }

    public float getLeverMax() {
        return leverMax;
    }

    public void setLeverMax(float leverMax) {
        this.leverMax = leverMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeightMin() {
        return weightMin;
    }

    public void setWeightMin(float weightMin) {
        this.weightMin = weightMin;
    }

    public float getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(float weightMax) {
        this.weightMax = weightMax;
    }

    public float getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(float maxFuel) {
        this.maxFuel = maxFuel;
    }

    public float getLuggage() {
        return luggage;
    }

    public void setLuggage(float luggage) {
        this.luggage = luggage;
    }

    public float getLeverArmEmpty() {
        return leverArmEmpty;
    }

    public void setLeverArmEmpty(float leverArmEmpty) {
        this.leverArmEmpty = leverArmEmpty;
    }

    public float getLeverArmForward() {
        return leverArmForward;
    }

    public void setLeverArmForward(float leverArmForward) {
        this.leverArmForward = leverArmForward;
    }

    public float getLeverArmBackward() {
        return leverArmBackward;
    }

    public void setLeverArmBackward(float leverArmBackward) {
        this.leverArmBackward = leverArmBackward;
    }

    public float getLeverArmLuggage() {
        return leverArmLuggage;
    }

    public void setLeverArmLuggage(float leverArmLuggage) {
        this.leverArmLuggage = leverArmLuggage;
    }

    public float getLeverArmFuel() {
        return leverArmFuel;
    }

    public void setLeverArmFuel(float leverArmFuel) {
        this.leverArmFuel = leverArmFuel;
    }

    public float getDensityFuel() {
        return densityFuel;
    }

    public void setDensityFuel(float densityFuel) {
        this.densityFuel = densityFuel;
    }

    public float getLeverMin() {
        return leverMin;
    }

    public void setLeverMin(float leverMin) {
        this.leverMin = leverMin;
    }

}