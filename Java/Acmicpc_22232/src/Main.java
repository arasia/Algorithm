import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/*
Acmicpc 22232

- 가희와 파일 탐색기 (https://www.acmicpc.net/problem/22232)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            List<File> fileList = new ArrayList<>();
            Set<String> extensionSet = new HashSet<>();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), ".");
                fileList.add(new File(st.nextToken(), st.nextToken()));
            }

            for (int i = 0; i < m; i++) {
                extensionSet.add(br.readLine());
            }

            fileList.sort(fileComparator(extensionSet));

            for (File file : fileList) {
                bw.write(file.toString() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Comparator<File> fileComparator(Set<String> extensionSet) {
        return Comparator.comparing(File::getName)
                .thenComparing(File::getExtension, extensionContainCheck(extensionSet))
                .thenComparing(File::getExtension);
    }

    private static Comparator<String> extensionContainCheck(Set<String> extensionSet) {
        return (o1, o2) -> {
            boolean check1 = extensionSet.contains(o1);
            boolean check2 = extensionSet.contains(o2);

            if (check1 == check2) {
                return 0;
            }

            if (check1) {
                return -1;
            }

            return 1;
        };
    }

    public static class File {
        private final String name;
        private final String extension;

        public File(String name, String extension) {
            this.name = name;
            this.extension = extension;
        }

        public String getName() {
            return name;
        }

        public String getExtension() {
            return extension;
        }

        @Override
        public String toString() {
            return name + "." + extension;
        }
    }
}
