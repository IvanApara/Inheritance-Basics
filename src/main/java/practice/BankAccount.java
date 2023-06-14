package practice;

public class BankAccount {

  protected double amount;
  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if(amountToPut >= 0) {
      amount += amountToPut;
    } else {
      System.out.println("Внесена не корректная сумма.");
    }
  }

  public void take(double amountToTake) {
    if (amountToTake > amount){
      System.out.println("Не хватает денег на счету");
    } else {
      amount -= amountToTake;
    }
  }
}
