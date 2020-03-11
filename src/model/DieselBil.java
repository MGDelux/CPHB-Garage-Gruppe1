package model;

public class DieselBil extends Bil {
    protected double kmPrL;
    protected int partikelFilter;

    public DieselBil(int regNR, String maerke, String model, int aarGgang, int antalDoore) {
        super(regNR, maerke, model, aarGgang, antalDoore);
    }

    public DieselBil(int regNR, String maerke, String model, int aarGgang, int antalDoore, double kmPrL, int partikelFilter) {
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
