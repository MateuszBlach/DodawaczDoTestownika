import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String directory = "src\\";
        String fileName = ".txt";
        int filenumber = 1;

        while(true){
            ArrayList<String> question = new ArrayList<>();
            String filePath = directory+filenumber+fileName;
            System.out.println("Podaj kod poprawnej odpowiedzi");
            String code = scanner.nextLine();
            System.out.println("Podaj pytanie");
            question.add(scanner.nextLine());
            System.out.println("1 opcja");
            question.add(scanner.nextLine());
            System.out.println("2 opcja");
            question.add(scanner.nextLine());
            System.out.println("3 opcja");
            question.add(scanner.nextLine());
            System.out.println("4 opcja");
            question.add(scanner.nextLine());
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(code);
            bw.newLine();
            for(String string: question){
                bw.write(string);
                bw.newLine();
            }
            bw.close();
            filenumber++;

        }

    }

}