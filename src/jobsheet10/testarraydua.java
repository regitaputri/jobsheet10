/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author ASUS
 */
public class testarraydua {
int nis [][] = {{210650},{210651},{210652}};
String nama [][] = {{"Ade"},{"Galih "},{"Baihaqi"}};
public void tampil(String n){
    System.out.println("Identitas siswa angkatan 24");
}
public void namanis (int n){
for (int i = 0; i< 1; i++){
for (int j = 0; j < 1; j++){
    System.out.println(nama[1][j]+":"+nis[1][j]);
}
}
}
public static void main (String[]args){
testarraydua siswa = new testarraydua();
siswa.tampil(null);
siswa.namanis(0);

}
	}


