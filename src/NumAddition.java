public class NumAddition {
    public static String addition(String input) {
        char numberArray[] = input.toCharArray();
        int sum = 0;

        for(int i = 0; i < numberArray.length; i++) {
            sum = sum+numberArray[i];
        }
        System.out.println(sum);
        //что в логике for не так? при введении девяти нулей и последнего числа 1 оно выдаёт 481?
        // откуда такой результат??
        return input;
    }
}