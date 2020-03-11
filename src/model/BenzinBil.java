package model;

public class BenzinBil extends Bil {
   private int oktanTal;
   private int kmPrL;

   public BenzinBil(int oktanTal, int kmPrL){
       this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;}


    public int getoktanTal() { return oktanTal; }
    public int getKmPrL() {return kmPrL;}

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
