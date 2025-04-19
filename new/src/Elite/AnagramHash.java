package Elite;

import java.util.Scanner;
import java.util.HashMap;
public class AnagramHash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int tcase = sc.nextInt();

        for (int k = 0; k < tcase; k++) {
            String str1 = sc.next();
            String str2 = sc.next();
            if (str1.length() != str2.length()) {
                System.out.print("False");
            } else {
                HashMap<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < str1.length(); i++) {
                    map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
                }
                for (int i = 0; i < str2.length(); i++) {
                    if (map.containsKey(str2.charAt(i)))
                        map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
                    // else
                    // System.out.print("False");
                }
                int flag = 0;
                for (int i : map.values()) {
                    if (i != 0) {
                        flag = 1;
                        break;
                    }
                }
                System.out.print((flag == 1) ? "False" : "True");
                System.out.println();

            }
        }
    }
}
