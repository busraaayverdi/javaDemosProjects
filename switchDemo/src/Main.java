//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("mükemmel.");
                break;
            case 'B':
            case 'C':
                System.out.println("iyi");
                break;
            case 'D':
                System.out.println("Kötü ama geçtin");
                break;
            case 'F':
                System.out.println("kaldın");
                break;
            default:
                System.out.println("geçersiz not");
        }
    }
}