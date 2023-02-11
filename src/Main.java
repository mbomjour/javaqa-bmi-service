public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kgWeight = 98;
        double mHeight = 1.87;
        int bmi = service.calculate(kgWeight, mHeight);

        System.out.println(bmi);
    }
}
