/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearchtree;

/**
 *
 * @author firatgunay
 */
public class TreeNode {
    char harf;
    int isimSayisi;
    int sayaç = 0;
    TreeNode[] children;

    public TreeNode(char harf) {
        this.harf = harf;
        this.isimSayisi = 0;
        this.children = new TreeNode[29]; // Alfabe harf sayısı kadar çocuk düğüm oluşturulur
    }
}
