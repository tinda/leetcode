/**
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
 * <p>
 * The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
 * <p>
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
 */

public class Robot_Return_to_Origin {
    public static void main(String[] args) {
        String input = "UD";
        System.out.println(judgeCircle(input));
    }

    public static boolean judgeCircle(String moves) {
        char[] ch = moves.toCharArray();

        int R_counter = 0;
        int L_counter = 0;
        int U_counter = 0;
        int D_counter = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'R') {
                R_counter++;
            } else if (ch[i] == 'L') {
                L_counter++;
            } else if (ch[i] == 'U') {
                U_counter++;
            } else if (ch[i] == 'D') {
                D_counter++;
            }
        }
        return ((R_counter == L_counter) && (U_counter == D_counter));
    }

    public boolean judgeCircle2(String moves) {
        /**
         * https://leetcode.com/problems/robot-return-to-origin/discuss/194765/Java-one-liner
         */
        return moves.replace("L", "").length() == moves.replace("R", "").length()
                && moves.replace("U", "").length() == moves.replace("D", "").length();


    }

    public boolean judgeCircle3(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
