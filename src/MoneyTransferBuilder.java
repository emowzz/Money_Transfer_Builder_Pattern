public class MoneyTransferBuilder {
    private String bkash;
    private String banks;
    private String nogod;

    public MoneyTransferBuilder setBkash(String bkash) {
        this.bkash = bkash;
        return this;
    }

    public MoneyTransferBuilder setBanks(String banks) {
        this.banks = banks;
        return this;
    }

    public MoneyTransferBuilder setNogod(String nogod) {
        this.nogod = nogod;
        return this;
    }

    public MoneyTransfer getMoney()
    {
        return new MoneyTransfer(bkash, banks, nogod);
    }
}
