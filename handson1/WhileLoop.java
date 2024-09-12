package handson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String []{"Apel", "Mangga", "Pisang", "Jeruk"};
        int counter = 0;
        while(counter < kumpulanBuah.length){
            System.out.println("Element ke-" + (counter+1) + ": " + kumpulanBuah[counter]);
            counter++;
        }
    }
}
