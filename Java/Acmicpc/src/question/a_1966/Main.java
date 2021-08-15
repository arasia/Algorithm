package question.a_1966;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc
- 프린터 큐 (https://www.acmicpc.net/problem/1966)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int testCase = Integer.parseInt(br.readLine());

            while (testCase-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                Queue<Document> queue = new ArrayDeque<>();

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < N; i++) {
                    queue.add(new Document(i, Integer.parseInt(st.nextToken())));
                }

                int count = 0;
                while(!queue.isEmpty()) {
                    Document current = queue.poll();
                    boolean check = true;
                    for (Document document : queue) {
                        if(current.compare(document)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        count++;
                        if (current.getIndex() == M) {
                            bw.write(count + "\n");
                            break;
                        }
                    } else {
                        queue.add(current);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Document {
        private int index;
        private int level;

        public Document(int index, int level) {
            this.index = index;
            this.level = level;
        }

        public int getIndex() {
            return index;
        }

        public int getLevel() {
            return level;
        }

        public boolean compare(Document document) {
            return this.level < document.getLevel();
        }
    }
}
