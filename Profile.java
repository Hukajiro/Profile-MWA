public class Profile {
    String Nama;
    String NIM;

    Profile(String inputNama,String inputNIM){
        Nama = inputNama;
        NIM = inputNIM;

        System.out.println("Nama = " + Nama);
        System.out.println("NIM  = " + NIM);
    }
    public static void main(String[] args) {
        Profile profile1 = new Profile("M. WILDAN ALIF", "12350113259");

    }
}
