/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
         //Zad. 3.3 (rekurencyjnie)
        
        /*int a, b;
        System.out.println("Podaj podstawe: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Podaj wykladnik: ");
        b = scanner.nextInt();
        System.out.println("wynik = " +potega(a,b));
    }
    static int potega(int a, int b){
        if(b==0)
            return 1;
        if(b%2==1)
            return a=a*potega(a, b-1); 
        if(b%2==0)
        {
            int wynik = potega(a, b/2);
            return wynik*wynik;
                    
        }
        return 0;    
    } */
        
     //Zad. 3.3 (iteracyjnie)
       /* int a, b;
        System.out.println("Podaj podstawe: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Podaj wykladnik: ");
        b = scanner.nextInt();
        System.out.println("wynik = " +potega(a,b));
    }
    static int potega(int a, int b){
        int wynik = 1;
       while(b>0)
       {
           wynik=wynik*a;
           b--;
       }
       return wynik;
    } */
        
    //Zad. 3.4
    /*int n; 
    System.out.println("Podaj nr wyrazu ciagu: ");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    System.out.println(" " +fibo(n));
    }
    static int fibo(int n){
        if(n<=2)
        {
            return 1;
        }
        else
        {
           return fibo(n-1)+fibo(n-2);
        }*/
      
        //Zad. 2.2
        
        String s = "Hello world";
        char [] ch=s.toCharArray(); //Metoda konwertuje łańcuch znaków na tablicę znaków. 
        for(int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]);
        }
        
        String s1 = "Hello";
        byte [] b = s1.getBytes();//Metoda zwraca sekwencję bajtów.
        for(int i=0; i<b.length; i++)
        {
            System.out.println(b[i]);
        }
        
        String s2 = "Hello world";
        String s3 = "Hello world";
        String s4 = "Hello";
        boolean ret;
        ret = s2.equals(s3); //Metoda zwraca true jeżeli łańcuch znaków sa "takie same", w przeciwnym wypadku false.
        System.out.println(" " +ret);
        ret = s2.equals(s4);
        System.out.println(" " +ret);
        
        String s5 = "Ala ma kota";
        String s6 = "ALA MA KOTA";
        String s7 = "Hello";
        System.out.println(s5.equalsIgnoreCase(s6));//Metoda dział‚a podobnie jak poprzednia, dodatkowo ignoruje rozmiary liter.
        System.out.println(s5.equalsIgnoreCase(s7));
        
        System.out.println(s5.indexOf("k"));//Zwraca indeks pierwszego wystąpienia znaku.
      
        System.out.println(s5.lastIndexOf("a"));//Zwraca indeks ostatniego wystąpienia znaku.
        
        String s8 = "Netbeans";
        System.out.println(s8.substring(3));//Zwraca podciąg łańcucha znaków zaczynający się od podanego indeksu.
        System.out.println(s8.substring(1,5));//Zwraca podciąg łąńcucha znaków zaczynający się i kończący się na podanych indeksach. 
        //Przy czym początkowy indeks jest włączny a k0ńcowy wyłączny. 
        
        String s9 = "Programowanie obiektowe";
        System.out.println(s9.replace('o','p'));//Zamienia pierwszą podaną literę w łańcucha na tę podaną jaką drugą. 
        
        System.out.println(s9.trim()+"Lab3");//Dołączamy ciąg znaków
        
        String s10 = "PROGRaMoWAnie OBiektOWE";
        System.out.println(s10.toLowerCase());//Zamienia duże litery na małe
        
        System.out.println(s9.toUpperCase());//Zamienia małe na duże.
         
    } 
}

    
    

