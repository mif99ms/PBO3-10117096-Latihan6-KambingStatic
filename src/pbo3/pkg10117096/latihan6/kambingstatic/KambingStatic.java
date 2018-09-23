/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA         : MIFTAH MUHAMMAD SIDQI
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk menampilkan data kambing
 */
public class KambingStatic {
   // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN ";
   


    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak " + 
                Mamalia.jumlahKambing);
    }
    
}
 

