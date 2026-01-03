import java.util.*;

class Solution {

    // Function to add two numeric strings
    String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            res.append(sum % 10);
            carry = sum / 10;
        }

        return res.reverse().toString();
    }

    // Function to return minimum possible sum
    String minSum(int[] arr) {

        Arrays.sort(arr);

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                num1.append(arr[i]);
            } else {
                num2.append(arr[i]);
            }
        }

        // Remove leading zeros
        String s1 = num1.toString().replaceFirst("^0+(?!$)", "");
        String s2 = num2.toString().replaceFirst("^0+(?!$)", "");

        return addStrings(s1, s2);
    }
}
