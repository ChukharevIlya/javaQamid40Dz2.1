import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int price = 9_999; // стоимость билета
        int min = 20; // минимальное количество рублей для получения 1 мили
        int mile; // итоговое количество бонусных миль для клиента
        if (price >= min) {
            mile = price / min;
        } else {
            mile = 0;
        }
        System.out.println("Итоговое количество миль " + mile);
    }
}