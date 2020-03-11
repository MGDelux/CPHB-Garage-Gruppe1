import model.*;
import java.util.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Garage {
    public static ArrayList<Bil> biler = new ArrayList<Bil>();
    protected String garageNavn;

    public
    static void main(String[] args) {


        List<Bil> bilElementer = new ArrayList<>();

        Bil nyElBil = new ElBil(500, 75000, 347824889, "Tesla", "elbil", 69, 5, 199, 21, true);
        Bil nyBenzinBil = new BenzinBil(420601234, "Wv", "Benzin", 1999, 2, 4, 5);
        Bil nyDiselBil = new DieselBil(24221023, "BMW", "Disel", 1932, 5, true, 3);

        bilElementer.add(nyElBil);
        bilElementer.add(nyBenzinBil);
        bilElementer.add(nyDiselBil);


        displayCars();

        double result = BeregnGronAfgiftForBilpark(bilElementer);

        System.out.println(result);
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

        for (Bil bil : biler) {  //Team Datatypen gir vi navn og instanser den 'team' printer vi fra 'teams' array.  AKA Team(Datatype) team(var navn) : (for) teams(ArrayList navn)
            System.out.println(bil); //print team
        }
    }

    static void nyElBil(int maxKm, double whprkm, int regnr, String make, String model, int arrgang, int antaldoore, int battkap, int kmPrL, boolean partikelFilter) {
        ElBil nyelbil = new ElBil(maxKm, whprkm, regnr, make, model, arrgang, antaldoore, battkap, kmPrL, partikelFilter);
        biler.add(nyelbil);
    }

    static void nyBenzinBil(int regnr, String make, String model, int arrgang, int antaldoore, int oktantal, double kMPrL) {
        BenzinBil nyBenZinBil = new BenzinBil(regnr, make, model, arrgang, antaldoore, oktantal, kMPrL);
        biler.add(nyBenZinBil);
    }

    static void nyDiselBil(int regnr, String make, String model, int arrgang, int antaldoore, boolean partikelfilter, int kMPrL) {
        DieselBil nyDiselBil = new DieselBil(regnr, make, model, arrgang, antaldoore, partikelfilter, kMPrL);
        biler.add(nyDiselBil);
    }


    public static double BeregnGronAfgiftForBilpark(List<Bil> bilElementer) {
        double result = 0.0;

        for (Bil bil : bilElementer) {
            bil.beregnGronEjerAfgift();
        }

        return result;
    }
}