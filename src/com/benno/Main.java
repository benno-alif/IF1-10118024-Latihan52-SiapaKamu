package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Siapa Kamu?!
     */

public class Main {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        mhs.setNim("10110269");
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO");

        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.println();

        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
