public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.603;
        double weightInKg = 52.5;

        double BmiResult = service.calculate(heightInMeters, weightInKg);
        System.out.println(BmiResult);
    }
}
