package Question.No1931;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Acmicpc 1931

- 회의실 배정 (https://www.acmicpc.net/problem/1931)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int totalBookingCount = Integer.parseInt(br.readLine());
            List<BookingInfo> bookingInfos = new ArrayList<>();

            for (int i = 0; i < totalBookingCount; i++) {
                String[] strings = br.readLine().split(" ");
                bookingInfos.add(new BookingInfo(Integer.parseInt(strings[0]), Integer.parseInt(strings[1])));
            }

            Collections.sort(bookingInfos);

            bw.write(Integer.toString(bookingSolution(bookingInfos)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int bookingSolution(List<BookingInfo> bookingInfos) {
        int result = 0;
        int lastFinishTime = -1;

        for (BookingInfo bookingInfo : bookingInfos) {
            if (lastFinishTime <= bookingInfo.getStartTime()) {
                result++;
                lastFinishTime = bookingInfo.getLastTime();
            }
        }

        return result;
    }

    static class BookingInfo implements Comparable<BookingInfo> {
        private final int startTime;
        private final int lastTime;

        public BookingInfo(int startTime, int lastTime) {
            this.startTime = startTime;
            this.lastTime = lastTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public int getLastTime() {
            return lastTime;
        }

        @Override
        public String toString() {
            return "BookingInfo{" +
                    "startTime=" + startTime +
                    ", lastTime=" + lastTime +
                    '}';
        }

        @Override
        public int compareTo(BookingInfo o) {
            int compareResult = Integer.compare(this.getLastTime(), o.getLastTime());

            if (compareResult == 0) {
                compareResult = Integer.compare(this.getStartTime(), o.getStartTime());
            }

            return compareResult;
        }
    }
}
