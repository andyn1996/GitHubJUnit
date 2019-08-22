public class Finder {

    public Finder() {
        System.out.println(">>Initializing the Finder's Class...");
    }

    public Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length <= 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int arraySize = intArray.length;

        for (int i = 0; i < arraySize; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length <= 0) {
            return null;
        }
        int min = Integer.MAX_VALUE;
        int arraySize = intArray.length;

        for (int i = 0; i < arraySize; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}
