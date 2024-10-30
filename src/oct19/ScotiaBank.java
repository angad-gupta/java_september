package oct19;

public class ScotiaBank extends BankOfCanada{

    double scotiaRate = 2.5;

    @Override
    public void rateOfInterest(){
        double newRate = baseRate + scotiaRate;
        System.out.println("The rate of Interest is " + newRate);
    }
}
