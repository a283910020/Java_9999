package JavaObject;

public class userDriver {


//     1、用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号

    public static boolean isValidUsername(String username){

        if (username.length() == 0) return false;
        if (username.length() > 25) return false;
        char[] cannotContain = {' ', '\'', '"', '?', '<', '>'};

        for (char ch: cannotContain) {
            if (username.contains(Character.toString(ch))){
                return false;
            }
        }
        return true;
    }

//     2、密码6-18位，只能包含字母、数字、特殊符号（下划线、@、#、$、!）
//     纯数字、纯字母时，密码强度都是弱 （★★☆☆☆☆）
//     数字+密码、数字+符号、数字+字母，强度为中（★★★★☆☆）
//     同时存在三种字符，强度为强（★★★★★★）
    public static boolean isValidpassword(String password){

        if (password.length() <= 3 || password.length() >= 10)
            return false;
        if (!isDigitAndLetter(password) && !containSymbol(password))
            return false;
        
        return true;

    }

    public static String checkType(String password){
        int digitType = 0;
        int letterType = 0;
        int symbolType = 0;
        String type = "";

        if (containSymbol(password))
            symbolType = 1;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch))
                letterType = 1;
            if (Character.isDigit(ch))
                digitType = 1;
            if (digitType == 1 && letterType == 1)
                break;
        }

        int sum = letterType + symbolType + digitType;

        switch (sum){
            case 1:
                return "★★☆☆☆☆";
            case 2:
                return "★★★★☆☆";
            case 3:
                return "★★★★★★";
            default:
                return "☆☆☆☆☆☆";
        }
    }

    public static boolean containSymbol(String password){
        String specialSymbol = "_@$!#";
        for (char ch : password.toCharArray()) {
            if (specialSymbol.contains(Character.toString(ch))) return true;
        }
        return false;
    }

    public static boolean isSymbol(String password){
        String specialSymbol = "_@$!#";
        for (char ch : password.toCharArray()) {
            if (!specialSymbol.contains(Character.toString(ch))) return false;
        }
        return true;
    }

    public static boolean isNumber(String password){
        for (char ch : password.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
        }
        return true;
    }
    public static boolean isDigitAndLetter(String password){
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;
        }
        return true;
    }
    public static boolean isLetter(String password){
        for (char ch : password.toCharArray()) {
            if (!Character.isLetter(ch)) return false;
        }
        return true;
    }

//     3、用户输入正确的email 必须包含@符号，且只能包含一个@和.  符号不能在开头，也不能在结尾



    public static boolean isValidEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

//    public static boolean isValidEmail(String email){
//        if (email.length() == 0)
//            return false;
//        int countAt = 0;
//        int countDot = 0;
//
//        for (int i = 0; i < email.length(); i++){
////            System.out.println(email.charAt(i));
//            if (Character.toString(email.charAt(i)).equals("@"))
//                if (i == 0 || i == email.length() - 1)
//                    return false;
//                countAt += 1;
//            if (Character.toString(email.charAt(i)).equals("."))
//                if (i == 0 || i == email.length() - 1)
//                    return false;
//                countDot += 1;
//        }
//
//        return countAt == 1 && countDot == 1;
//    }

}
