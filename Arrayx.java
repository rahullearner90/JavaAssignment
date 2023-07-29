import java.util.Scanner;
public class Arrayx {
    public static void main(String[] args) {
        int marks1[]={99,95,90,85,80,80};
        int totalMarks=0;
        for(int i=0;i<marks1.length;i++){
            totalMarks += marks1[i];           
        }
        System.out.println(totalMarks+" outer");
        
        // dynamically initialization
        int totalMarks2=0;
        int marks2[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=marks2.length-1;i++){
            System.out.println("Enter Index "+i+"Value");
            marks2[i]=sc.nextInt();
            totalMarks2 += marks2[i];
        }
        System.out.println("Total Marks2 = "+totalMarks2);
        sc.close();
    }
}
