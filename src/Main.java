public class Main {
    public static void main(String[] args) {
        // Создание объекта
        BonusMilesService service = new BonusMilesService();
        // Переменные
        int price = 20_000;
        // Вызов метода calculate
        int miles = service.calculate(price);
        //Вывод результата
        System.out.println("За билет стоимостью " + price + " рублей Вам начислено " + miles + " бонусных миль.");
    }
}
