package practice;

public class CardAccount extends BankAccount {
    private static final double PERCENT = 0.01;

    @Override
    public void take(double amountToTake) {
        if(amountToTake > amount){
            System.out.println("Ошибка");
        }else {
            amount -= amountToTake+amountToTake * PERCENT;
        }
    }

}
