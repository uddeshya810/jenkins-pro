package mypakg;

import java.util.Scanner;

public class Area {
	public int square(int s) {
		return s * s;
	}

	public double cuboid(int l, int b) {
		return l * b;
	}

	public int volumeofcube(int a) {
		return a * a * a;
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Value is =   gbbfng");
		Area obj = new Area();
		System.out.println("Enter the value of side of Square");
		int num;
		num =sc.nextInt();
		System.out.println("Value is = " + obj.square(num));
		System.out.println("Area 0f cuboid having value 8 and 9 = " + obj.cuboid(8, 9));
		System.out.println("Volume is having value 8 and 6  = " + obj.volumeofcube(8));
		System.out.println("Value is = " + obj.square(84));
	}

}
