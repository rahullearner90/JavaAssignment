public class FindIndex {
    public static void main(String[] args) {
        // array
        int arr[]={2,4,3,5,9,7,8};
        // I want to print 3rd index of element
        System.out.println(arr[3]);

        // suppose i don't know index and i want to print value 5 than
        for(int a:arr){
            if(a==5){
                System.out.println("Result "+a);
            }
        }
    }
}
