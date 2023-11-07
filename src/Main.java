public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height_m = 1.87;
        double weight_kg = 98;

        double bmiIndex = service.calculate(height_m, weight_kg);
        int index = (int) bmiIndex;

        System.out.println(index);

    }
}