class adder {
    // method constructor for adding numbers
    public int add(int num1, int num2){
        // method to add
        return num1 + num2;
    }}

public class objects{
    public static void main(String[] args){
        // creating the object "Objects"
        adder myadder = new adder();
        int result = myadder.add(3, 7);
        System.out.println("Result:" + result);
        }
    }

