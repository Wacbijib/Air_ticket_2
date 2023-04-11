public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(10_000, 20); // должно получиться 500
        System.out.println(miles);

        //System.out.println("10_000 / 20");
        //System.out.println(service.calculate(10_000, 20));

        //System.out.println("12_100 / 20");
        //System.out.println(service.calculate(123_234, 20));

        //System.out.println("20_500 / 20");
        //System.out.println(service.calculate(432_456, 20));
    }
}