public class BmiService {
    public double calculate(int bodyMass, double height) {
        double heightSquare = height * height;
        double result = bodyMass / heightSquare;
        return result;
    }
}