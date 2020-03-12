package model;

public class ElBil extends Bil {
    protected int batteriKapacitet;
    protected  int maksKm;
  protected   double whPrKm;

    public ElBil(int regNR, String maerke, String model, int aarGgang, int antalDoore, int batteriKapacitet, int maksKm, double whPrKm) {

        super(regNR, maerke, model, aarGgang, antalDoore);
        this.batteriKapacitet = batteriKapacitet;
        this.maksKm = maksKm;
        this.whPrKm = whPrKm;

    }



    @Override
    public double beregnGrønEjerAfgift( ) {
          double kmPrL = whPrKm/91.25/100;

        double afgift = 0.0;
        if (kmPrL >= 20 && kmPrL <= 50.99) {
            afgift =300.0;
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19.99) {
            afgift =1050.0;

            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14.99) {
            afgift = 2340.0;

            return afgift;
        }
        if (kmPrL >= 5 && kmPrL <= 9.99) {
            afgift =5550.0;
            return afgift;
        }
        if (kmPrL < 5) {
            afgift =10470.0;
        }
        return afgift;

    }

    @Override
    public String toString() {
        return "El Bil \n" +
                " RegNR# " + regNR +
                ", Type: '" + model + '\'' +
                ", Mærke: '" + maerke + '\'' +
                " batteri Kapacitet: " + batteriKapacitet +
                ", Maks KM: " + maksKm +
                ", Watt pr km: " + whPrKm +
                ", Årgang: " + aargang +
                ", Antal døre : " + antalDoore +
                '\n';
    }


}
