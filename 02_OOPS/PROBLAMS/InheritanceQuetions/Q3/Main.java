import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class BankAccount 
{
  int number, balance;
  public BankAccount(int number, int bal) 
  {
    this.number = number;
    this.balance = bal;
  }
  public void withdraw(int amt)      
  {
    this.balance -= amt;
  }
  public void deposit(int amt)     
  {
    this.balance += amt;
  }
  public int getBalance()
  {
    return this.balance;
  }
}
class MinMaxAccount extends BankAccount
{
  int min, max;
  public MinMaxAccount(int number, int bal) 
  {
    super(number, bal);
    this.min = bal;
    this.max = bal;
  }
  public void withdraw(int amt)      
  {
    super.withdraw(amt);
    if(amt > this.max)
    {
      this.max = amt;
    }
    if(amt < this.min)
    {
      this.min = amt;
    }
  }
  public void deposit(int amt)     
  {
    super.deposit(amt);
    if(amt > this.max)
    {
      this.max = amt;
    }
    if(amt < this.min)
    {
      this.min = amt;
    }
  }
  public int getMin()
  {
    return this.min;
  }
  public int getMax()
  {
    return this.max;
  }
}

class Main
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      MinMaxAccount a=new MinMaxAccount(s.nextInt(), s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.withdraw(s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.withdraw(s.nextInt());
      System.out.println(a.getBalance());
      System.out.println(a.getMin());
      System.out.println(a.getMax());
    }
}