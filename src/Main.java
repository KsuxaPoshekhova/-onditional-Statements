public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int contribution = 1000;
        int percent = 1;
        int bonys = contribution == contribution  ? (contribution / amount ) : (contribution - amount );
        System.out.println("Количество бонусов составляет :");
        System.out.println( bonys  );

        boolean facilities = contribution > amount ;
        if (contribution > amount ) {
            System.out.println("Итоговая сумма на счету клиента составляет :");
            System.out.println(amount + contribution + bonys  );
        } else {
            System.out.println("Бонусов нет");
            System.out.println(amount + amount );
        }
    }
}