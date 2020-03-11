package model;

public class BenzinBil extends Bil {
    int oktanTal;
    double kmPrL;

    public BenzinBil(int regNR, String maerke, String model, int aarGgang, int antalDoore) {
        super(regNR, maerke, model, aarGgang, antalDoore);
    }

    public BenzinBil(int regNR, String maerke, String model, int aarGgang, int antalDoore, int oktanTal, double kmPrL) {
        super(regNR, maerke, model, aarGgang, antalDoore);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
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
