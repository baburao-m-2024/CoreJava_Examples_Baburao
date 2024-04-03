package basics;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] marks = new int[4];   // valid index positions : 0,1,2,3
		
		System.out.println(marks.length);
		
		System.out.println();
		System.out.println();
		
		marks[0] = 90;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 99;
		/*
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);*/
		
	/*	for(int i=0; i<marks.length; i++) {
			
			System.out.println(marks[i]);
		}*/
		
		for(int temp : marks) {
			System.out.println(temp);
		}
		
	}

}
