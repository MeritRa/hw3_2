public class BmiService {
    public double calculate(double heightInMeters, double weightInKg) {
        double BmiResult = weightInKg / (heightInMeters * heightInMeters);
        return BmiResult;
    }
}
