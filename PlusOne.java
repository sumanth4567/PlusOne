import java.util.Scanner;
public class PlusOne {
    public int [] plusOne(int nums[]){
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]=nums[i]+1;
                return nums;
            }
            nums[i]=0;
        }
        int newNumber[]=new int[nums.length+1];
        newNumber[0]=1;
        return newNumber;
    }
    public static void main(String[] args) {
        PlusOne po=new PlusOne();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the number of elements into the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int output[]=po.plusOne(nums);
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}
