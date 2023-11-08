public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double heightM = 1.87;
        double weightKg = 98;

        double bmiIndex = service.calculate(heightM, weightKg);
        int index = (int) bmiIndex;

        System.out.println(index);

    }
}