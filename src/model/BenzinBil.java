package model;

public class BenzinBil extends Bil {
    protected int oktanTal;
    protected double kmPrL;
    public double[] afgift = {0,0,0,0};
    private int counter = 0;



    public BenzinBil(int regNr, String maerKe, String model, int arrgang, int antaldoore,int okTanTal,double kmPrL) {
        super(regNr, maerKe, model, arrgang, antaldoore);
        this.oktanTal = okTanTal;
        this.kmPrL = kmPrL;


    }


    @Override
    public double beregnGrønEjerAfgift() {
        double afgift = 0.0;
        if (kmPrL >= 20 && kmPrL <= 50) {
            afgift =  300.0;
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19) {

            afgift =  1050.0;

            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14) {
            afgift =2340.0;

            return afgift;
        }
        if (kmPrL >= 5 && kmPrL <= 9) {
            afgift =5550.0;

            return afgift;
        }
        if (kmPrL < 5) {
            afgift =10470.0;

        }
        afgift = 0.0;
        return afgift;
    }

    @Override
    public String toString() {
        return "Benzin bil: \n" +
                " RegNR# " + regNR +
                ",  Type: '" + model + '\'' +
                ", Mærke: '" + maerke + '\'' +
                ", Årgang: " + aargang +
                " Oktan Tal: " + oktanTal +
                ", KM PR/L: " + kmPrL +
                ", Antal Døre: " + antalDoore+
                '\n';
    }


}
