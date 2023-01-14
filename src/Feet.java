public class Feet {
    private double number;
    public Feet(double num) {
        number = num;
    }

    public double toConvert(){
        return number * 30.48;
    }
}
