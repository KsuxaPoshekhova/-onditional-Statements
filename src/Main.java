public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int contribution = 1100;
        int bonys = contribution > 1000 ? (contribution / amount) : ( 0 );
        System.out.println("Сумма бонуса:");
        System.out.println(bonys);

        System.out.println("Итоговая сумма на счету клиента составляет :");
        System.out.println(contribution + amount + bonys );
    }
}