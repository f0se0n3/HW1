public class NumAddition {
    public static String addition(String input) {
        char numberArray[] = input.toCharArray();
        int sum = 0;

        for(int i = 0; i < numberArray.length; i++) {
            sum = sum+numberArray[i] - '0';
        }
        System.out.println(sum);
        return input;
    }
}