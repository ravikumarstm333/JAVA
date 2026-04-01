import java.util.Scanner;

class main{
    static void print(node a){
        if(a.next!=null){
            print(a.next);
            System.out.print(a.val+" ");
        }
    }
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the test case: ");
        int t=sc.nextInt();
        System.out.print("Enter "+t+" nodes: ");
        node tail=new node();
        node head=tail;
        node temp=tail;
        while(t>0){
            int val=sc.nextInt();
            node newNode=new node(val);
            if(tail.val==0){
                tail.val=newNode.val;
                head=tail;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            t--;
        }
        while(head.next!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println(head.val);
        print(temp);
    }
}