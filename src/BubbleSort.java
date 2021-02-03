import java.util.Scanner;  
public class BubbleSort {

	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
		BubbleSort ob = new BubbleSort();
		int len;
		System.out.println("Enter length of array: ");  
		len=sc.nextInt();
		int[] arr = new int[len];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<len; i++)  
		{  
		  
		arr[i]=sc.nextInt();  
		}  
		
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.print(arr);
	}
}
		

	


