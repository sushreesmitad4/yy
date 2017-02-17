package com.sus;

import java.util.Scanner;

public class TestMyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[ ][ ] aryNumbers = new String[6][5];
		String[ ][ ] ndArray=new String[2][4];*/
		//ndArry = {{"2","4","7","8"},{"3","4","5","2"}};
		
		
		
		//String[2][4] array = {{"2","4","7","8"},{"3","4","5","2"}};
//System.out.println(array[1][2]);
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String str= s.next();
        str+=s.nextLine();

        System.out.println(N*2);
        System.out.println(str);
	}

}
