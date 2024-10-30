package oct19;

public class BMO extends BankOfCanada{
    double bmoRate = 1.5;

    @Override
    public void rateOfInterest(){
        double newRate = baseRate + bmoRate;
        System.out.println("The rate of Interest is " + newRate);
    }
}
