/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearchtree;

/**
 *
 * @author firatgunay
 */
public class Agac {
    TreeNode root;

    public Agac() {
        root = new TreeNode('*'); // Root düğümü boş bir karakterle başlatılır
    }

    // İsim ekleme
    public void ekle(String isim) {
        root.isimSayisi++; // Root düğümü her zaman bir ismi temsil eder
    TreeNode current = root;

    for (int i = 0; i < isim.length(); i++) {
        char harf = Character.toUpperCase(isim.charAt(i)); // Harfi büyük harfe çevir
        int index = harf - 'A'; // Harfin alfabe içindeki indeksi hesaplanır

        if (index < 0 || index >= current.children.length) {
            System.out.println("Geçersiz karakter: " + harf);
            return;
        }

        if (current.children[index] == null) {
            current.children[index] = new TreeNode(harf);
        }

        current = current.children[index];
        current.isimSayisi++;
    }
    }

    // İsim güncelleme
    public void guncelle(String eskiIsim, String yeniIsim) {
       if (ara(eskiIsim)) {
        sil(eskiIsim);
        ekle(yeniIsim);
    } else {
        System.out.println("Güncellenmek istenen isim ağaçta bulunmuyor.");
    }
    }

    // İsim silme
    public void sil(String isim) {
       if (ara(isim)) {
        TreeNode current = root;

        for (int i = 0; i < isim.length(); i++) {
            char harf = Character.toUpperCase(isim.charAt(i));
            int index = harf - 'A';

            if (index < 0 || index >= current.children.length || current.children[index] == null) {
                System.out.println("Silmek istenen isim ağaçta bulunmuyor.");
                return;
            }

            current = current.children[index];
            current.isimSayisi--;
        }
    } else {
        System.out.println("Silmek istenen isim ağaçta bulunmuyor.");
    }
    }
    // İsim arama
    public boolean ara(String isim) {
        TreeNode current = root;

        for (int i = 0; i < isim.length(); i++) {
            char harf = isim.charAt(i);
            int index = Character.toUpperCase(harf) - 'A';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return (current != null && current.isimSayisi > 0);
    }

    // Ağacı inorder (sırasıyla) gezerek ekrana yazdırma
    public void inorder() {
        inorderRecursive(root, "");
    }

    private void inorderRecursive(TreeNode current, String addr) {
        if (current != null) {
        // Sadece isim sayısı pozitifse yazdır
        if (current.isimSayisi > 0) {
            current.sayaç++;
            System.out.println(addr + current.harf +" "+ current.sayaç);
        }

        for (int i = 0; i < current.children.length; i++) {
            inorderRecursive(current.children[i], addr + current.harf);
        }
    }
    }
}
