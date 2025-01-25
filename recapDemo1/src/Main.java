//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 29;
        int num3 = 30;
        int max = num1;
        if(max<num2){
            max = num2;
        }
        if(max<num3){
            max = num3;
        }
        System.out.println(max);
    }
}