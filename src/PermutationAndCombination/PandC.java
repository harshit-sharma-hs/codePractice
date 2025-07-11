package PermutationAndCombination;

import java.util.ArrayList;
import java.util.List;

public class PandC {

    static List<List<Integer>> result;

    static void Permutatiom(int arr[], List<Integer> currList)
    {
        if(currList.size()==arr.length)
        {
            result.add(new ArrayList<>(currList));
            return;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(currList.contains(arr[i]))
                continue;
            currList.add(arr[i]);
            Permutatiom(arr,currList);
            currList.remove(currList.size()-1);
        }
    }

    static void Combination(int arr[], int idx, List<Integer> currList)
    {
        if(currList.size()!=0)
            result.add(new ArrayList<>(currList));

        for(int i=idx;i<arr.length;i++)
        {
            currList.add(arr[i]);
            Combination(arr,i+1,currList);
            currList.remove(currList.size()-1);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        result= new ArrayList<>();
     //   Permutatiom(arr,new ArrayList<>());
        Combination(arr, 0 ,  new ArrayList<>());
        System.out.println(result);
    }
}
