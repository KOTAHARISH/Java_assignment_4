public class add_matrix {
    public static void main(String args[])
    {
        int i,j;
        int a[][]={{1,2,3},{3,4,2},{3,1,5}};
        int b[][]={{5,3,5},{2,6,7},{3,6,4}};
        int c[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}