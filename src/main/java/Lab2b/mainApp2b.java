package Lab2b;
import java.util.Arrays;

public class mainApp2b {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Guru Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " +k+ " is "+b.getChapter(k-1));
        String anotherArray[] = b.getChapters();

        System.out.println("There are " +anotherArray.length+ " chapters.");

        // prints address
        System.out.println(anotherArray);
        // prints the data elements within the array
        System.out.println(java.util.Arrays.toString(anotherArray));
    }
}
