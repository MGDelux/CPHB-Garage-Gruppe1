import model.*;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> biler = new ArrayList<Bil>();
    String garageNavn;

    public static void main(String[] args) {
    }

    @Override
    public String toString() {
        return "Garage{" +
                "biler=" + biler +
                ", garageNavn='" + garageNavn + '\'' +
                '}';
    }
    //Bil registerBil(int regNR,String maerke, String model, int aarGang, int antalDoore ){
       // Bil(regNR,maerke,model,aarGang,antalDoore)

    }


