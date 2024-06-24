import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cin_filename = "cin.txt";
        String cout_filename = "cout.txt";
        String remove = "Цветочек";
        try {
            FileReader file_read = new FileReader(new File(cin_filename));
            BufferedReader reader = new BufferedReader(file_read);
            FileWriter file_write = new FileWriter(new File(cout_filename));
            BufferedWriter writer = new BufferedWriter(file_write);
            String line;
            while ((line = reader.readLine()) != null) {
                String modified_line = line.replaceAll(remove, "");
                writer.write(modified_line + "\n");
            }
            reader.close();
            writer.close();
            System.out.println("Подстроки удалены.");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}//a1