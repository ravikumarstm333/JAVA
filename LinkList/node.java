public class node{
    int val;
    node next;
    public node(int val){
        this.val=val;
    }
    public void addNode(node a){
        this.next=a;
        this.val=a.val;
    }
}