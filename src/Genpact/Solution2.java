package Genpact;


/*
i-[2,3,0,0,5,0,0,3,0,1]
o-[0,0,0,0,0,2,3,5,3,1]
 */
public class Solution2 {
    public static int[] shiftZero(int arr[])
    {
        int right = arr.length-1;
        int ans[]=new int[arr.length];
        int zeroCount=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==0)
                zeroCount++;
        int idx=0;
        while (zeroCount>0) {
            ans[idx++]=0;
            zeroCount--;
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                ans[idx++]=arr[i];

        return ans;
    }
    public static void main(String[] args) {
        int ans[] = shiftZero(new int[]{2,3,0,0,5,0,0,3,0,1});
        for (int i:ans)
            System.out.print(i+",");

    }
}
