import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]={1,56,2,12,45,23};
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

        for(int i:ar)
            System.out.println(i);
    }
}
