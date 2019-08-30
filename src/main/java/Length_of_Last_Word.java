public class Length_of_Last_Word {

    public int lengthOfLastWord(String s) {

        String[] clearS = s.split("");

        for (int i = clearS.length - 1; i > 0; i--) {
            System.out.println("->" + clearS[i] + "<-");
            if (clearS[i].equals(" ")) {
                return clearS.length - 1 - i;
            }
        }
        return clearS.length;
    }
}
