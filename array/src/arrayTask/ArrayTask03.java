package arrayTask;

import java.util.Scanner;

public class ArrayTask03 {
   public static void main(String[] args) {
//      플레티넘
//      1. 사용자의 입력값을 변환
//      사용자에게 입력 받은 문자열 중 소문자는 대문자로, 대문자는 소문자로 변환하여 모두 배열에 담고 출력
//      입력 예시) 안녕 hi!
//      출력 예시) 안녕 HI!
      
//      "".toUpperCase();
//      "".toLowerCase();
//      Scanner sc = new Scanner(System.in);
//      String message = "대문자 또는 소문자로 변경할 내용을 입력하세요.\nex)안녕 hi!",
//            input = null;
//      char[] result = null;
//      int gap = 32;
//      
//      System.out.println(message);
//      input = sc.nextLine();
//      result = new char[input.length()];
//      
//      for(int i = 0; i < input.length(); i++) {
//         char c = input.charAt(i);
//         if(c >= 65 && c <= 90) {
//            // 대문자
//            result[i] += (char)(c + gap);
//         }else if(c >= 97 && c <= 122) {
//            // 소문자
//            result[i] += (char)(c - gap);
//         }else {
//            result[i] += c;
//         }
//      }
//      
//      for(int i = 0; i < result.length; i++) {
//         System.out.print(result[i]);
//      }
      
//      2. 사용자가 입력한 모든 값을 반대로 뒤집어서 모두 배열에 담고 결과를 출력
//      입력 예시) apple
//      출력 예시) elppa
      Scanner sc = new Scanner(System.in);
      String message = "반대로 뒤집을 글자를 입력하세요.", input = null;
      char[] result = null;
      
      System.out.println(message);
      input = sc.nextLine();
      result = new char[input.length()];
      
      for(int i = 0; i < input.length(); i++) {
         result[i] = input.charAt(input.length() - i - 1);
         System.out.print(result[i]);
      }
   }
}



















