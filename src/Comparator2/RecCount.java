package Comparator2;

public class RecCount {
	static int sount(int[] arr, int size, int v) {
		if (size > 0) {

			if (arr[size - 1] == v) {
				System.out.println("test1");
				return sount(arr, size - 1, v) + 1;
			} else {
				System.out.println("test2");
				return sount(arr, size - 1, v);
			}
		}
		System.out.println("test3");
		return 0;
	}

	public static void main(String[] args) {
		int[] ar = { 1};
		System.out.println(sount(ar, ar.length, 1));
	}
}