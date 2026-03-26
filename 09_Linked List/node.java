

public class node {

    int val;
    node next;
    public node(){
        this.val=0;
    }
    public node(int val) {
        this.val = val;
    }

    public void addNode(node a) {
        this.next=a;
    }

}
