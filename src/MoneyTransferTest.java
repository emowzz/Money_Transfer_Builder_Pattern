public class MoneyTransferTest {
    public static void main(String[] args) {
        MoneyTransfer moneyTransfer = new MoneyTransferBuilder().setBkash("500").getMoney();

        System.out.println(moneyTransfer);

    }
}
