public class Exercise6 {
    public static void main(String[] args) {
        String pcs1 = "TodayIsANiceDay";
        String pcs2 = "MyNameIsEthan";

        System.out.println(convertPascal(pcs1));
        System.out.println(convertPascal(pcs2));
    }

    public static String convertPascal(String pcs) {
        if (pcs == null || pcs.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char[] charArray = pcs.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char charC = charArray[i];

            if (Character.isUpperCase(charC) && i != 0) {
                sb.append(" ");
            }

            sb.append(charC);
        }

        String sentence = sb.toString();
        return sentence.substring(0, 1) + sentence.substring(1).toLowerCase();
    }
}
