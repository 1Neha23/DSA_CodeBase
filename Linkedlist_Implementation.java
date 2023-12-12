public class Linkedlist_Implementation {
    
    public static class Node 
    {
         int data ;
         Node next;
    }
    
    public static class Linkedlist
    {
        Node head;
        Node tail;
        int size;
        
        public void addLast(int val)      // Add every node at last
        {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            
            if(size ==0)
            {
                head=tail = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        
        public  void RemoveFirst()      // Remove first element of linked list
        {
            System.out.println("element is removed" +" " + head.data);
            
            if(size == 0)
            {
                System.out.println("list is empty");
            }
            else if(size == 1)
            {
                head = tail = null;
                size=0;
            }
            else
            {
                head = head.next;
                size--;
            }
        }
        
        public int getFirst(int val)     // // Get first node data
        {
            if(size ==0)
            {
                System.out.println("list is empty");
                return -1;
            }
            else
            {
                System.out.println("First value is :" + head.data);
                return head.data;
            }
        }
        
         public int getLast()            // Get last node data
        {
            if(size ==0)
            {
                System.out.println("list is empty");
                return -1;
            }
            else
            {
                System.out.println("last value is :" + tail.data);
                return tail.data;
            }
        }
        
         public int getAtIndex(int val)        // Get node data at particular index
        {
            if(size ==0)
            {
                System.out.println("list is empty");
                return -1;
            }
            else if(val <0 || val >=size)
            {
                 System.out.println("Invalid arguments");
                 return -1;
            }
            else
            {
                Node temp = head;
                for(int i =0; i < val ; i++)
                {
                    temp = temp.next;
                }
                 System.out.println(" value at :" + val +" " + "is " + " " + temp.data);
                return temp.data;
            }
        }
        
        public  int displaySize()         // display size
        {
            return size;
        }
        
        public  void display()
        {
            Node temp = head;
             System.out.println("Linked list Nodes are");
            while(temp != null)
            {
               
                System.out.println( temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {
        
        Linkedlist list = new Linkedlist();
        list. addLast(2);
        list.addLast(6);
        list.addLast(12);
        list.addLast(18);
        list.addLast(8);
        list.display();
        list.RemoveFirst();
        list.display();
        list.displaySize();
        list.getLast();
        list.getAtIndex(2);
        
        
    }
}
        
       