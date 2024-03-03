package atm1;

import java.util.Scanner;

public class ATM1 {
    
    public static void main(String[] args) {
        
        // While döngüsü ile atm programı yazmaya çalış
        // İşlemler: 1.Bakiye öğrenme 2.Para çekme 3.Para yatırma Çıkış: q
       Scanner scanner = new Scanner (System.in);
       int bakiye = 1000;
       String işlemler = "1.Bakiye öğrenme \n"
               + "2.Para çekme \n"
               + "3.Para yatırma \n"
               + "Çıkış: q" ;
       
        System.out.println("****************");
        System.out.println(işlemler);
        System.out.println("****************");
        
        while(true){
            
            System.out.print("İşlemi seçiniz:");
            String işlem = scanner.nextLine();
            if(işlem.equals("q")) //kontrol ediyoruz.
            {
                System.out.println("programdan çıkılıyor...");
                break;
            }
            else if(işlem.equals("1"))
            {
                System.out.println("Bakiyeniz: " +bakiye);
            }
            else if(işlem.equals("2"))
            {
                System.out.print("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt(); //nextLine'dan sonra nextInt kullanacak olursak nextInt sonrasında bir tane daha nextLine yazarız.
                scanner.nextLine();
                if(tutar > bakiye)
                {
                    System.out.println("Bakiye aşımı! Bakiyeniz: " +bakiye);
                }
                else
                {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: "+bakiye);
                }
            }
            else if(işlem.equals("3"))
            {
                System.out.print("Yatırmak istediğiniz tutar: ");
                int yatırma = scanner.nextInt(); //hatayı önlemek için nextLine kullanırız.
                scanner.nextLine();
                bakiye += yatırma;
                System.out.println("Yeni bakiyeniz: "+bakiye);
            }
            else 
            {
                System.out.println("Hatalı işlem!");
            }
        }
    }
    
}
