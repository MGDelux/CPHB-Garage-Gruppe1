package model;

public class DieselBil extends Bil {
    protected double kmPrL;
    protected int partikelFilter;

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

    public double getKmPrL() {
        return kmPrL;
    }

    public int getPartikelFilter() {
        return partikelFilter;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    public void setPartikelFilter(int partikelFilter) {
        this.partikelFilter = partikelFilter;
    }
}
