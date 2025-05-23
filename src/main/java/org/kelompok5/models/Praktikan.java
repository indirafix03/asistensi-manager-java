package org.kelompok5.models;

public class Praktikan extends User {
    private KartuKontrol kartuKontrol;

    public Praktikan(String id, String nama, String nim, String password, double nilai) {
        super(id, nama, nim, password, nilai);
        this.kartuKontrol = new KartuKontrol();
    }

    public void tampilkanKartuKontrol() {
        kartuKontrol.showInfo();
    }

    @Override
    public void showInfo() {
        System.out.println("=======================");
        System.out.println("   Detail Praktikan   ");
        System.out.println("=======================");
        System.out.println("ID    : " + this.id);
        System.out.println("Nama  : " + this.nama);
        System.out.println("Nim   : " + this.nim);
        System.out.println("Nilai : " + this.nim);
        System.out.println("=======================");
    }
}