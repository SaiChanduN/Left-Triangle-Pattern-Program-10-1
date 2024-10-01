//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int i, j, rows = 5;
         for(i=1; i<=rows; i++){
             for(j= 2*(rows-i); j>=1; j--){
                 System.out.print(" ");//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
             }
             for(j=1; j<=i; j++){
                 System.out.print("* ");
             }
               System.out.println();
        }
    }
}