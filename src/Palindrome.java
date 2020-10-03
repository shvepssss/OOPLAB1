public class Palindrome {
    // главный метод класса
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            // считываем слова
            String s = args[i];
            // проверяем, палиндром ли это при помощи функции reverseString
            if (s.equals(reverseString(s))){
                System.out.printf("Слово %s является палиндромом.\n",s);
            }
            else
            {
                System.out.printf("Слово %s не является палиндромом.\n",s);
            }
        }
    }
    // функция, которая показывает слово в обратном порядке букв
    public static String reverseString(String word){
        String newWord = "";// слово, которое мы получим при преобразвании
        for(int i=word.length()-1; i>=0;i--){
            newWord += word.charAt(i);
        }
        return newWord;
    }
}