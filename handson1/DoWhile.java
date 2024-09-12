package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String []{"Apel", "Mangga", "Pisang", "Jeruk"};
        int counter = 0;
        do{
            System.out.println("Element ke- " + (counter+1) + ": " + kumpulanBuah[counter]);
            counter++;
        } while(counter < kumpulanBuah.length);
    }
}
