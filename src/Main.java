public class Main {
    public static void main(String[] args) {
        double metr = 1.87;
        double kg = 98;
        int index = 0;

        BmiService service = new BmiService();
        index = service.calculate(metr, kg);
        System.out.println(index);

    }
}