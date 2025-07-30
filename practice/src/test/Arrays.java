package test;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array: Very big bucket, having multiple slots
		int arr[] = new int[5]; //the number of slots in the bucket
		
		//slot1, slot2, slot3, slot4, slot5
		//0,1,2,3,4 = index of array
		//initially we have 0 in each slot
		
		arr[1] = 4;
		arr[0] = 3;
		arr[2] = 5;
		arr[3] = 10;
		
		//minimum index of array is 0 
		//maximum index of arrya is length - 1
		//arr[10] = 100; not allowed gives ArrayIndexOutOfBoundsException
		
		//arr[4] = "Gauree"; type missmatch error
		
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		
		int arr1[] = new int[] {1,2,3,4};
		System.out.println(arr1[2]);
		
		//string array: initialised with null
		String arr2[] = new String[4];
		arr2[0] = "hello";
		arr2[1] = "Gauree";
		
		System.out.println(arr2[0]);
		System.out.println(arr2[3]);
		
		
	}

}
