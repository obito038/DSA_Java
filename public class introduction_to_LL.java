public class introduction_to_LL {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8};
        Node y = new Node(arr[3]);
        System.out.println(y.data);
    }
}

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next =null;
    }
}

