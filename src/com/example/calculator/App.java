package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userInput="";

        while(!userInput.equals("exit")) {
            System.out.print("첫 번쨰 숫자를 입력하세요: ");
            int a = scanner.nextInt();
            System.out.print("두 번쨰 숫자를 입력하세요: ");
            int b = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operate = scanner.next().charAt(0);

            int result= cal.calculate(a, b, operate);


            if ((operate == '/' && b == 0) ) {
                continue;  // 다음 루프로 이동
            }

            System.out.println("결과: "+ result);

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료/ 아무 키 입력시 계속)");
            userInput=scanner.next();

        }
        System.out.println("계산 결과 목록: "+cal.getResult());
        cal.setResult(2,3);
        System.out.println("계산 결과 목록: "+cal.getResult());
        cal.removeResult();
        System.out.println("계산 결과 목록: "+cal.getResult());

        System.out.println("시스템을 종료합니다");
        scanner.close();
    }
}
