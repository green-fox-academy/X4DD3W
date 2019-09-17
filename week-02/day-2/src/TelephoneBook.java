import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("William A. Lathan", "405-709-1865");
        contacts.put("John K. Miller", "402-247-8568");
        contacts.put("Hortensia E. Foster", "606-481-6467");
        contacts.put("Amanda D. Newland", "319-243-5613");
        contacts.put("Brooke P. Askew", "307-687-2982");

        // Create an application which solves the following problems.
        //  - What is John K. Miller's phone number?
        for (String a : contacts.keySet()) {
            if (a == "William A. Lathan") {
                System.out.println(contacts.get(a));
            }
        }

        //  - Whose phone number is 307-687-2982?
        for (String b : contacts.keySet()) {
            if (contacts.get(b).equals("307-687-2982")) {
                System.out.println("The owner of this number is: " + b);
            }
        }

        //  - Do we know Chris E. Myers' phone number?
        for (String c : contacts.keySet()) {
            if (contacts.equals(contacts.get("Chris E. Myers"))) {
                System.out.println("Chris E. Myers' phone number is known.");
            }
        }
    }
}