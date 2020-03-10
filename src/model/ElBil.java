package model;

public class ElBil extends Bil {
    int batteriKapacitet;
    int maksKm;
    double whPrKm;

    @Override
    public String toString() {
        return "ElBil{" +
                "batteriKapacitet=" + batteriKapacitet +
                ", maksKm=" + maksKm +
                ", whPrKm=" + whPrKm +
                ", regNR=" + regNR +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", aargang=" + aargang +
                ", antalDoore=" + antalDoore +
                '}';
    }
}
