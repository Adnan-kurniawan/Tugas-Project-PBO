abstract public class Ikan {

    double beratikan;


    //konstruktor
    Ikan(double bi){
        this.beratikan = bi;
    }

    public double getBeratikan(){
        return beratikan;
    }


    abstract double hrg();
    //abstract double httbi();
}
