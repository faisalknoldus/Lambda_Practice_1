

public class FindMaxNumber {
    public static void main(String[] args) {

//       writing lambda for the requirement
        MaxNumbers maxNumbers = ((num1, num2) ->(num1>num2)?num1:(num1<num2)?num2:0);

//        Calling the function
        int max = maxNumbers.findMax(31,55);
        System.out.println(max);
    }
}
