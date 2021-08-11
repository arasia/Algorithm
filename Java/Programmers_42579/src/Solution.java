import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Programmers 42579

- 배스트앨범 (https://programmers.co.kr/learn/courses/30/lessons/42579)
*/
public class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int length = genres.length;
        Map<String, Integer> genresCount = new HashMap<>();
        Map<String, List<Album>> genresAlbum = new HashMap<>();

        for (int i = 0; i < length; i++) {
            genresCount.put(genres[i], genresCount.computeIfAbsent(genres[i], s -> 0) + plays[i]);
            genresAlbum.computeIfAbsent(genres[i], s -> new ArrayList<>()).add(new Album(i, plays[i]));
        }

        List<String> sortedGenres = genresCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        for (String sortedGenre : sortedGenres) {
            genresAlbum.get(sortedGenre)
                    .stream()
                    .sorted(Comparator.comparing(Album::getPlays, Comparator.reverseOrder())
                            .thenComparing(Album::getIndex))
                    .limit(2)
                    .map(Album::getIndex)
                    .forEach(result::add);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private static class Album {
        private final int index;
        private final int plays;

        public Album(int index, int plays) {
            this.index = index;
            this.plays = plays;
        }

        public int getIndex() {
            return index;
        }

        public int getPlays() {
            return plays;
        }
    }
}
