//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //for
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        //While
        int i=2;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti");
        //Do-While
        int j = 1;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("do while döngüsü bitti.");
    }
}


