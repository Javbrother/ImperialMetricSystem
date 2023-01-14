public class Cm {
    private  double number;
    public Cm(double num) {
        number = num;
    }
    public double toConvertInch() {
        return number * 2.54;
    }

    public double toConvertFeet(){
        return number * 0.032;
    }
}
