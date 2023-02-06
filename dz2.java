import org.w3c.dom.Text;

import java.io.File;

public class dz2 {

// 1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка
//        палиндромом (возвращает boolean значение).


//    public static boolean isPalindrome(String str){
//        if (str == null) {
//            return false;
//        }
//
//        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
//        {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main (String[] args)
//    {
//        String str = "довод";
//
//        if (isPalindrome(str)) {
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not Palindrome");
//        }
//    }




// 2. Напишите метод, который составит строку, состоящую из
// 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

    public static void main(String[] args) {
        generateString();
        writeFile();

    }

    public static void generateString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST");
        }
        System.out.println(sb);
    }

    public static void writeFile() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("Проблема вывода!");
        }

    }
}


