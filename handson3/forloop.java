package handson3;

public class forloop { //Tampilkan angka dari 1 hingga 20, tapi lewati angka yang habis dibagi 3 dan berhendti setelah mencapai angka 15.
    public static void main(String[] args) {
        for (int i = 0; i <=20; i++){
            if (i == 15){
                break;
            }
            if ((i + 1) % 3 == 0 ) {
                continue;
            }
            System.out.println("Angka " + (i + 1));
        }
    }
}
