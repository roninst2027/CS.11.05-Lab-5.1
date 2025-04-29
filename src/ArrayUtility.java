public class ArrayUtility {

    public static void print(int[] array) {
        if(array.length == 0){
        }
        else{
            String result = "";
            for(int i = 0; i < array.length; i++){
                result += array[i] + ", ";
            }
            System.out.println(result);
        }
    }

    public static int sum(int[] array) {
        int arraySum = 0;
        for(int i = 0; i < array.length; i++){
            arraySum += array[i];
        }
        return arraySum;
    }

    public static double average(int[] array) {
        double arraySum = 0;
        for(int i = 0; i < array.length; i++){
            arraySum += array[i];
        }
        double average = arraySum / array.length;
        return Math.round(average * 100.0) / 100.0;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
        
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int evenCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i < array.length; i++){
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        if (array == null || array.length == 0) {
            return "";
        }

        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i < array.length - 1) {
                result += ", ";
            }
        }
        ;
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length == 0) {
            return;
        }
        int n = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = n;
    }

    public static void shiftLeft(int[] array) {
        if (array.length == 0) {
            return;
        }
        int first = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length == 0) {
            return;
        }
        n = n % array.length; 
        for (int i = 0; i < n; i++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array.length == 0) {
            return;
        }
        n = n % array.length; 
        for (int i = 0; i < n; i++) {
            shiftLeft(array);
        }
    }


}
