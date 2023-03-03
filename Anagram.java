public class Anagram {
    public static String removeSp(String str) {
        char tmpChar;
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            tmpChar = Character.toLowerCase(str.charAt(i));

            if (tmpChar >= 'a' && tmpChar <= 'z' || tmpChar >= '0' && tmpChar <= '9') {
                str1 += tmpChar;
            }
        }
        return str1;
    }

    public static String sort(String str) {
        boolean change = true;
        char tmp_char;
        char str2[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            str2[i] = str.charAt(i);
        }
        for (int j = 0; j < str2.length; j++) {
            if (change) {
                for (int count = 0; count < str2.length - 1; count++) {
                    change = false;
                    if (str2[count] > str2[count + 1]) {
                        tmp_char = str2[count];
                        str2[count] = str2[count + 1];
                        str2[count + 1] = tmp_char;
                        change = true;
                    }
                }
            } else {
                break;
            }

        }
        str = "";
        for (int l = 0; l < str2.length; l++) {
            str += str2[l];
        }
        return str;
    }

    public static void main(String args[]) {
        String str1 = "Ar my";
        String str2 = "Mary";
        String str3 = sort(removeSp(str1));
        String str4 = sort(removeSp(str2));

        if (str3.equals(str4)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
