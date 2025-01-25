//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Arrays [] array diye okunur
        String[] students = new String[4];
        students[0]="Engin";
        students[1]="Derin";
        students[2]="Salih";
        students[3]="Busra";

        System.out.println("number of student: "+students.length);
        for(int i=0;i<students.length;i++) {
            System.out.println(students[i]);
        }
        System.out.println("----------------------------");
        for(String student:students){
            System.out.println(student);
        }
    }
}