import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filePath;

        while (true) {
            System.out.println("Enter file path or press Q to quit: ");
             filePath = s.nextLine();

            if (filePath.equalsIgnoreCase("Q"))
                break;

    File file = new File(filePath);

            try {
                System.out.println("Would you like to skip the whitespace? (Y/N): ");
                boolean skipWhiteSpace = s.nextLine().equalsIgnoreCase("Y");

                FileStats fs = new FileStats(file,skipWhiteSpace);


            fs.read(file);
                System.out.println(" lines - "+fs.getNumLines()+ ", words - "+fs.getNumWords()+", characters - "+ fs.getNumChars()+".  "+fs.getFileName());
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } s.close();
    }
}