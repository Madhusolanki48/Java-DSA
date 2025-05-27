import java.util.*;

public class Java4_StackQues9 {
    /*
    Simplify Path
    We have an absolute path for a file (Unix-style), simplify it.
    Note that absolute path always begins with '/' (root directory),
    a dot in path represents current directory and double dot represents parent directory.

    Sample Input 1: /apnaccollege/
    Sample Output 1: /apnaccollege
    Sample Input 2: /a/..
    Sample Output 2: /
    */

    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        String result = simplify(str);
        System.out.println(result);
    }

    static String simplify(String A) {
        Stack<String> st = new Stack<String>();
        String result = "";
        result += "/";
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";

            while (i < len_A && A.charAt(i) == '/')
                i++;

            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            if (dir.equals("..") == true) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (dir.equals(".") == true) {
                continue;
            } else if (dir.length() != 0) {
                st.push(dir);
            }
        }

        Stack<String> st1 = new Stack<String>();
        while (!st.isEmpty()) {
            st1.push(st.pop());
        }

        while (!st1.isEmpty()) {
            if (st1.size() != 1)
                result += (st1.pop() + "/");
            else
                result += st1.pop();
        }

        return result;
    }
}
