public class tabunganAyu {
    public static void main(String[] args) {
        int saldo = 0; // saldo awal
        int tabungan;

        for (int hari = 1; hari <= 30; hari++) {
            tabungan = hari * 1000;
            saldo += tabungan;
        }

        System.out.println("Saldo ayu di hari ke 30: " + saldo);
    }

}
