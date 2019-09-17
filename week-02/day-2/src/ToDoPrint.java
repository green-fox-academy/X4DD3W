public class ToDoPrint {
    public static void main(String... args){
        // Add "My todo: " to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention
        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk\n";
        String firstRow = "My todo: \n";
        String thirdRow = " - Download games\n";
        String fourthRow = "\t - Diablo";

        StringBuilder list = new StringBuilder(todoText);
        list.insert(0, firstRow).append(thirdRow).append(fourthRow);

        System.out.println(list);
    }
}