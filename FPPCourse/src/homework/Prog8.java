package homework;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		int min = arr[0];
		for(int num : arr) {
			if(num < min)
				min = num;
		}
		System.out.println("minimum Number is: "+min);

	}

}
