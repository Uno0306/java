package step02.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Ex04InOut {
	public static void main(String[] args) {
		// Stack : LIFO(Last In First Out) 구조
		// - (재귀적)함수를 호출해서 사용할 때
		// - 그래프의 깊이 우선 탐색(DFS)
		// - 깊이우선탐색
		
		Stack<String> card = new Stack<String>();
		
		//push : 저장
		card.push("Busan");
		card.push("Dongbaek");
		
		System.out.println(card);
		
		// peek : 반환
		System.out.println(card.peek());
		System.out.println(card);
		
		// pop : 반환 & 삭제
		System.out.println(card.pop());
		System.out.println(card);
		
		System.out.println();
		
		// Queue : FIFO(Fist In First Out) 구조
		// - 그래프의 넓이 우선 탐색(BFS)에서 사용
		
		Deque<String> drinkBox = new LinkedList<String>();
		
		// add
		drinkBox.add("Coke");
		drinkBox.add("Sprite");
		drinkBox.add("DrPepper");
		
		System.out.println(drinkBox);
		
		// peek
		System.out.println(drinkBox.peek());
		System.out.println(drinkBox);
		
		// pop
		System.out.println(drinkBox.pop());
		System.out.println(drinkBox);
	}

}