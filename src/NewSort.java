import java.util.Scanner;
//SelectionSortProgram
public class NewSort {
	void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	NewSort ob = new NewSort();
	int len;
	System.out.println("Enter length of array: ");  
	len=sc.nextInt();
	int[] arr = new int[len];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<len; i++)  
	{  
	  
	arr[i]=sc.nextInt();  
	}  
	
    ob.sort(arr);
    System.out.println("Sorted array");
    ob.print(arr);
}
}