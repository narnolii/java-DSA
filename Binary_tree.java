
public class Binary_tree {

    public static void main(String[] args)   
    {  
        new Binary_tree().run();  
    }  

    static class Node(){
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }

    public void run(){
      Node rootnode  = new Node(25);

      insert(rootnode , 2);
      insert(rootnode , 89);
      insert(rootnode , 6);
      insert(rootnode , 24);
      insert(rootnode , 9);
      insert(rootnode , 78);
      insert(rootnode , 1);

    }
    public static void  insert(Node node , int data){
        if(data<node.data){
            if(node.left != null){
                insert(node.left , data);
            }else{
                System.out.println("  Inserted " + value + " to left of Node " + node.value);  
                node.left = new node(data);
            }
        }
        else if(data>node.data){
            if(node.right!=null){
                insert(node.right,data);
            }else{
                System.out.println("  Inserted " + value + " to right of Node " + node.value); 
                node.right = new node(data);
            }
        }


    }

    
    
}
