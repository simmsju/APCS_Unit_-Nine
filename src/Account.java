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

    public boolean equals(Object other)
    {
        Account otherAccount = (Account) other;
        return (this.balance == otherAccount.balance) &&
                this.name.equals(otherAccount.name);
    }

}
/* Write the Savings class which inherits from Account
   and has an interest rate and a constructor, toString, and
   equals methods.
*/
class Savings extends Account
{
    public Savings() {
        System.out.println("New Savings account");
    }
}

