public class reverseWordInsentence {
    public static void main(String[] args) {
        String Sentence="i love myself";

        String words[]=Sentence.split(" ");
        for (String word:words) {
          String reverse="";

            for(int i=0; i<word.length(); i++){

                reverse=word.charAt(i)+reverse;

            }
            System.out.print(reverse+" ");



        }

    }
}
