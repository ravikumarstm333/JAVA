class main{
    public static void main(String[] arge){
        node n1=new node(8);
        node n2=new node(9);
        node n3=new node(10);
        node n4=new node(11);
        node n5=new node(12);
        n1.addNode(n2);
        n2.addNode(n3);
        n3.addNode(n4);
        n4.addNode(n5);
        node head=n1;
        while(head.next!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}