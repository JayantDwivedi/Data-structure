import java.util.Scanner;
public class PlayWordsG38
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        for (int i = 0; i < str1Array.length; i++)
        {
            alphabet1[str1Array[i] - 97]++;
        }
        for (int j = 0; j < str1Array.length; j++)
        {
            alphabet2[str2Array[j] - 97]++;
        }
        int sum = 0;
        for (int k = 0; k < 26; k++)
        {
            sum = sum + (Math.abs(alphabet1[k] - alphabet2[k]));
        }
        System.out.println(sum);

    }
}
