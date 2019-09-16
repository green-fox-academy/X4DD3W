public class PrintAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers` with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`

        int[] numbers = {4, 5, 6, 7};

        // for each
        for (int i: numbers){
            System.out.print(i + ", ");
        }
        System.out.println();

        // for loop (from the workshop)
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }
}
