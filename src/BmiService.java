import java.lang.module.FindException;

public class BmiService {
    public double calculate(double a, double b) {
        double result = b / (a * a);
        return result;
    }


}
