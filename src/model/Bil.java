package model;

public abstract class Bil {
    protected int regNR;
    protected  String maerke;
    protected String model;
    protected int aargang;
    protected int antalDoore;

    protected double beregnGrønEjerAfgift(int kmPrL) {
        double afgift = 0.0;

        if (kmPrL >= 20 && kmPrL <= 50) {
            afgift = 300.0;
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19) {
            afgift = 1050.0;
            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14) {
            afgift = 2340.0;
            return afgift;
        }
        if (kmPrL >= 9 && kmPrL <= 5) {
            afgift = 5550.0;
            return afgift;
        }
        if (kmPrL < 5) {
            afgift = 10470.0;
            return afgift;
        }
        else
            return afgift;
    }


}


