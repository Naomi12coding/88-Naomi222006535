class account{
    // method to calculate future value
    public double loanacc(double princ, double rate, int years, int n){
        double Fv = princ*Math.pow(1+rate/n, n* years); //formula
        return Fv;// return amount
    }
}

public class Loan{
    // main class
public static void main(String[] args){
    account myaccount = new account();// new object
    double result = myaccount.loanacc(500000,0.18,3,12);//values
    System.out.println("The amount to be paid is: " +result);// printed result
}
 }
  