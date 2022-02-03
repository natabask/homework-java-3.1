public class Main {
    public static void main(String[] args) {

        //Переменные
        int ticketPrice = 20_000;
        int milePrice = 20;

        //Вычисления
        int bonusMiles = ticketPrice / milePrice;

        //Вывод результата
        System.out.println("За билет стоимостью " + ticketPrice + " рублей Вам начислено " + bonusMiles + " бонусных миль. Летайте с Аэрофлотом!");
    }
}
