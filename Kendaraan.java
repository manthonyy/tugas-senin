abstract class Kendaraan {

    String nama;
    int kapasitas;

    // Constructor
    Kendaraan(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    // Method abstract
    abstract void bergerak();

    abstract void info();
}
