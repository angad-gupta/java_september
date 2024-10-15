package oct12;

public class RevString {
    public static void main(String[] args) {
        String companyName = "Pragra";

        String reverse = revString(companyName);

        System.out.println("Reverse is " + reverse);

        System.out.println(companyName.length());

    }

    public static String revString(String str){
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString;


    }
}
