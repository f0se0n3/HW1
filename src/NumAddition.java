public class NumAddition extends Main {
    public static String addition() {
        System.out.println("addition method here");
        char numberArray[] = input.toCharArray();
        int sum = 0;


        for(int i = 0; i < numberArray[12]; i++) {
            sum = sum+numberArray[i];
        }
        System.out.println(sum);

        return input;
    }
}