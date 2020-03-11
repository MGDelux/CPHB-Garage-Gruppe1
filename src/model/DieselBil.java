package model;

public class DieselBil extends Bil {
    protected double kmPrL;
    protected boolean partikelFilter;

    public DieselBil(int regNR, String maerke, String model, int aarGgang, int antalDoore,boolean partikelFilter,int kmPrL) {
        super(regNR, maerke, model, aarGgang, antalDoore);
        this.partikelFilter = partikelFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerAfgift(double kmPrL) {
        return 0;
    }


    public DieselBil(int regNR, String maerke, String model, int aarGgang, int antalDoore, double kmPrL, boolean partikelFilter) {
        super(regNR, maerke, model, aarGgang, antalDoore);
        this.kmPrL = kmPrL;
        this.partikelFilter = partikelFilter;
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
