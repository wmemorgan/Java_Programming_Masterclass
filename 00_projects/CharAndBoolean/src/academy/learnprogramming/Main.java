package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // char Type
        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        String emoji = "\uD83C\uDFD6";

        int emojiCodepoint = emoji.codePointAt(emoji.offsetByCodePoints(0, 0));
        int mysteryEmojiCodepoint = emojiCodepoint + 1;

        char mysteryEmoji[] = {Character.highSurrogate(mysteryEmojiCodepoint),
                Character.lowSurrogate(mysteryEmojiCodepoint)};
        System.out.println("Emoji: " + String.valueOf(mysteryEmoji));

        // boolean Type
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
