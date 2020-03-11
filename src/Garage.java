import model.*;

import java.util.ArrayList;

public class Garage {
    public static ArrayList<Bil> biler = new ArrayList<Bil>();
    protected String garageNavn;
    protected  static void tilFoejNyBil(int regNr, String maerKe, String model, int arrgang, int antaldoore){
        Bil bileR;

        bileR = new Bil(regNr,maerKe,model,arrgang,antaldoore) {
        };
        biler.add(bileR);
    }
    public
     static void main(String[] args) {

        tilFoejNyBil(11223344, "TeslaS", "elbil", 2019, 5);
        tilFoejNyBil(44332211, "Touareg", "elbil", 2020, 3);
        tilFoejNyBil(12378945, "Ioniq", "elbil", 2019, 5);
        displayCars();
    }
void beregnAfgift(int kmPrL,int regNr, String maerKe, String model, int arrgang, int antaldoore){
        Bil bilerafgift = new Bil( regNr,maerKe,model, arrgang,antaldoore) {
            @Override
            public double beregnGrønEjerAfgift(int kmPrL) {
                return super.beregnGrønEjerAfgift(kmPrL);
            }
        };
    bilerafgift.beregnGrønEjerAfgift(kmPrL);

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

    protected static void displayCars() {
        System.out.println("\t**** biler ****");

        for (Bil bil : biler ){  //Team Datatypen gir vi navn og instanser den 'team' printer vi fra 'teams' array.  AKA Team(Datatype) team(var navn) : (for) teams(ArrayList navn)
            System.out.println(bil); //print team
        }
    }

    }


