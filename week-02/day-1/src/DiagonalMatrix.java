public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        // - Print this two dimensional array to the output

        int[][] numbers = new int[4][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {       // originally j < numbers.length didn't worked if numbers[][x] were bigger
                if (i == j) {
                    numbers[i][j] = 1;
                } else {
                    numbers[i][j] = 0;
                }
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
