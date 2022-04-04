import java.util.Scanner;

public class Codevita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String po[]=sc.nextLine().split(" ");
        int size=Integer.parseInt(po[0]);
        int ar[][]=new int[size][size];
        po=sc.nextLine().split(",");
        int rp=Integer.parseInt(po[0]);
        int cp=Integer.parseInt(po[1]);
        int y=2*size;
        while(y>0)
        {
            po=sc.nextLine().split(",");
            sc.nextLine();
            ar[Integer.parseInt(po[0])][Integer.parseInt(po[1])]=sc.nextInt();
            System.out.println("");

        }



    }
}
