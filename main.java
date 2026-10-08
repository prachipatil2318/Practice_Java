public class main {
    public static void main(String[] args) {
        // For Loop
        // for(int i=1; i<=10; i++){
        //     System.out.println(i*5);
        // }   

        // while loop
        // int i=1;
        // while(i<=10){
        //     System.out.println(i*5);
        //     i++;
        // }

        // Do while loop
        // int i=1;
        // do {
        //     System.out.println(i*5);
        //     i++;
        // } while (i<=10);

        // Start pattern
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // Jump statement - Continue, break, return
        // Break 
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         // break;
        //         // continue;
        //     }
        //     System.out.println(i);
        // }

        // Arrays: Array is a container that stores multiple values of same type in single variable. Array represent a group of element of same data type. Data that is stored in array having continuous memory allocation. The indexing of array start from 0 to n-1(n=len of array). The size of the array cannot be increased at run time. 

            int[] num={2,4,6,8,10};
            int arr[]=new int[5];
            arr[0]=1;
            arr[1]=3;
            arr[2]=5;
            arr[3]=7;
            arr[4]=9;
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.print("Length of an array = ");
            System.out.println(arr.length);
                            
    }
}
