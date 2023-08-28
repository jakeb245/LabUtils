import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class assignGroups {
    public static void main(String[] args) throws IOException {
        Scanner filenameIn = new Scanner(System.in);

        System.out.print("Enter roster filename: ");
        String rosterName = String.valueOf(Paths.get(filenameIn.nextLine()));
        ArrayList<String> names = readNamesFromCSV(rosterName);
        System.out.println(names);
    }

    public static ArrayList<String> readNamesFromCSV(String filename) throws IOException {
        ArrayList<String> names = new ArrayList<>();

        Scanner in = new Scanner(Paths.get(filename));

        while (in.hasNextLine()) {
            System.out.println("line!");
            in.nextLine();
        }

        return names;
    }
}
