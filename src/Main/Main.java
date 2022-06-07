package Main;

public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        int priceOfTheTicket3 = 1000;
        int bonusMiles3 = service.calculate(priceOfTheTicket3);
        System.out.println("Вам начислят " + bonusMiles3);

        int priceOfTheTicket2 = -3;
        int bonusMiles2 = service.calculate(priceOfTheTicket2);
        System.out.println("Вам начислят " + bonusMiles2);

    }
}
