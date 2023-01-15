public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 85;
        double height = 1.82;
        System.out.println(service.calculate(bodyMass, height));
    }
}