package exercitiu;

class BankAccount {
    private String owner;
    private double balance;
    private String iban;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null && !owner.isEmpty()) {
            this.owner = owner;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        if (iban != null && !iban.isEmpty()) {
            this.iban = iban;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}