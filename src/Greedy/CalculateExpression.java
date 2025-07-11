package Greedy;

import java.util.Stack;

public class CalculateExpression {

    public static void main(String[] args) {
        String str ="12-2-(3-78)";

        int curr =0;
        int ans =0;
        int sign =1;
        int len = str.length();
        Stack<Integer> st =new Stack<>();

        for(int i=0;i<len;i++)
        {

            if(Character.isDigit(str.charAt(i))){
                curr=str.charAt(i)-'0';

                while(i+1<len && Character.isDigit(str.charAt(i+1)))
                {
                    curr = curr*10 + str.charAt(i+1)-'0';
                    i++;
                }
                curr=curr*sign;
                ans+=curr;
                curr=0;
            }
            else if(str.charAt(i)=='-')
                sign=1;
            else if(str.charAt(i)=='-')
                sign=-1;

            else if (str.charAt(i)=='(') {
                st.push(ans);
                st.push(sign);
                ans=0;
                sign=1;

            }
            else if(str.charAt(i)==')')
            {
                int prevSign = st.pop();
                ans=ans*prevSign;
                int prevAns = st.pop();
                ans=ans+prevAns;
            }


        }

        System.out.println(ans);

    }
}
