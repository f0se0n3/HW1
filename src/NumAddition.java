public class NumAddition {
    public static int addition(String input) {
        char numberArray[] = input.toCharArray();
        int sum = 0;
        for(int i = 0; i < numberArray.length; i++) {
            sum = sum + numberArray[i] - '0';
        }
    System.out.println(sum);
        if (sum > 9) {
            addition2(sum);
        } else {
            resultOfCalculations(sum);
        }
    return sum;
    }

    public static int addition2(int sum) {
        String sumStr = Integer.toString(sum);
        char sumArray[] = sumStr.toCharArray();
        int sum2 = 0;
        for (int i = 0; i < sumArray.length; i++) {
            sum2 = sum2 + sumArray[i] - '0';
        }
        System.out.println(sum2);
        if (sum2 > 9) {
            addition3(sum2);
        } else {
            resultOfCalculations(sum2);
        }
        return sum2;
    }


    public static int addition3(int sum2) {
        String sumStr = Integer.toString(sum2);
        char sumArray[] = sumStr.toCharArray();
        int sum3 = 0;
        for (int i = 0; i < sumArray.length; i++) {
            sum3 = sum3 + sumArray[i] - '0';
        }
        resultOfCalculations(sum3);
        return sum3;
    }


    public static int resultOfCalculations(int result) {
        switch (result) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println(result);
                break;
        }
        return result;
    }
}