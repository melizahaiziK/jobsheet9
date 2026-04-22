JAWABAN PERTANYAAN LATIHAN 2.1.1

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
jawaban : sudah saya perbaiki dan commit ke gitub

2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
jawaban : 5, 
public StackTugasMahasiswa11(int size){
    this.size = size;
    stack = new Mahasiswa11[size];
    top = -1;
}
dan 
StackTugasMahasiswa11 stack = new StackTugasMahasiswa11(5);

3. Mengapa perlu pengecekan kondisi !isFull() pada method push Kalau kondisi if-else tersebut dihapus, apa dampaknya?
jawaban : supaya data nya nggak melebihi kapasitas array dan program tetap berjalan dengan aman

4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
jawaban : sudah saya modif dan commit di github

5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
jawaban : sudah saya tambahi dan commit di github

6. Commit dan push kode program ke Github
jawaban : sudah selesai.

JAWABAN PERTANYAAN PERCOBAAN 2
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
jawaban : Method konversiDesimalKeBiner bekerja dengan cara membagi bilangan desimal dengan 2 secara berulang, lalu menyimpan sisa pembagian ke dalam stack. Setelah itu, isi stack diambil kembali menggunakan operasi pop untuk mendapatkan urutan biner yang benar.

2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
jawaban : Jika kondisi diubah menjadi while (kode != 0), maka program akan mengalami error karena variabel kode tidak dideklarasikan dalam method tersebut. Seharusnya tetap menggunakan variabel nilai.