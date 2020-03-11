package model;

public class ElBil extends Bil {
    int batteriKapacitet;
    int maksKm;
    double whPrKm;

    public ElBil(int regNR, String maerke, String model, int aarGgang, int antalDoore) {
        super(regNR, maerke, model, aarGgang, antalDoore);
    }

    public ElBil(int regNR, String maerke, String model, int aarGgang, int antalDoore, int batteriKapacitet, int maksKm, double whPrKm) {
        super(regNR, maerke, model, aarGgang, antalDoore);
        this.batteriKapacitet = batteriKapacitet;
        this.maksKm = maksKm;
        this.whPrKm = whPrKm;
    }

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
