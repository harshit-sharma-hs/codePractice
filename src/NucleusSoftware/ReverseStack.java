package NucleusSoftware;

import java.util.Stack;

public class ReverseStack {

    static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty())
            return;
        int top = st.pop();
        reverse(st);
        insertInBottom(top,st);
    }
    static void insertInBottom(int x,Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertInBottom(x,st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
