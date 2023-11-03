public class now{
public static void main (String args[]){
    int day = 4; // the value to be checked in the switch case
    // switch statement to perform different actions based on the value of"Choice"
    switch(day){
      case 1:
        System.out.println("Today is monday");
        // action 1
        break;
        case 2:
        System.out.println("Today is tuesday");
        //action 2
        break;
        case 3:
        System.out.println("Todya is wednesday");
        //action 3
        break;
        case 4:
        System.out.println("Today is thursday");
        // action 4
        break;
        case 5:
        System.out.println("Today is friday");
        break;
        default:System.out.println("Not among");
        // default action if the value does not match any case
    }


    }
}
