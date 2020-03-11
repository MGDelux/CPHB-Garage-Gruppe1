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

    public double beregnGrønEjerAfgift(int kmPrL) {
        double afgift = 0.0;

        if (kmPrL >= 20 && kmPrL <= 50) {
            afgift = 300.0;
            System.out.println(afgift);
            return afgift;
        }
        if (kmPrL >= 15 && kmPrL <= 19) {
            System.out.println(afgift);

            afgift = 1050.0;
            return afgift;
        }
        if (kmPrL >= 10 && kmPrL <= 14) {
            System.out.println(afgift);

            afgift = 2340.0;
            return afgift;
        }
        if (kmPrL >= 9 && kmPrL <= 5) {
            System.out.println(afgift);

            afgift = 5550.0;
            return afgift;
        }
        if (kmPrL < 5) {
            System.out.println(afgift);

            afgift = 10470.0;
        }
        System.out.println(afgift);

        return afgift;
    }

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


