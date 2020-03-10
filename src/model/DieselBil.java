package model;

public class DieselBil extends Bil {
    int kmPrL;
    int partikelFilter;

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
