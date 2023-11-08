import java.lang.module.FindException;

public class BmiService {
    public double calculate(double heightM, double weightKg) {
        double result = weightKg / (heightM * heightM);
        return result;
    }


}
