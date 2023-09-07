public class Main {
    public static void main(String[] args) {
        int[] arrayFree = {1, 5, 8, 1, 9, 6, 5, 6, 5, 0, 5, 6, 5, 6, 6, 6};
        // we need print element results = 5, counter = 3 ;
        int counter = 0;
        int results = 0;
        int temporaryCounter = 0;
        for (int i = 0; i < arrayFree.length; i++) {
            for (int j = i + 1; j < arrayFree.length; j++) {
                if (arrayFree[i] == arrayFree[j]) {
                    temporaryCounter++;
                }
                if (temporaryCounter > counter) {
                    counter = temporaryCounter;
                    results = arrayFree[i];
                }
            }
            temporaryCounter = 0;
        }
        System.out.println("количество повторений: " + counter);
        System.out.println("искомый элемент: " + results);
    }
}