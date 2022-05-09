package pro.sky;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();

    }

    public static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        int indexValueFirst = fullName.indexOf(" ");
        int indexValueLast = fullName.lastIndexOf(" ");
        lastName = lastName + fullName.substring(0, indexValueFirst);
        firstName = firstName + fullName.substring(indexValueFirst, indexValueLast);
        middleName = middleName + fullName.substring(indexValueLast);
        System.out.println("Имя сотрудника —" + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника —" + middleName);
    }

    public static String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static void task6() {

        String fullName = "ivanov ivan ivanovich";
        String[] words = fullName.split(" ");
        StringBuilder fullNameFixed = new StringBuilder();

        for (String word : words) {
            char[] charWord = word.toCharArray();
            char startLetterCharFixed = Character.toUpperCase(charWord[0]);
            String startLetterStringFixed = Character.toString(startLetterCharFixed);
            word = startLetterStringFixed + word.substring(1);
            fullNameFixed.append(word).append(" ");
        }

        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullNameFixed);
    }

    public static void task7() {

        String firstString = "135";
        String secondString = "246";
        StringBuilder sb1 = new StringBuilder(firstString);
        StringBuilder sb2 = new StringBuilder(secondString);
        for (int i = 0; i < (sb1.length() + sb2.length()); i = i + 2) {
            sb1.insert(i + 1, sb2.charAt(0));
            sb2.delete(0, 1);
        }
        System.out.println("Данные строки — " + sb1);
    }

    public static void task8() {

        String withDuplicates = "aabccddefgghiijjkk";
        char[] charWithDuplicates = withDuplicates.toCharArray();
        for (int i = 0; i < withDuplicates.length(); i++) {
            for (int j = i + 1; j < withDuplicates.length(); j++) {
                if (charWithDuplicates[i] == charWithDuplicates[j]) {
                    System.out.print(charWithDuplicates[j]);
                    break;
                }
            }
        }
    }
}

//acdgijk
//acdgijk.