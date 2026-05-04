public class Main {

    public static void main(String[] args) {

        // Array polymorphism
        Kendaraan[] daftarKendaraan = new Kendaraan[4];

        // Object dari class turunan
        daftarKendaraan[0] = new BusKampus("Bus Kampus A", 40);

        daftarKendaraan[1] = new MobilOperasional("Mobil Operasional", 5);

        daftarKendaraan[2] = new SepedaListrik("Sepeda Listrik", 2);

        // Anonymous class
        daftarKendaraan[3] = new Kendaraan("Skuter Kampus", 1) {

            @Override
            void bergerak() {
                System.out.println("Skuter kampus bergerak secara otomatis.");
            }

            @Override
            void info() {
                System.out.println("Nama Kendaraan : " + nama);
                System.out.println("Kapasitas      : " + kapasitas + " orang");
            }
        };

        // Menampilkan data kendaraan
        System.out.println("=== SISTEM KENDARAAN KAMPUS ===\n");

        for (Kendaraan k : daftarKendaraan) {

            k.info();
            k.bergerak();

            System.out.println("---------------------------");
        }
    }
}
