package org.kelompok5.models;

import java.time.LocalDate;

enum StatusAsistensi {
    TERLAMBAT,
    TEPAT_WAKTU,
}

// TODO Haris : buat logika asistensi antara praktikan dan asisten
public class Asistensi {
    private Tugas tugas;
    private LocalDate tanggal;
    private int nilaiAsistensi = 100;
    private StatusAsistensi statusAsistensi;
}
