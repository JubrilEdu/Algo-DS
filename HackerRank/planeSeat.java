package HackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JB on 4/8/19.
 */
public class planeSeat {

    public static void main(String[] args) {
        planeSeat pla = new planeSeat();
        System.out.println(pla.solution(1, " "));
    }

    public int solution(int N,String  seats) {
        String[] takenSeats = seats.split(" ");
        Map<String, Integer> seatMap = new HashMap<>();
        int familySeats = 0;
        for (int i = 0; i < takenSeats.length; i++) {
            seatMap.put(takenSeats[i], 1);
        }

        for (int i = 1; i <= N; i++) {
            if (!seatMap.containsKey(i + "A") && !seatMap.containsKey(i + "B") && !seatMap.containsKey(i + "C")) {
                familySeats++;
            }

            if (!seatMap.containsKey(i + "E") &&  !seatMap.containsKey(i + "F")) {
                if (!seatMap.containsKey(i + "D") || !seatMap.containsKey(i + "G")) {
                    familySeats++;
                }
            }

            if (!seatMap.containsKey(i + "H") && !seatMap.containsKey(i + "I") && !seatMap.containsKey(i + "J")) {
                familySeats++;
            }
        }

        return familySeats;
    }
    }

