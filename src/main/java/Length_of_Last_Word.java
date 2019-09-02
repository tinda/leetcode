public class Length_of_Last_Word {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
    }

    public static int lengthOfLastWord(String s) {

        String use = s.trim();
        int count = 0;
        for (int i = use.length() - 1; i >= 0; i--) {
            if (use.charAt(i) != ' ') count++;
            else break;
        }
        return count;
    }

}
