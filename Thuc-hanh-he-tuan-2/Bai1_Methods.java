/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith_tuan2;

/**
 *
 * @author CCNE
 */
public class BaiTH_Tuan2 {

    public static int gcd(int a, int b) {
          if(a == 0 || b == 0) 
              return a+b ;
          while(a!=b){
              if(a>b) 
                  a -= b;
              else
                  b -= a;              
          }
          return a;
    }

    // compute the fibonacci of $n
    public static int fibonacci(int n) {
               if(n <= 1)
                   return n;
               else 
                   return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void sieveEratosthenes(int n) {
           boolean[] check =  new boolean[n+1];
           //gia su moi gia tri khoi tao delu la so nguyen to
           for(int i=2 ;i<n ;i++){
              check[i] = true;       
           }
           //so do la so ngto thi boi cua no cung la so nguyen to
           for(int i=2; i<n ;i++){
               if(check[i] == true){
                for(int j=2*i ;j <n ; j+=i){
                    check[j] = false;
                }
               }
           }
           for(int i=2 ; i<n ;i++){
              if(check[i] == true)
                  System.out.printf("%d ", i);
           }
    }
    public static void main(String[] args){
          System.out.println("Hello my PC!");
          //Run Command
          System.out.printf("UCLN(6,12) = %d\n" ,gcd(6,12));
          System.out.printf("So fibonacci thu 6 la %d\n" , fibonacci(6));
          
          System.out.println("Day fibonacci tu 1-6 la :");
          for(int i= 1; i<=6 ; i++){
             System.out.printf("%d " ,fibonacci(i) );
          }
          System.out.println("\nCac so nguyen to nho hon 8:");
          sieveEratosthenes(8);
          
    }
    
}
