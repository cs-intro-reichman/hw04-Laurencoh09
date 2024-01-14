public class ArrayOps {
    public static void main(String[] args) {
      
    }

    public static int findMissingInt (int [] array) {
        int size = array.length;
        int sumTotal = 0;
        int sumArray = 0;

        for(int i = 1 ; i <= size; i++){
            sumTotal = sumTotal + i;
        }

        for(int i = 0; i < size ; i++){
            sumArray = sumArray + array[i];
        }
        return sumTotal - sumArray;
    }

    public static int secondMaxValue(int [] array) {
        int firstMax = Math.max(array[0], array[1]);
        int secondMax = Math.min(array[0], array[1]);
        int size = array.length;

        for(int i = 2 ; i < size; i++){
            if(array[i] > firstMax){
                secondMax = firstMax;
                firstMax = array[i];
            }
            else if (array[i] > secondMax){
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean sameElements1 = sameElements(array1, array2);
        boolean sameElements2 = sameElements(array2, array1);

        return sameElements1 && sameElements2;
    }

    public  static boolean sameElements(int [] array1,int [] array2){
        int size1 = array1.length;
        int size2 = array2.length;
        boolean sameElements1 = false;

        for (int i = 0 ; i < size1; i++){
            sameElements1 = false;
            for (int j = 0; j < size2; j++){
                if(array1[i] == array2[j]){
                    sameElements1 = true;
                    break;
                }
            }

            if(!sameElements1){
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
       if (arr.length <= 1) {
        
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            } else if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
            if (!increasing && !decreasing) {
                return false;
                
            }
        }

        return increasing || decreasing;
    }
}
        return false;
    }
