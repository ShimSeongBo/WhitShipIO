import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileSample {

    public static void main(String[] args) throws IOException {

        String pathName = "\\Users\\apple191440gmail.com\\Desktop\\coffeeshop";
        checkPath(pathName);
        bufferedReaderTest();
    }

    public static void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + "is exists? = " + file.exists());
    }

    public static void bufferedReaderTest() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String something = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println("i = " + i);
    }
}
