public class selection {
    public static void main(String[] args) {
        int ar[]={1,6,2,12,4556,453,-343};
        for(int x=0;x<ar.length;x++)
        {
            int index=x;
            for(int y=x;y<ar.length;y++)
            {
                if(ar[index]>ar[y])
                    index=y;
            }
            int temp=ar[x];
            ar[x]=ar[index];
            ar[index]=temp;

        }

        for(int x:ar)
            System.out.println(x);
    }
}
