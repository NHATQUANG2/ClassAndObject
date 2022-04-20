package advance;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Student arr[] = new Student[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao 10 hoc sinh");
		for (int i = 0; i < arr.length; i++) {	
			arr[i] = new Student();
			System.out.println("nhap ten");
			arr[i].name = sc.nextLine();
			System.out.println("nhap tuoi");
			arr[i].old = sc.nextInt();
			System.out.println("nhap dia chi");
			arr[i].diachi = sc.nextLine();
			sc.nextLine();			
			System.out.println("nhap diem trung binh");
			arr[i].dtb = sc.nextFloat();
			sc.nextLine();			
			
		}
		in(arr);
	}
	static void in(Student arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}	
	
		
	
		
	


