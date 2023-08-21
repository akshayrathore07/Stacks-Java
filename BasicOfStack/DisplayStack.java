package BasicOfStack;

// Display using loop
import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //System.out.println(st);

//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            int x = rt.pop();
//            System.out.print(x +" ");
//            st.push(x);
//        }

        int n = st.size();
        int []arr = new int[n];

        for (int i=n-1; i>=0; i--){
//            int x = st.pop();
            arr[i] = st.pop();
        }

        for (int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
//            int x = arr[i];
            st.push(arr[i]);
        }
    }
}
