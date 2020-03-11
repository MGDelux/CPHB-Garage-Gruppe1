package model;

public abstract class Bil {
    protected int regNR;
    protected  String maerke;
    protected String model;
    protected int aargang;
    protected int antalDoore;
    protected int kMPrL;
    protected boolean partikelFilter;


    public Bil(int regNr, String maerKe, String model, int arrgang, int antaldoore, int kMPrL, boolean partikelFilter) {
        this.regNR = regNr;
        this.maerke = maerKe;
        this.model = model;
        this.aargang = arrgang;
        this.antalDoore = antaldoore;
        this.kMPrL = kMPrL;
        this.partikelFilter = partikelFilter;
    }

    public Bil(int regNR, String maerke, String model, int aarGgang, int antalDoore, double kMPrL) {
    }



    abstract public double beregnGronEjerAfgift(double kmPrL, boolean partikelFilter);



    @Override
    public String toString() {
        return "Bil{" +
                "regNR=" + regNR +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", aargang=" + aargang +
                ", antalDoore=" + antalDoore +
                '}';
    }
}

