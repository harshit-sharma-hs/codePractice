package PermutationAndCombination;

import java.util.ArrayList;
import java.util.List;

public class universalWay {

    static List<List<Character>> result;

    static void permute(char[] arr, boolean[] used, List<Character> list){

        if(list.size()==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(used[i])
                continue;

            used[i]=true;
            list.add(arr[i]);
            permute(arr,used,list);
            list.remove(list.size()-1);
            used[i]=false;

        }

    }

    public static void main(String[] args) {
        String str ="abc";
        result=new ArrayList<>();
        char[] arr = str.toCharArray();
        boolean used[] =new boolean[arr.length];
        permute(arr,used,new ArrayList<>());
        System.out.println(result);
    }
}
