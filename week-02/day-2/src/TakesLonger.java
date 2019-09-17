public class TakesLonger {
    private static Object StringBuilder;
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        quote = quote.replace("\'", "\'");
        String always = "always takes longer than ";
        int a = quote.indexOf("you");

        StringBuilder troll = new StringBuilder(quote);
        troll.insert(a, always);

        System.out.println(troll);
    }
}