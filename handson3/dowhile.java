package handson3;

public class dowhile {
    public static void main(String[] args) {
        int[] angka = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int counter = 0;
        do{
            if(angka[counter] >= 15){
                break;
            }
            if(angka[counter] % 3 == 0){
                counter++;
                continue;
            }
            System.out.println("Angka " + angka[counter]);
            counter++;
        } while(counter < angka.length);
    }
}
