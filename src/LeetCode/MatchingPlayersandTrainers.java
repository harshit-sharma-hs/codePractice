package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MatchingPlayersandTrainers {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count =0;
        List<Integer> list = new ArrayList<>();


//        for (int i = players.length - 1; i >= 0; i--) {
//            if (list.size() == trainers.length)
//                return list.size();
//            for (int j = 0; j < trainers.length ; j++) {
//                if (players[i] <= trainers[j] && !list.contains(j)) {
//                    list.add(j);
//                    break;
//                }
//            }
//        }
            int i=0,j=0;
        while(i<players.length && j<trainers.length)
        {
            if(players[i]<=trainers[j])
            {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        int a[] = {4,7,9};
        int b[]= {8,2,5,8};

        System.out.println(matchPlayersAndTrainers(a,b));
    }
}
