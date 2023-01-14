public class Inch {
    private double number;
    public Inch(double num) {
        number = num;
    }
    public double toConvert() {
        return number * 2.54;
    }
}
