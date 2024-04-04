import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ishigin rengini daxil edin ");

        String proses = scanner.nextLine();

        switch (proses) {
            case "sari" -> System.out.println("hazirlasin");
            case "qirmizi" -> System.out.println("dayanin");
            case "yasil" -> System.out.println("hereket edin");
        }


    }
}