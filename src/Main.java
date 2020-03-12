import model.*;

import java.util.ArrayList;

public class Main {
  public  static void main(String[] args) {
      Garage garg = new Garage();
ElBil elbil = new ElBil(324234223,"Tesla","elbil",2014,4, 12500, 500, 65000);
garg.bilpark(elbil);
elbil = new ElBil(31231343,"Tesla X","elbil",2019,4, 850000, 500, 65000);
garg.bilpark(elbil);
elbil=  new ElBil(89435345,"Tesla 3","elbil",2020,2, 65000, 700, 90000);
garg.bilpark(elbil);
elbil=  new ElBil(13345434,"Tesla Y","elbil",2018,6, 10000, 350, 12000);
garg.bilpark(elbil);
BenzinBil benzinBil = new BenzinBil(420601234,"Wv","Benzin",1999,2,4,12);
garg.bilpark(benzinBil);
benzinBil = new BenzinBil(420691337,"Opel","Benzin",2002,2,4,12);
garg.bilpark(benzinBil);
benzinBil = new BenzinBil(420601234,"Wv","Benzin",1999,2,4,4);
garg.bilpark(benzinBil);
benzinBil = new BenzinBil(234567889,"Kia","Benzin",2000,6,4,4);
garg.bilpark(benzinBil);
DieselBil dieselBil = new DieselBil(234567889,"Kia","Disel",1959,4,8,false);
garg.bilpark(dieselBil);
      dieselBil = new DieselBil(453423243,"Volvo","Disel",2020,6,50,true);
garg.bilpark(dieselBil);
      dieselBil = new DieselBil(123456789,"BMW","Disel",1941,2,4,false);
      garg.bilpark(dieselBil);
      dieselBil = new DieselBil(545334532,"whocares","Disel",2012,2,4,false);
      garg.bilpark(dieselBil);
      dieselBil = new DieselBil(345532564,"Kia","Disel",1979,2,9,false);
      garg.bilpark(dieselBil);

garg.displayCars();
double total = garg.BeregnGronAfgiftForBilpark();
      System.out.println("Total Afgift: "+total);



    }


}
