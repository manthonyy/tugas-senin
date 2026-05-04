class MobilOperasional extends Kendaraan {

    // Constructor
    MobilOperasional(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    @Override
    void bergerak() {
        System.out.println("Mobil operasional digunakan oleh staf kampus.");
    }

    @Override
    void info() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kapasitas      : " + kapasitas + " orang");
    }
}
