package model;

public abstract class Bil {
    protected int regNR;
    protected  String maerke;
    protected String model;
    protected int aargang;
    protected int antalDoore;

    protected double beregnGrønEjerAfgidt(double kmPrL){
        return 0.0;
    }

    public Bil(int regNR,String maerke, String model, int aarGgang, int antalDoore) {
        this.regNR = regNR;
        this.maerke = maerke;
        this.model = model;
        this.aargang = aarGgang;
        this.antalDoore = antalDoore;
    }
}





