public class palindrome {

        public static void main(String[] args) {
            for (String s : args) {
                System.out.println(s + " : " + isPalindrome(s));



        }
        }

        // Возвращает строку в обратном порядке
        static String reverseString(String s) {
            StringBuilder res = new StringBuilder();
            for (int i = s.length()-1; i >= 0; i--) {
                res.append(s.charAt(i));
            }
            return res.toString();
        }

        // Проверяет является ли s палиндромом
        static boolean isPalindrome(String s) {
            if (s.equals(reverseString(s))) {
                return true;
            } else {
                return false;
            }
        }
}
