import java.util.Scanner; public class q24 {
    public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.println("Enter the string"); String str = sc.nextLine(); System.out.println("Enter the old word:"); String word = sc.next(); System.out.println("Enter the new world:"); String newWord = sc.next();
    String newStr = str.replace(word, newWord); System.out.println(str); System.out.println(newStr);
    sc.close();
    }
    }
    