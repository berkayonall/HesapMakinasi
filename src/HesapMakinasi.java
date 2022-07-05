import java.util.Scanner;
public class HesapMakinasi {

    static int sum(int a, int b){
        int result = a+b;
        System.out.println("Toplam :" + result);
        return result;
    }
       static int minus (int a,int b){
        int result =a-b;
        System.out.println("Çıkarma" + result);
        return result;
    }
       static int carpma(int a, int b){
        int result =a*b;
        System.out.println("Çarpma" + result);
        return result;
       }
       static int bolme(int a,int b){
        if (b == 0){
            return 0;
        }

        int result =a/b;
        System.out.println("Bölme" + result);
        return result;
       }
       static int uslü(int a ,int b) {
           int result = 1;
           for (int i = 1; i <= b; i++) {
               result *= a;
           } return result;
       }
       static int mod(int a, int b ){
        int result = a%b;
        return result;

       }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1-Toplama işlemi \n"+
                "2-Çıkarma işlemi \n"+
                "3-Çarpma işlemi \n"+
                "4-Bölme işlemi \n"+
                "5-Üslü sayı hesaplama \n"+
                "6- Mod \n"+
                "7-Dikdörtgen Alan ve Çevre Hesaplama \n"+
                "0-Çıkış \n";
        while (true){
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz ");
            select = scan.nextInt();
            if (select == 0){
                break;
            }
            int a = scan.nextInt();
            int b = scan.nextInt();

            switch (select){
                case 1 :
                    sum(a,b);
                    break;
                case 2 :
                    minus(a,b);
                    break;

                case 3 :
                    carpma(a,b);
                    break;

                case 4 :
                    if (bolme(a,b)== 0){
                        System.out.println("İkinci Sayı 0 dan farklı olmalı");
                    }
                    break;
                case 5 :
                    System.out.println(uslü(a,b));
                    break;
                case 6 :
                    mod(a,b);
                    System.out.println("Mod" + mod(a,b));
            }
        }
        System.out.println("Güle Güle");

    }
}
