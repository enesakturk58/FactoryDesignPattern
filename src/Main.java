public class Main {
    public static void main(String[] args) {

        Fabrika fabrika1 = new Fabrika();
        ISinif iSinif1 = fabrika1.iSinif(1);
        iSinif1.IsYap();


        Fabrika fabrika2 = new Fabrika();
        ISinif iSinif2 = fabrika2.iSinif(2);
        iSinif2.IsYap();

    }
}