//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketprice = 22300; //стоимость билета
        int amountformile = 20; //количество рублей для получения 1 бонусной мили

        int bonusmile = (int) (ticketprice / amountformile); //количество бонусных миль за билет данной стоимости
        System.out.println(bonusmile);
    }
}