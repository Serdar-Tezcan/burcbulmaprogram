
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pursa
 */
public class burçBULMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int ay,gün;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****BURÇ BULMA PROGRAMINA HOŞGELDİNİZ****");
        System.out.println("Lütfen doğduğunuz ayı giriniz: ");
        ay = scan.nextInt();
        System.out.println("lütfen doğduğunuz günü giriniz: ");
        gün = scan.nextInt();
        
        if(ay == 1){
            if(gün>0 && gün<=20)
                System.out.println("burcunuz:OĞLAK");
                else if(gün>20 && gün<=31)
                    System.out.println("burcunuz:KOVA");
            else
                    System.out.println("hatalı gün girdiniz");
                        
                        }
        if(ay == 2){
            if(gün<=19)
                System.out.println("burcunuz:KOVA");
            else if(gün>=20)
                System.out.println("burcunuz:BALIK");
            else 
                System.out.println("hatalı gün girdiniz");
            
        }
        if (ay==3){
            if(gün<=20)
                System.out.println("burcunuz:BALIK");
            else if(gün>=21)
                System.out.println("burcunuz:KOÇ");
            else 
                System.out.println("hatalı gün girdiniz");
        }
        
        if (ay==4){
            if(gün<=20)
                System.out.println("burcunuz:KOÇ");
            else if(gün>=21)
                System.out.println("burcunuz:BOĞA");
            else
                System.out.println("hatalı gün girdiniz:");
        }
        if (ay==5){
            if(gün<=20)
                System.out.println("burcunuz:BOĞA");
            else if(gün>=21)
                System.out.println("burcunuz:İKİZLER");
            else
                System.out.println("hatalı gün girdiniz:");
        }
        if (ay==6){
            if(gün<=21)
                System.out.println("burcunuz:İKİZLER");
            else if(gün>=22)
                System.out.println("burucunuz:YENGEÇ");
            else
                System.out.println("hatalı gün girdiniz:");
        }
        if(ay==7){
            if(gün<=22)
                System.out.println("burcunuz:Yengeç");
            else if(gün>=23)
                System.out.println("burcunuz:ASLAN");
            else
                System.out.println("hatalı gün girdiniz:");
        }
        if(ay==8){
            if(gün<=23)
                System.out.println("burcunuz:ASLAN");
            else if(gün>=24)
                System.out.println("burucunuz:BAŞAK");
            else 
                System.out.println("hatalı gün girdiniz:");
        }
        if(ay==9){
            if(gün<=23)
                System.out.println("burucunuz:BAŞAK");
            else if(gün>=24)
                System.out.println("burcunuz:TERAZİ");
            else
                
              System.out.println("hatalı gün girdiniz:");          
        }
        if(ay==10){
            if(gün<=23)
                System.out.println("burucnuz:TERAZİ");
            else if(gün>=24)
                System.out.println("burcunuz:AKREP");
            else
                System.out.println("hatalı gün girdiniz:");
        }
        if(ay==11){
            if(gün<=22)
                System.out.println("burucunuz:AKREP");
            else if(gün>=23)
                System.out.println("burucnuz:YAY");
            else
                System.out.println("hatalı gün girdiniz:");
        }
        if(ay==12){
            if(gün<=21)
                System.out.println("burcunuz:YAY");
            else if(gün>=22)
                System.out.println("burcunuz:OĞLAK");
            else
                System.out.println("hatalı gün girdiniz");
        }
    
    
    }
    
}
