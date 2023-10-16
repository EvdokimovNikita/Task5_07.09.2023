public class Main {
    // Найти самый часто встречающийся элемент массива
    public static void main(String[] args) {
        // What does arrayFree means? It's fine to just name it 'array', 'numbers' or just 'a'.
        int[] a = {1, 5, 8, 1, 9, 6, 5, 6, 5, 0, 5, 6, 5, 6, 6, 6};
        // we need print element results = 5, counter = 3 ;
        // Empty array is a separate case.
        // Java tells that if is not needed there because 'a' is a constant there
        // if it would be a method parameter there would be no warning.
        if (a.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        // Changed names to match naming practices.
        int result = 0;
        int resultCount = 0;
        for (int i = 0; i < a.length; i++) {
            // Count should be declared where it's used
            // then you'll not need temporaryCounter = 0;
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                // 'if' location is wrong, we only need to compare after the 'int j' cycle is finished
            }
            if (count > resultCount) {
                resultCount = count;
                result = a[i];
            }
        }
        System.out.println("количество повторений: " + resultCount);
        System.out.println("искомый элемент: " + result);
    }
}