package com.example;

import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Введите первое и второе число через пробел: ");
        
        try {
            
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.print("выберите действие (+, -, *, /, %) - ");
            char op = sc.next().charAt(0);
            solve(a, b, op);
         } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число ");
            System.exit(1);
         }       
         
        
    }
    public static int solve(int a, int b, char op)
    {
        int ans = 0;
        
        if (op == '+') {
            ans = a + b;
            
        }
        else if (op == '-') {
            ans = a - b;
            
        }
        else if (op == '*') {
            ans = a * b;
            
        }
        else if (op == '%') {
            ans = a % b;
            
        }
        else if (op == '/') {
            if(b==0){
                System.out.println("На ноль делить нелььзя");
                System.exit(1);
            }
            ans = a / b;
        }
        
        
        System.out.println("Ответ " + ans);
        return ans;
    }
}
