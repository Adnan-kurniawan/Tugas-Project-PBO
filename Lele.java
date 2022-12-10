public class Lakilaki extends Manusia {
    Lakilaki(double tb){
        super(tb);
    }

    @Override
    double imt(){
        return  (super.getTinggiBadan() / 100 * getTinggiBadan() / 100);
    }
    @Override
    double httbi(){
        return (super.getBeratBadan()-100) * 0.8;
    }

}
