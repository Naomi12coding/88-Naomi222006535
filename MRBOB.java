class calc{
    //  constructor method to calculate future value
public double calculateFV(double princ,double rate,int years){
    double Famount = (princ*rate*years)/100;// method used
    return Famount;
}}
public class MRBOB{
public static void main(String[] args){

// object created of FV2
    calc mycalc = new calc( );
    // bark method to calculate the future value
    double result = mycalc.calculateFV(100000, 5,5);
    // displaying the future value
    System.out.println("The SIR is: " +result);

}
}


