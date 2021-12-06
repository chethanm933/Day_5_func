package functionalproblems;

public class FindTriplets {
	public static void main(String[] args) {
		int[] arr = {0,-5,-3,4,1,2,5};
		int n = arr.length;

	FindTriplets findtriplets = new FindTriplets();
	findtriplets.tripletCode(arr, n);
	
	}

	public void tripletCode(int[] arr, int n) {
		for (int i = 0; i <= n-2; i++) {
			for (int j = i+1; j <= n-1; j++) {
				for (int k = j+1 ; k <= n; k++) {
					if(arr[i] + arr[j] + arr[k] == 0 ) {
					System.out.println(+arr[i]+"\t" + arr[k]+ "\t" + arr[k]  );
				} else {
					System.out.println("not exist");
					}
				}	
			}
		}
	}
}

