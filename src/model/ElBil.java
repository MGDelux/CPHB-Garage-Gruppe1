package model;

public class ElBil extends Bil {
    int batteriKapacitet;
    int maksKm;
    double whPrKm;

    public ElBil(int maxKm, double whprkm, int regNR, String maerke, String model, int aarGgang, int antalDoore, int battkap, int kmPrL, boolean partikelFilter) {
        super(regNR, maerke, model, aarGgang, antalDoore, kmPrL, partikelFilter );
        this.batteriKapacitet = battkap;
        this.maksKm = maxKm;
        this.whPrKm = whprkm;
        beregnGronEjerAfgift(whprkm, partikelFilter);

    }


    @Override
    public double beregnGronEjerAfgift(double whPrKm, boolean partikelFilter) {
       double kmPrL = whPrKm/91.25/100;

       double afgift = 0.0;
        if (kmPrL >= 20 && kmPrL <= 50) {
            afgift = 300.0;
            System.out.println(afgift);
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19.99) {
            System.out.println(afgift);

            afgift = 1050.0;
            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14.99) {
            System.out.println(afgift);

            afgift = 2340.0;
            return afgift;
        }
        if (kmPrL >= 5 && kmPrL <= 9.99) {
            System.out.println(afgift);

            afgift = 5550.0;
            return afgift;
        }
        if (kmPrL < 5) {
            System.out.println(afgift);

            afgift = 10470.0;
        }
        System.out.println(afgift);

        return afgift;

    }

    @Override
    public String toString() {
        return "ElBil{" +
                "batteriKapacitet=" + batteriKapacitet +
                ", maksKm=" + maksKm +
                ", whPrKm=" + whPrKm +
                ", regNR=" + regNR +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", aargang=" + aargang +
                ", antalDoore=" + antalDoore +
                '}';
    }
}