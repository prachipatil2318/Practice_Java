public class jagged_array {
    // Jagged Array:- It is an 2-D array in which each row can have different number of columns.
    public static void main(String[] args) {
        // 10 20 30
        // 10 20 30 40 50
        // 10 20

        int[][] arr=new int[3][];
        arr[0]=new int [1];        
        arr[1]=new int [2];
        arr[2]=new int [3];
        int val=10;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // System.out.print(arr[i][j]+" ");
                arr[i][j]=val;
                System.out.print(arr[i][j]+" ");
                val+=10;
            }
            System.out.println();
        }

        

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }
}
