package Greedy;

import java.util.PriorityQueue;

public class MinimumCostofRopes {

    public static int minimumcost(int arr[]) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : arr)
            pq.add(i);

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;

            ans += cost;
            pq.add(cost);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};

        System.out.println(minimumcost(ropes));
    }
}
