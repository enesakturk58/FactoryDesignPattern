public class Fabrika {

    private static final int Asinifi=1;
    private static final int Bsinifi=2;


    public ISinif iSinif(int tip){
        if (tip==1){
            return new ASinifi();
        }
        else if (tip==2) {
            return new BSinifi();
        }
        else {
            System.out.println("Sinif seçilemedi.");
        }
        return null;
    }
}
