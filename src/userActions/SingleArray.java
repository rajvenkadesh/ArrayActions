package userActions;

public class SingleArray {
	
	int n;
	int[] arr;
	int len;
	
	SingleArray(int size){
		n = size;
		arr = new int[n];
		len = arr.length;
	}
	
	void insertAtEnd(int x){
		len = arr.length;
		if(len < n){
			arr[len] = x;
		}
		else{
			System.out.println("Array is full...! Cannot add element.");
		}
	}
	
	void insertAtSomePosition(int x, int pos){
		len = arr.length;
		if(len < n){
			int idx = pos - 1;
			for (int i = len -1; i >= idx; i--){
				arr[i+1] = arr[i];
			}
			arr[idx] = x;
		}
		else{
			System.out.println("Array is full. Cannot Add Element..!");
		}
			
	}
	
	void printArray(){
		len = arr.length;
		for(int i=0; i<len; i++){
			System.out.println("Array Element "+i+" : "+arr[i]);
		}
	}

}
