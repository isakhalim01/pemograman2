/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author fatim
 */import java.util.Scanner;
public class kelulusan {
    
    //prosedur,modifier,parameter
     void hasil(String nama, int nilai){
        String ket = keterangan(nilai);
        System.out.println("||\t Nama : "+nama);
        System.out.println("||\t Nilai : "+nilai);
        System.out.println("||\t Keterangan : "+ket);
        System.out.println("=====================================================================");
        System.out.println("Nama Mahasiswa "+nama+ " ,dinyatakan "+ket+" karena mendapat nilai "+nilai+".");
        System.out.println("=====================================================================");
    }
    
    //fungsi dan static
    static String keterangan(int x){
       if (x >70){
        return"Lulus";
        }
       else {return "Tidak Lulus";
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        kelulusan k=new kelulusan();
        
        System.out.println("===========================================");
        System.out.println("            Kelulusan Mahasiswa");
        System.out.println("===========================================");
        
        String nama;
        int nilai;
        System.out.print("  Masukkan Nama : ");
        nama=input.nextLine();
        System.out.print("  Masukkan Nilai : ");
        nilai=input.nextInt();
        System.out.println("===========================================");
        
        //pemanggilan
        k.hasil(nama, nilai); 
        
    }
    
       
    
}