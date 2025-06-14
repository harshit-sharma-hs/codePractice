package Greedy;

import java.util.Arrays;

public class TrainArrivalDeparture {

     // First solution Optimised solution

//    static int minPlatform(int arr[], int dep[]) {
//        int minPLatform = 1;
//        int maxDepTime = 0;
//        for (int i : dep)
//            maxDepTime = Math.max(maxDepTime, i);
//        int PlatformAccuriedArray[] = new int[maxDepTime + 2];
//
//        for (int i = 0; i < arr.length; i++) {
//            PlatformAccuriedArray[arr[i]]++;
//            PlatformAccuriedArray[dep[i] + 1]--; // if departure time is 940 then train must have been departed at 941 thats why it is used dep[i] +1
//        }
//        int platform = 0;
//        for (int i : PlatformAccuriedArray) {
//            platform += i;
//            minPLatform = Math.max(minPLatform, platform);
//        }
//        return minPLatform;
//    }


    //Second solution by sorting
    static int minPlatform(int[] arr, int[] dep) {
        int n = arr.length;

        // Step 1: Sort both arrays
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 0;      // Number of platforms needed at current time
        int maxPlatforms = 0;   // Result: maximum platforms needed at any time
        int i = 0, j = 0;       // i tracks arrivals, j tracks departures
        // Step 2: Traverse all trains
        while (i < n && j < n) {

            // If next train arrives before or exactly when one departs, need platform
            if (arr[i] <= dep[j]) {
                platforms++; // allocate a new platform
                i++;         // move to next arrival
            } else {
                platforms--; // a train has left, free up a platform
                j++;         // move to next departure
            }

            // Track the maximum platforms used at any point
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

public static void main(String[] args) {
    int[] arr = {900, 940, 950, 1100, 1500, 1800};
    int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
    System.out.println(minPlatform(arr, dep));

}
}
