/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan62.livingthing;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program yang menampilkan 
 * tentang aktivitas seseorang (Sedang berjalan, Bernafas, Makan). 
 */
public abstract class LivingThing {
    
    
    public void walk(String nama){
    
    }
    
    public void breath(String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
}
