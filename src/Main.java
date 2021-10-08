import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void devideStringByNumber(String str, int n) {

        int strSize = str.length();
        StringBuilder newString = null;
        ArrayList<StringBuilder> arrayList = new ArrayList<>();

        for (int i = 0; i < strSize; i++) {

            if ((i % n) == 0) {
                newString = new StringBuilder();
                arrayList.add(newString);
            }
            newString.append(str.charAt(i));
        }
        for (StringBuilder s : arrayList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        int number = s.nextInt();
        devideStringByNumber(text, number);
    }
}
