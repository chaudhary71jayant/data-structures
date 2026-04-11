

public class LL  {
    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size =0;
    }

    //Insertion of new element from head
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    //Insert at tail
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Insert at middle with given index
    public void insert(int val,int index){
        if(index ==0 ){
            insertFirst(val);
            return;
        } 
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head; //to traverse through LL
        for(int i=1;i<index;i++){
            //starting from one because temp is already at zero so next it will start from 1
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    //Deletion
    //Deletion from head
    public int  deleteHead(){
        int val = head.value;
        if(head == null){
            tail = null;
        }
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <=1){
            return deleteHead();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0) return deleteHead();
        if(index == size-1) return deleteLast();

        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }

    public Node get(int index){// to get any of the element at the index
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("List ends here.");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
   
}

