public class switchE{
    // the program displays switch case
public static void main(String args[]){
    int number = 10;// value to be checked
    // switch statement to perform different actions based on"Choice"
    switch(number){
        case 10: System.out.println("10");// first action
        break;
        case 20: System.out.println("20");// second action
        break;
        case 30: System.out.println("30");// third action
        break;
        default: System.out.println("Not in 10, 20, or 30");
        // default action if the action does not match the case
    }
}
}