import model.*;

import java.util.ArrayList;

public class Garage {
    public ArrayList<Bil> bilpark = new ArrayList<Bil>();
    protected String garageNavn;


    public void displayCars() { // Print biler I array
        System.out.println("\n\t**** GARAGE: ****\n");

        for (Bil bil : bilpark ){  //Team Datatypen gir vi navn og instanser den 'team' printer vi fra 'teams' array.  AKA Team(Datatype) team(var navn) : (for) teams(ArrayList navn)
            System.out.println(bil); //print team
        }
    }

    public void bilpark(Bil bil) {
        bilpark.add(bil);

    }
    public double BeregnGronAfgiftForBilpark() {
        double total = 0.0;
        for (Bil bil : bilpark) {
            total = total + bil.beregnGrønEjerAfgift();
        }

      return total;
    }
}

