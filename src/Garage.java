import model.*;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> biler = new ArrayList<Bil>();
    String garageNavn;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Push Test2");
    }

    @Override
    public String toString() {
        return "Garage{" +
                "biler=" + biler +
                ", garageNavn='" + garageNavn + '\'' +
                '}';
    }
}
