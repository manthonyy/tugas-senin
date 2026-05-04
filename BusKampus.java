class BusKampus extends Kendaraan {

    // Constructor
    BusKampus(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    @Override
    void bergerak() {
        System.out.println("Bus kampus mengantar mahasiswa di area kampus.");
    }

    @Override
    void info() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kapasitas      : " + kapasitas + " penumpang");
    }
}
