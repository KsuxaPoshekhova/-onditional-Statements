public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int contribution = 1100;
        int invest = 100;
        int percent;
        percent = 11;

        boolean facilities = contribution > invest;
        if (contribution > invest) {
            System.out.println("Итоговая сумма на счету клиента составляет :");
            System.out.println(amount + contribution + percent);
        } else {
            System.out.println("Бонусов нет");
            System.out.println(amount + invest);
        }
    }
}