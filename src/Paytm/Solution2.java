package Paytm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {

    public boolean courseScheduler(int arr[][],int nCourses)
    {
        List<List<Integer>> graph = new ArrayList<>();
        int degree[] = new int[nCourses];
        for(int i=0;i<nCourses;i++)
            graph.add(new ArrayList<>());

        for(int arr2[]:arr)
        {
            int a = arr2[0];
            int b = arr2[1];

            graph.get(b).add(a);
            degree[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        int count=0;

        for(int i=0;i<degree.length;i++)
            if(degree[i]==0)
                q.add(i);

        while(!q.isEmpty())
        {
            int curr= q.poll();
            count++;
            for(int i : graph.get(curr))
            {
                degree[i]--;
                if(degree[i]==0)
                    q.add(i);
            }
        }

        return count==nCourses;
    }
}
