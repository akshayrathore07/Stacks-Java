package BasicOfStack;

import java.util.Stack;

public class CopyElementInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        System.out.println("Size of the element is : "+ st.size());
        int n = st.size();
        Stack<Integer> temp = new Stack<>();
        for (int i=0; i<n ; i++){
//            int x = st.peek();
//            temp.push(x);
//            st.pop();
            temp.push(st.pop());

        }
        Stack temp2 = new Stack();
        for (int i=0; i<n; i++){
//            int x = temp.peek();
//            temp2.push(x);
//            temp.pop();

            temp2.push(temp.pop());

        }
        System.out.println(temp2);
    }
}
