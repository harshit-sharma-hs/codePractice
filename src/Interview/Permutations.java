package Interview;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static List<List<Integer>> permutation(int arr[])
    {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(list,temp,arr);
        return list;
    }

    static void backtrack(List<List<Integer>> list,List<Integer> temp,int arr[])
    {
        if(temp.size()==arr.length){
            list.add(new ArrayList<>(temp));
            return;
        }


        for(int num : arr)
        {
            if(temp.contains(num))
                continue;
            temp.add(num);
            backtrack(list,temp,arr);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};

        List<List<Integer>> list = permutation(arr);


        System.out.println(list);

    }
}
