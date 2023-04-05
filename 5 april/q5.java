import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file1.txt");
        FileWriter fw = new FileWriter("file2.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            if (ch == ' ') {
                fw.write(ch);
                ch = fr.read();
                fw.write(Character.toUpperCase(ch));
            } else
                fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
