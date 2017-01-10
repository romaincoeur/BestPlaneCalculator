package fr.wildcodeschool.bestplanecalculator.Model;

import android.widget.Switch;

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
    private PassengerModel passenger1, passenger2, passenger3, passenger4;



    public PlaneModel(float leverMin, float leverMax, String name, float weightMin, float weightMax, float maxFuel, float leverArmEmpty, float leverArmForward, float leverArmBackward, float leverArmLuggage, float leverArmFuel, float densityFuel) {
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
    public String optimizationOfTheYear(){
        float [][] matrice = new float[6][2];
        matrice[0]=fuelCenter(this.passenger1.getWeight()+this.passenger2.getWeight(), this.passenger3.getWeight()+this.passenger4.getWeight());
        matrice[1]=fuelCenter(this.passenger1.getWeight()+this.passenger3.getWeight(), this.passenger2.getWeight()+this.passenger4.getWeight());
        matrice[2]=fuelCenter(this.passenger1.getWeight()+this.passenger4.getWeight(), this.passenger2.getWeight()+this.passenger3.getWeight());
        matrice[3]=fuelCenter(this.passenger2.getWeight()+this.passenger4.getWeight(), this.passenger1.getWeight()+this.passenger3.getWeight());
        matrice[4]=fuelCenter(this.passenger2.getWeight()+this.passenger3.getWeight(), this.passenger1.getWeight()+this.passenger4.getWeight());
        matrice[5]=fuelCenter(this.passenger3.getWeight()+this.passenger4.getWeight(), this.passenger1.getWeight()+this.passenger2.getWeight());

        int bestindex = 0;

        for (int i=1; i<matrice.length;i++){

             if (matrice[i][0]> matrice[bestindex][0]){
                 bestindex = i;
             }else if (matrice[i][0] == matrice[bestindex][0]){
                 if (matrice[i][1] < matrice[bestindex][1]){
                     bestindex = i;
                 }

             }

        }
        String result = "";
        switch(bestindex){
            case 0:
                result = passenger1.getName() + " et " + passenger2.getName() + " à l'avant";
            break;

            case 1:
                result = passenger1.getName() + " et " + passenger3.getName() + " à l'avant";
            break;

            case 2:
                result = passenger1.getName() + " et " + passenger4.getName() + " à l'avant";
            break;

            case 3:
                result = passenger2.getName() + " et " + passenger3.getName() + " à l'avant";
            break;

            case 4:
                result = passenger2.getName() + " et " + passenger4.getName() + " à l'avant";
            break;

            case 5:
                result = passenger3.getName() + " et " + passenger4.getName() + " à l'avant";
            break;
        }
        return result + "\nemporte " + matrice[bestindex][0] + "L";
    }
    private float[] fuelCenter(float frontWeight, float backWeight){
        float massFuel = this.weightMax - (this.passenger1.getWeight() + this.passenger2.getWeight() + this.passenger3.getWeight() + this.passenger4.getWeight()
                + this.luggage + this.weightMin);

        if (massFuel > maxFuel * densityFuel) massFuel = maxFuel * densityFuel;
        float moment = frontWeight * leverArmForward + backWeight * leverArmBackward + luggage * leverArmLuggage + massFuel * leverArmFuel + weightMin * leverArmEmpty ;
        float massTotal = massFuel + luggage + frontWeight + backWeight + weightMin;
        float centrage = moment / massTotal;
        float qteFuel = massFuel / densityFuel;

        return new float[] {qteFuel, centrage};
    }

    public float getLuggage() {
        return luggage;
    }

    public void setLuggage(float luggage) {
        this.luggage = luggage;
    }

    public PassengerModel getPassenger1() {
        return passenger1;
    }

    public void setPassenger1(PassengerModel passenger1) {
        this.passenger1 = passenger1;
    }

    public PassengerModel getPassenger2() {
        return passenger2;
    }

    public void setPassenger2(PassengerModel passenger2) {
        this.passenger2 = passenger2;
    }

    public PassengerModel getPassenger3() {
        return passenger3;
    }

    public void setPassenger3(PassengerModel passenger3) {
        this.passenger3 = passenger3;
    }

    public PassengerModel getPassenger4() {
        return passenger4;
    }

    public void setPassenger4(PassengerModel passenger4) {
        this.passenger4 = passenger4;
    }
}
