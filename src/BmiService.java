import java.lang.module.FindException;

public class BmiService {
    public double calculate(double height_m, double weight_kg) {
        double result = weight_kg / (height_m * height_m);
        return result;
    }


}
