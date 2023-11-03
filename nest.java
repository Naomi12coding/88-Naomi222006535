public class nest{
    // the program displays nested loop
public static void main(String args[]){
    for(int i=0; i<5;i++)
    // the outer loop to iterate over range of 0 to 4
    {
        for (int j=3;j>=1;j--){
            // the outer loop to iterate over a range of 3 to 1
            System.out.println("*");

        }
        System.out.println();
    }

}
}