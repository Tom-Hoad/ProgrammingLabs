package Y1S2.lab2;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.PalindromeChecker;

public class KPalindrome implements PalindromeChecker {
    public boolean isKPalindrome(String s, int i) {
        if (isPalindrome(s)) {
            return true;
        } else {
            return isKPalindrome(s, i);
        }
    }

    // Checks if the string is a palindrome.
    public boolean isPalindrome(String s) {
        int midPoint = s.length() / 2;

        if (s.length() % 2 == 0) {
            if (s.substring(0, midPoint - 1).equals(s.substring(midPoint))) {
                return true;
            }
        } else {
            midPoint = (int) Math.floor(midPoint);
            if (s.substring(0, midPoint - 1).equals(s.substring(midPoint + 1))) {
                return true;
            }
        }
        return false;
    }
}
