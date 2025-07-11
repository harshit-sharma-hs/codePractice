import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Part 1: NEXT GREATER ELEMENT
        int[] A1 = new int[N];
//        Stack<Integer> stack = new Stack<>();
//        for(int i = N - 1; i >= 0; i--) {
//            while(!stack.isEmpty() && stack.peek() <= A[i]) {
//                stack.pop();
//            }
//            A1[i] = stack.isEmpty() ? -1 : stack.peek();
//            stack.push(A[i]);
//        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] < A[j]) {
                    A1[i] = A[j];
                    break;
                } else
                    A1[i] = -1;
            }
            if (i == N - 1)
                A1[i] = -1;
        }
       int[] A2 = new int[N];
//        Stack<Integer> stack2 = new Stack<>();
//        for (int i = 0; i < N; i++) {
//            while (!stack2.isEmpty() && stack2.peek() >= A[i]) {
//                stack2.pop();
//            }
//            A2[i] = stack2.isEmpty() ? 0 : stack2.peek();
//            stack2.push(A[i]);
//        }
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<N;i++)
        {
            map.put(A[i],i);
        }

        for(int i=0;i<N;i++)
        {
            if(map.containsKey(A1[i]))
            {
                int val = A1[i];
                int idx = map.get(A1[i]);
                for(int j=idx-1;j>=0;j--)
                {
                    if(A[j]<val)
                    {
                        A2[i]=A[j];
                        break;
                    }
                    else
                        A2[i]=0;
                }
            }
            else
                A2[i]=0;
        }
        // Final Output
        for (int i = 0; i < N; i++) {
            System.out.print(A1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print(A2[i] + " ");
        }
    }
}