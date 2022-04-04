import org.w3c.dom.Node;

public class single {
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    Node head;
    single()
    {
        head=null;
    }

    public void add(int val)
    {
        Node temp=null;
        Node newnode=new Node(10);
        if(head==null)
            head=newnode;
        else{
            while(temp.next!=null)
                temp=temp.next;

            temp.next=newnode;
        }
    }
    public int  length()
    {
        int len=0;
        Node temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }

        return len;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }


    public boolean find(int x)
    {
        boolean flag=false;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.val==x){
                flag=true;
                break;
            }
        }

        return flag;
    }

    public void addx(int x){
        if(!find(x)){
            Node temp=head;
            while(temp.next!=null);
        }
    }


    public static void main(String[] args) {
     single obj=new single();
     obj.add(10);
     obj.add(20);
     obj.display();
        System.out.println(obj.length());
    }
}
