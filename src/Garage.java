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

    //{"regNr", "mørke", "model", "år", "dør"};
    //{"batterikapacitet", "maksKm", "whPrKm"}
    String[] arrayOfcars = new String[9];
    String[] bil1= {"11223344", "TeslaS", "elbil", 2019, 5, 85000, 500, 1000};
    String[] bil2= {"44332211", "Touareg", "elbil", 2020, 3, 90000, 600, 1000};
    String[] bil3= {"12378945", "Ioniq", "elbil", 2019, 5, 87000, 550, 1000};
    //{oktan tal, kmPerL}
    String[] bil4= {"78945633", "Fiat", "benzin", 2017, 3, 95, 15};
    String[] bil5= {"44673215", "Wolksvagen", "benzin", 2018, 5, 92, 17};
    String[] bil6= {"98777564", "Hyundai", "benzin", 2016, 5, 95, 16};
    //{kmPerL, Filter}
    String[] bil7= {"87654135", "Mercedes", "diesel", 2019, 3, 25, true};
    String[] bil8= {"44613554", "Ford", "diesel", 2018, 5, 27, false};
    String[] bil9= {"11134654", "Audi", "diesel", 2020, 5, 28, true};

}


