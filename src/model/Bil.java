package model;

public abstract class Bil {
    protected int regNR;
    protected  String maerke;
    protected String model;
    protected int aargang;
    protected int antalDoore;
    protected int kMPrL;



    public Bil(int regNr, String maerKe, String model, int arrgang, int antaldoore ) {
        this.regNR = regNr;
        this.maerke = maerKe;
        this.model = model;
        this.aargang = arrgang;
        this.antalDoore = antaldoore;
      //  if (model.toLowerCase().equals("elbil"){

      //  }
    }

     abstract public double beregnGrønEjerAfgift(double kmPrL) ;



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


