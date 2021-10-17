public class MoneyTransfer {

    private String bkash;
    private String banks;
    private String nogod;

    public MoneyTransfer(String bkash, String banks, String nogod) {
        this.bkash = bkash;
        this.banks = banks;
        this.nogod = nogod;
    }

    @Override
    public String toString() {
        return "MoneyTransfer{" +
                "bkash='" + bkash + '\'' +
                ", banks='" + banks + '\'' +
                ", nogod='" + nogod + '\'' +
                '}';
    }
}
