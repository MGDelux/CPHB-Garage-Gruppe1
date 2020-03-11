package model;

public class BenzinBil extends Bil {
    int oktanTal;
    double kmPrL;

    public BenzinBil(int regNr, String maerKe, String model, int arrgang, int antaldoore,int okTanTal,double kmPrL) {
        super(regNr, maerKe, model, arrgang, antaldoore);
        this.oktanTal = okTanTal;
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerAfgift(double kmPrL) {
        double afgift = 0.0;

        if (kmPrL >= 20 && kmPrL <= 50) {
            afgift = 300.0;
            System.out.println(afgift);
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19) {
            System.out.println(afgift);

            afgift = 1050.0;
            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14) {
            System.out.println(afgift);

            afgift = 2340.0;
            return afgift;
        }
        if (kmPrL >= 5 && kmPrL <= 9) {
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
        return "BenzinBil{" +
                "oktanTal=" + oktanTal +
                ", kmPrL=" + kmPrL +
                ", regNR=" + regNR +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", aargang=" + aargang +
                ", antalDoore=" + antalDoore +
                '}';
    }
}
