/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchtree;

import java.util.Scanner;

/**
 *
 * @author firatgunay
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Agac agac = new Agac();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Yapmak istediginiz islemi secin:");
            System.out.println("1. isim Ekle");
            System.out.println("2. isim Güncelle");
            System.out.println("3. isim Sil");
            System.out.println("4. isim Ara");
            System.out.println("5. Agaci Goster");
            System.out.println("6. Cikis");

            if (scanner.hasNextInt()) {
                int secim = scanner.nextInt();
                scanner.nextLine(); 

                switch (secim) {
                    case 1:
                        System.out.println("Eklemek istediğiniz ismi girin:");
                        String isimEkle = scanner.nextLine();
                        agac.ekle(isimEkle);
                        break;
                    case 2:
                        System.out.println("Güncellemek istediğiniz ismi girin:");
                        String eskiIsim = scanner.nextLine();
                        System.out.println("Yeni ismi girin:");
                        String yeniIsim = scanner.nextLine();
                        agac.guncelle(eskiIsim, yeniIsim);
                        break;
                    case 3:
                        System.out.println("Silmek istediğiniz ismi girin:");
                        String silinecekIsim = scanner.nextLine();
                        agac.sil(silinecekIsim);
                        break;
                    case 4:
                        System.out.println("Aramak istediğiniz ismi girin:");
                        String arananIsim = scanner.nextLine();
                        if (agac.ara(arananIsim)) {
                            System.out.println(arananIsim + " ağaçta bulunuyor.");
                        } else {
                            System.out.println(arananIsim + " ağaçta bulunmuyor.");
                        }
                        break;
                    case 5:
                        System.out.println("Agac Durumu:");
                        agac.inorder();
                        break;
                    case 6:
                        System.out.println("Cikis yapiliyor...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Geçersiz seçim. Tekrar deneyin.");
                        break;
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı girin.");
                scanner.nextLine();
            }
        }
    }
    
}
