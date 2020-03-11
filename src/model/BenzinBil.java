package model;

public class BenzinBil extends Bil {

    int oktanTal;
    double kmPrL;
    String maerke;
    String model;
    int aargang;
    int antalDoore;

    public BenzinBil(int regNR, String maerke, String model, int aarGgang, int antalDoore,int oktantal, double kMPrL) {
        super(regNR, maerke, model, aarGgang, antalDoore, kMPrL);
        beregnGronEjerAfgift(kMPrL, false);
        this.oktanTal = oktantal;
        this.kmPrL = kMPrL;
        this.maerke = maerke;
        this.model = model;
        this.aargang = aarGgang;
        this.antalDoore = antalDoore;
    }

    @Override
    public double beregnGronEjerAfgift(double kmPrL, boolean partikelFilter) {
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