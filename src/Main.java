public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int contribution = 1100;
        int percent = 1;
        int bonys = contribution > 1000 ? (contribution / amount) : (contribution = 0);
        System.out.println("Количество бонусов составляет :");
        System.out.println(bonys);

        System.out.println("Итоговая сумма на счету клиента составляет :");
        System.out.println(amount + contribution + bonys);
    }
}