package model;

public class DieselBil extends Bil {
    protected double kmPrL;
    protected boolean partikelFilter;

    public DieselBil(int regNR,String maerke, String model, int aargang,int antalDoore,boolean partikelFilter, int kmPrL) {
        super(regNR, maerke, model, aargang, antalDoore, kmPrL, partikelFilter);
        this.kmPrL = kmPrL;
        this.partikelFilter = partikelFilter;
    }

    private int filter (boolean partikelFilter){
        if (partikelFilter == true){
            return 0;
        }else{
            return 1000;
        }
    }

    @Override

    public double beregnGronEjerAfgift(double kmPrL, boolean partikelFilter) {

        double afgift = 0.0;

        if (kmPrL >= 20 && kmPrL <= 50 ) {
            afgift = 300.0+130+filter(partikelFilter);
            System.out.println(afgift);
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19) {
            System.out.println(afgift);

            afgift = 1050.0+1390+filter(partikelFilter);
            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14) {
            System.out.println(afgift);

            afgift = 2340.0+1850+filter(partikelFilter);
            return afgift;
        }
        if (kmPrL >= 5 && kmPrL <= 9) {
            System.out.println(afgift);

            afgift = 5550.0+2770+filter(partikelFilter);
            return afgift;
        }
        if (kmPrL < 5) {
            System.out.println(afgift);

            afgift = 10470.0+15260+filter(partikelFilter);
        }
        System.out.println(afgift);

        return afgift;
    }


    @Override
    public String toString() {
        return "DieselBil{" +
                "kmPrL=" + kmPrL +
                ", partikelFilter=" + partikelFilter +
                ", regNR=" + regNR +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", aargang=" + aargang +
                ", antalDoore=" + antalDoore +
                '}';
    }

}