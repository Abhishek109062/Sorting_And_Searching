import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int size=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)>48 && s.charAt(x)<57)
                size++;
        }
        if(size>0)
        {
            int ar[]=new int[size];
            size=0;
            for(int x=0;x<s.length();x++)
            {
                if(s.charAt(x)>48 && s.charAt(x)<57)
                   ar[size++]=s.charAt(x)-48;
            }
            InsertionSort(ar);

            for(int i:ar)
                System.out.println(i);
        }
        else
            System.out.println("No digit found");
    }

    public static void InsertionSort(int ar[])
    {
        for(int x=1;x<ar.length;x++)
        {
            int temp=ar[x];
            int y=x;
            while(y>0 && ar[y-1]>temp)
            {
                ar[y]=ar[y-1];
                y--;
            }
            ar[y]=temp;
        }
    }
}
