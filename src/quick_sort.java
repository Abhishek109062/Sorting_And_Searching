import java.util.Scanner;

public class quick_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[sc.nextInt()];
        for(int x=0;x<ar.length;x++)
            ar[x]=sc.nextInt();

        quicksort(ar,0,ar.length-1);



        for(int x=0;x<ar.length;x++)
            System.out.println(ar[x]);
    }

    public static void quicksort(int ar[],int start,int end)
    {
        if(start<end)
        {
            int pivot=partition(ar,start,end);
            quicksort(ar,start,pivot-1);
            quicksort(ar,pivot+1,end);
        }
    }

    public static int partition(int ar[],int p,int q)
    {
        int pivot=q;
        int i=p-1;
        for(int x=p;x<=q;x++)
        {
            if (ar[x]<=ar[pivot]){
                i++;
                int temp=ar[i];
                ar[i]=ar[x];
                ar[x]=temp;
            }
        }
        return i;
    }
}
