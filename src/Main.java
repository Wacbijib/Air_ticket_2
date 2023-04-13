public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(10_000); // должно получиться 500
        System.out.println("Начислено бонусных миль " + miles);

        System.out.println("Начислено бонусных миль " + service.calculate(12_000));

        System.out.println("Начислено бонусных миль " + service.calculate(14_452));

        System.out.println("Начислено бонусных миль " + service.calculate(11_876));

        System.out.println("Начислено бонусных миль " + service.calculate(654_765));
    }
}