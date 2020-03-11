import model.*;

import java.util.ArrayList;

public class Garage {
    public static ArrayList<Bil> biler = new ArrayList<Bil>();
    protected String garageNavn;
    public
     static void main(String[] args) {

        nyElBil(500,85000,347824889,"Tesla","elbil",69,5,199);
        tilFoejNyBil(44332211, "Touareg", "elbil", 2020, 3);
        tilFoejNyBil(12378945, "Ioniq", "elbil", 2019, 5);
        displayCars();
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
  static void  nyElBil(int maxKm,int whprkm, int regnr, String make, String model, int arrgang, int antaldoore, int battkap){
        ElBil nyelbil;
        nyelbil = new ElBil(regnr,make,model,arrgang,antaldoore,battkap,maxKm,whprkm);
        biler.add(nyelbil);
  }

    }


