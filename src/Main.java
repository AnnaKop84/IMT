public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75.0;
        System.out.println("вес в кг " + weight + " кг");
        double height = 1.7;
        System.out.println("рост в метрах " + height + " м.");
        double imt = service.calculate(weight, height);
        System.out.println("ИМТ= " + imt);

    }
}
