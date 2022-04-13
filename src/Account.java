public class Account
{
    private String name;
    private double balance;

    public Account() {
        System.out.println("Made a new account");
    }
    public Account(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return name + ", " + balance;
    }

    @Override
    public boolean equals(Object other) {
        Account account = (Account)other;
        return name.equals(account.name) && balance == account.balance;
    }



}


