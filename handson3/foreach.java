package handson3;

public class foreach {
    public static void main(String[] args) {
        int[] angka = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int bilangan : angka){
            if(bilangan >= 15){
                break;
            }
            if(bilangan % 3 == 0){
                continue;
            }
            System.out.println("Angka " + bilangan);
        }
    }
}
