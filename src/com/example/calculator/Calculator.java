package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> answer;

    // 결과값들 저장할 공간 만들기
    public Calculator() {
        answer = new ArrayList<>();
    }

    // +,-,*,/ 계산 해주기
    public int calculate(int firstNum, int secondNum, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    //throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                result = firstNum / secondNum;
                break;
            default:
                //throw new IllegalArgumentException("잘못된 연산 기호입니다.");
                System.out.println("잘못된 연산 기호입니다.");
        }
        answer.add(result);
        return result;
    }

    // getter method 이용하여 다른 클래스에서 여태까지 산출한 값들 호출 가능캐 하기
    public List<Integer> getResult(){
        return answer;
    }

    // setter method 이용하여 다른 클래스에서 특정 index값 설정 가능
    public void setResult(int index, int value){
        if (index >= 0 && index < answer.size()) {
            answer.set(index, value);
        } else {
            System.out.println("잘못된 인덱스입니다.");
        }
    }

    // 리스트가 비어있는지 확인하고, 비어있지 않다면 첫번째 값 삭제.
    public void removeResult(){
        if(answer.isEmpty()){
            System.out.println("비어있습니다");
        }
        else{
            answer.remove(0);
        }
    }
}
