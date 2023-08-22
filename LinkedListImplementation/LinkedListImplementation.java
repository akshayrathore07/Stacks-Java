package LinkedListImplementation;

import ArrayImplementation.ArrayImplementation;

public class LinkedListImplementation {

    public static class Node{ // user define data type
        int val;
        Node next;
        Node(int data){
            this.val = data;
        }
    }

    public static class LLStack{ // user define data structure
        private Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head = temp;
            size++;
        }

        int pop(){
            if (head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){
            if (head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }

        void displayRec(Node h){

            if (h == null){
                return;
            }

            displayRec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){  // getter
            return size;
        }

        boolean isEmpty(){
            if (size()==0){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(0);
        st.push(100);
    }
}
