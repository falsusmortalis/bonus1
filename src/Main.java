public class Main {
    public static void main(String[] args) {
        int originalBalance = 100; // исходный счет
        int resultBalance; // всего на счету
        int paymentBalance = 1000; //сумма пополнения
        int bonus = paymentBalance / 100; // бонусы (каждые 100 рублей)
        if (paymentBalance > 1000) {
            resultBalance = bonus + originalBalance + paymentBalance;
            System.out.println("На вашем счету: " + resultBalance + " рублей");
            // System.out.println("Вы пополнили счет на: "+paymentBalance);
            System.out.println("Бонусы составили: " + bonus + " рублей");
        } else {
            resultBalance = originalBalance + paymentBalance;
            int bonus1 = 0;
            System.out.println("На вашем счету:" + resultBalance + " рублей");
            System.out.println("Бонусы составили:" + bonus1 + " рублей");
        }
    }
}
