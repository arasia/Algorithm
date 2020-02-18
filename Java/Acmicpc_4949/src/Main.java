import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*
Acmicpc
- 균형잡힌 세상 (https://www.acmicpc.net/problem/4949)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while(true) {
                String line = br.readLine();
                if (line.equals(".")) {
                    break;
                }

                Stack<String> stack = new Stack<>();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if ((ch == '(') || (ch == '[')) {
                        stack.add(String.valueOf(ch));
                    }

                    if ((ch == ')')) {
                        if(stack.size() < 1) {
                            stack.add(String.valueOf(ch));
                            break;
                        }

                        char last = stack.pop().charAt(0);
                        if((last != '(')) {
                            stack.add(String.valueOf(last));
                            break;
                        }
                    }

                    if ((ch == ']')) {
                        if(stack.size() < 1) {
                            stack.add(String.valueOf(ch));
                            break;
                        }

                        char last = stack.pop().charAt(0);
                        if((last != '[')) {
                            stack.add(String.valueOf(last));
                            break;
                        }
                    }
                }

                if(stack.size() == 0) {
                    bw.write("yes\n");
                } else {
                    bw.write("no\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
