import java.util.Scanner;

public class SuratDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat11 stack = new StackSurat11(5);
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat surat terakhir");
            System.out.println("4. Cari surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();

                    Surat11 s = new Surat11(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break; 
                case 2:
                    Surat11 keluar = stack.pop();
                    if (keluar != null) {
                        System.out.println("Memproses surat:");
                        keluar.tampil();
                    }
                    break;  
                case 3:
                    Surat11 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampil();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;
            }
        } while (pilih !=0);
    }    
}
