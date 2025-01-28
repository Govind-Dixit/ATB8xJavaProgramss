package Oct.ex023102024_exception;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankname) throws Exception {
        if (!bankname.currency.equalsIgnoreCase("INR")) {
//            throw new Exception("Currency Mismatch, Can't Proceed!");
//            throw new Exception("Currency Mismatch, Can't Proceed!");
            throw new Error();

        }

        return bankname.amount + this.amount;
    }


    }

