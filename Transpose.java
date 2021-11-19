public class transpose {
    public static void main(String args[]){
        int a[][]={{5,3,5},{2,6,7},{3,6,4}};
        int t_a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                t_a[i][j]=a[j][i];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(t_a[i][j]+" ");
            }
            System.out.println();
        }
    }
}