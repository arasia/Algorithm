package question.p_85002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Programmers 85002

- 복서 정렬하기 (https://programmers.co.kr/learn/courses/30/lessons/85002)
*/
class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{50, 82, 75, 120}, new String[]{"NLWL", "WNLL", "LWNW", "WWLN"})));
        System.out.println(Arrays.toString(new Solution().solution(new int[]{145, 92, 86}, new String[]{"NLW", "WNL", "LWN"})));
        System.out.println(Arrays.toString(new Solution().solution(new int[]{60, 70, 60}, new String[]{"NNN", "NNN", "NNN"})));
    }

    public int[] solution(int[] weights, String[] head2head) {
        List<Player> playerList = new ArrayList<>();

        for (int i = 0; i < weights.length; i++) {
            playerList.add(new Player(i + 1, weights[i]));
        }

        for (int i = 0; i < head2head.length; i++) {
            for (int j = 0; j < head2head[i].length(); j++) {
                switch (head2head[i].charAt(j)) {
                    case 'W':
                        playerList.get(i).addWin(playerList.get(i).getWeight() < playerList.get(j).getWeight());
                        break;
                    case 'L':
                        playerList.get(i).addLose();
                        break;
                    default:
                }
            }
        }

        return playerList.stream()
                .sorted(getPlayerComparator())
                .mapToInt(Player::getNumber)
                .toArray();
    }

    private Comparator<Player> getPlayerComparator() {
        return Comparator.comparing(Player::getWinningRate, Comparator.reverseOrder())
                .thenComparing(Player::getWinForOverWeight, Comparator.reverseOrder())
                .thenComparing(Player::getWeight, Comparator.reverseOrder())
                .thenComparing(Player::getNumber, Comparator.naturalOrder());
    }

    private static class Player {
        private final int number;
        private final int weight;
        private int gameCount = 0;
        private int winningCount = 0;
        private int winForOverWeight = 0;

        public Player(int number, int weight) {
            this.number = number;
            this.weight = weight;
        }

        public int getNumber() {
            return number;
        }

        public int getWeight() {
            return weight;
        }

        public double getWinningRate() {
            if (gameCount == 0) {
                return 0;
            }

            return (double) winningCount / gameCount;
        }

        public int getWinForOverWeight() {
            return winForOverWeight;
        }

        public void addWin(boolean isOverWeightWin) {
            gameCount++;
            winningCount++;

            if (isOverWeightWin) {
                winForOverWeight++;
            }
        }

        public void addLose() {
            gameCount++;
        }
    }
}
