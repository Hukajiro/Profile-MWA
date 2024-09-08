public class Profile {
    String Nama;
    String NIM;
    String Hobi:

    Profile(String inputNama,String inputNIM,String inputHobi){
        Nama = inputNama;
        NIM = inputNIM;
        Hobi = inputHobi;

        System.out.println("Nama = " + Nama);
        System.out.println("NIM  = " + NIM);
        System.out.println("Hobi = " + Hobi);
    }
    public static void main(String[] args) {
        Profile profile1 = new Profile("M. WILDAN ALIF", "12350113259", "BERMAIN VOLI");

    }
}
