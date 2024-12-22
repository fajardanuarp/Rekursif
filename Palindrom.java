
import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(String str, int start, int end) {
           while (start < end && !Character.isLetter(str.charAt(start))) {
              start++;
        }
        while (start < end && !Character.isLetter(str.charAt(end))) {
              end--;
        }
        if (start >= end) {
            return true;
        }
        if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
            return false;
        }
        return isPalindrom(str, start + 1, end);  
    }      

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan string untuk diperiksa: ");
        String input = scanner.nextLine();
        boolean result = isPalindrom(input, 0, input.length() -1);
        if (result) {
            System.out.println("\"" + input + "\" adalah palindrom");
        } else {
            System.out.println("\"" + input + "\" adalah palindrom");
        }

        scanner.close();
}
}
