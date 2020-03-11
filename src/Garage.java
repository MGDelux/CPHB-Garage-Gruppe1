import model.*;

import java.util.ArrayList;

public class Garage {
    public static ArrayList<Bil> biler = new ArrayList<Bil>();
    protected String garageNavn;
    public
     static void main(String[] args) {

        nyElBil(500,85000,347824889,"Tesla","elbil",69,5,199);
        nyBenzinBil(420601234,"Wv","Benzin",1999,2,4,5);
        nyDiselBil(24221023,"BMW","Disel",1932,5,true,3);
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
  static void nyElBil(int maxKm,int whprkm, int regnr, String make, String model, int arrgang, int antaldoore, int battkap){
        ElBil nyelbil;
        nyelbil = new ElBil(regnr,make,model,arrgang,antaldoore,battkap,maxKm,whprkm);
        biler.add(nyelbil);
  }
static void nyBenzinBil(int regnr, String make, String model, int arrgang, int antaldoore, int oktantal, double kMPrL) {
    BenzinBil nyBenZinBil;
    nyBenZinBil = new BenzinBil(regnr, make,model,arrgang,antaldoore,oktantal,kMPrL);
    biler.add(nyBenZinBil);
}
static void nyDiselBil(int regnr,String make, String model, int arrgang,int antaldoore,boolean partikelfilter, int kMPrL){
        DieselBil nyDiselBil;
        nyDiselBil = new DieselBil(regnr,make,model,arrgang,antaldoore,partikelfilter,kMPrL);
        biler.add(nyDiselBil);
}


}

