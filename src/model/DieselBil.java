package model;

public class DieselBil extends Bil {
    protected double kmPrL;
    protected boolean partikelFilter;

    public DieselBil(int regNr, String maerKe, String model, int arrgang, int antaldoore, double kmPrL, boolean partikelFilter) {
        super(regNr, maerKe, model, arrgang, antaldoore);
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
    public double beregnGrønEjerAfgift() {
        double afgift = 0.0;

        if (kmPrL >= 20 && kmPrL <= 50 ) {
            afgift =300.0+130+filter(partikelFilter);
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19) {

            afgift = afgift + 1050.0+1390+filter(partikelFilter);
            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14) {

            afgift =2340.0+1850+filter(partikelFilter);

            return afgift;
        }
        if (kmPrL >= 5 && kmPrL <= 9) {
            afgift = 5550.0+2770+filter(partikelFilter);

            return afgift;
        }
        if (kmPrL < 5) {
            afgift =10470.0+15260+filter(partikelFilter);

        }
        else {
            afgift = 0.0;
            return afgift;
        }
        return afgift;
    }

    @Override
    public String toString() {
        return "Disel Bil\n" +
                " RegNR# " + regNR +
                ", Type: '" + model + '\'' +
                ", Mærke: '" + maerke + '\'' +
                ", Årgang: " + aargang +
                ", KM PR/L: " + kmPrL +
                ", Partikel filter: " + partikelFilter +
                ", Antal Døre: " + antalDoore +
                '\n';
    }



}
