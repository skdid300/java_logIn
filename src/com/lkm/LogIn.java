package com.lkm;

import java.util.Scanner;

public class LogIn {

	public LogIn() {
		
	}
	public static void logIn(){
		String id = "Administrator";
		String pw = "1234";
		int count = 0;
		Scanner scanner;
		
		do {
			scanner = new Scanner(System.in);
			System.out.print("아이디:");
			String inputID = scanner.next();
			System.out.print("비밀먼호:");
			String inputPW = scanner.next();
			
			
			if(inputID.equals(id)&& inputPW.equals(pw)){
				System.out.println("환영합니다!");
				
				break;
			}else{
				System.out.println("아이디 또는 비밀번호를 잘못 입력하셨습니다. 3회 실패시 제한됨.");
				count++;
			}
			
			
		} while (count<3);
		scanner.close();
		
		
		
	}

}
