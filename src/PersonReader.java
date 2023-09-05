import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class PersonReader {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                Scanner sc = new Scanner(file);
                System.out.println("ID#      Firstname      Lastname      Title       YOB");
                System.out.println("=================================================================g");
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] data = line.split(",");
                    String formattedData = String.format("%-10s %-15s %-15s %-10s %s", data[0], data[1], data[2], data[3], data[4]);
                    System.out.println(formattedData);
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading file " + file.getName());
            }
        }
    }
}
