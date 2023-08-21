package BasicOfStack;

// Display in reverse order
import java.util.Stack;

public class DisplayStackRecursively {

    public static void displayRec(Stack<Integer> s){
        if (s.size()==0){
            return;
        }
        int top = s.pop();
        System.out.print(top+" ");
        displayRec(s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // before recursively
        System.out.println(st);

        //After recursively
        displayRec(st);

    }
}
