package question.p_84325;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*
Programmers 84325

- 직업군 추천하기 (https://programmers.co.kr/learn/courses/30/lessons/84325)
*/
class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        List<Job> jobList = new ArrayList<>();

        for (String s : table) {
            StringTokenizer st = new StringTokenizer(s);
            String jobName = st.nextToken();

            Map<String, Integer> points = new HashMap<>();

            for (int i = 5; i > 0; i--) {
                points.put(st.nextToken(), i);
            }

            jobList.add(new Job(jobName, points));
        }

        String recommendJob = jobList.get(0).getName();
        int maxPoint = jobList.get(0).getJobPointResult(languages, preference);

        for (int i = 1; i < jobList.size(); i++) {
            int currentPoint = jobList.get(i).getJobPointResult(languages, preference);

            if ((currentPoint > maxPoint)
                    || (currentPoint == maxPoint && recommendJob.compareTo(jobList.get(i).getName()) >= 0)) {
                recommendJob = jobList.get(i).getName();
                maxPoint = currentPoint;
            }
        }


        return recommendJob;
    }

    public static class Job {
        private final String name;
        private final JobPoint points;

        public Job(String name, Map<String, Integer> points) {
            this.name = name;
            this.points = new JobPoint(points);
        }

        public String getName() {
            return name;
        }

        public int getJobPointResult(String[] languages, int[] preference) {
            int currentPoint = 0;

            for (int i = 0; i < languages.length; i++) {
                currentPoint += points.getPoint(languages[i]) * preference[i];
            }

            return currentPoint;
        }
    }

    private static class JobPoint {
        private final Map<String, Integer> points;

        public JobPoint(Map<String, Integer> points) {
            this.points = points;
        }

        public Integer getPoint(String key) {
            return points.getOrDefault(key, 0);
        }
    }
}