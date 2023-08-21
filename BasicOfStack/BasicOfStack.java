package BasicOfStack;

import java.util.Stack;

public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // push the element into the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // print all the element
        System.out.println(st);

        for (int i=0; i<st.size(); i++){
            System.out.print(st.get(i)+" ");
        }
        System.out.println();

        System.out.println("Top of the element is : "+st.peek());

        // remove top element
         st.pop();

        System.out.println("Remove last element : "+st);

    }
}
