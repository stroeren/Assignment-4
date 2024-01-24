import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Xayah's String Reverser*******");
        System.out.println("Welcome to Xayah's String Reverser!");
        System.out.println("Hi Rakan!");
        System.out.print("Enter a string!: ");
        String input = sc.nextLine();
        char[] str1 = input.toCharArray();
        sc.close();
        int length = str1.length;
        char[] str2 = new char[length];
        for (int i = 0, j = length - 1; i < length; i++, j--)
        {
            str2[i] = str1[j];
        }
        System.out.println(str2);
    }
}