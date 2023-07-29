public class EntireArr {
    public static void main(String[] args) {
        // 1D array
        int marks[]={99,95,90,85,80,80};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // 2D array
        int arr[][]={
                     {2,3,4},
                     {2},
                     {9,4,8}
                     };

          for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
          }           
    }
}
