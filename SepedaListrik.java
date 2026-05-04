class SepedaListrik extends Kendaraan {

    // Constructor
    SepedaListrik(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    @Override
    void bergerak() {
        System.out.println("Sepeda listrik bergerak menggunakan tenaga baterai.");
    }

    @Override
    void info() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kapasitas      : " + kapasitas + " orang");
    }
}
