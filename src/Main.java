import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = getInt();
        String a1 = null;
        String b=null;
        char c='0';
        int num1;
        int num2;
        String[] p;
        int r;
        Integer itr = null;

        if ((a.charAt(0)=='X')|(a.charAt(0)=='I')|(a.charAt(0)=='V')){
            p = a.split(" ");
            int pL = p.length;
            if (pL>3){
                System.out.println("throws Exception.");
            }
            else {
                num1 = romanNumeral(p[0]);
                num2 = romanNumeral(p[2]);
                if ((p[2].charAt(0) == '1') | (p[2].charAt(0) == '2') | (p[2].charAt(0) == '3') | (p[2].charAt(0) == '4') | (p[2].charAt(0) == '5') | (p[2].charAt(0) == '6') | (p[2].charAt(0) == '7') | (p[2].charAt(0) == '8') | (p[2].charAt(0) == '9')) {
                    System.out.println("throws Exception");
                    r = itr;

                } else {
                    //System.out.println(num1);
                    c = p[1].charAt(0);
                    //System.out.println(c);
                    //System.out.println(num2);
                    r = calc(num1, num2, c);
                }

                if (r <= 0) {
                    System.out.println("throws Exception.");
                    System.exit(0);
                } else {
                    String resultRom = romanSolution(r);
                    System.out.println(resultRom);
                }
            }

        }
        else if ((a.charAt(0)=='1')|(a.charAt(0)=='2')|(a.charAt(0)=='3')|(a.charAt(0)=='4')|(a.charAt(0)=='5')|(a.charAt(0)=='6')|(a.charAt(0)=='7')|(a.charAt(0)=='8')|(a.charAt(0)=='9')) {
            p = a.split(" ");
            int pL = p.length;
            if (pL>3){
                System.out.println("throws Exception.");
            }
            else {
                c = p[1].charAt(0);
                if ((p[2].charAt(0) == 'X') | (p[2].charAt(0) == 'I') | (p[2].charAt(0) == 'V')) {
                    System.out.println("throws Exception");
                    r = itr;
                }
                else {
                    num1 = Integer.parseInt(String.valueOf(p[0]));
                    num2 = Integer.parseInt(String.valueOf(p[2]));
                    if (((num1 == 1) | (num1 == 2) | (num1 == 3) | (num1 == 4) | (num1 == 5) | (num1 == 6) | (num1 == 6) | (num1 == 7) | (num1 == 8) | (num1 == 9) | (num1 == 10)) & ((num2 == 1) | (num2 == 2) | (num2 == 1) | (num2 == 3) | (num2 == 4) | (num2 == 5) | (num2 == 6) | (num2 == 7) | (num2 == 8) | (num2 == 9) | (num2 == 10))) {
                        r = calc(num1, num2, c);
                        System.out.println(r);
                    } else {
                        System.out.println("throws Exception");
                    }
                }
            }
        }
        else{
            System.out.println("throws Exception");
        }
    }
    public static String getInt() {
        String num;
        if (scanner.hasNext()) {
            num = scanner.nextLine();
        }
        else{
            System.out.println("throws Exception");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static int calc(int num1, int num2, char d) {
        int r;
        Integer itr = null;
        switch (d){
            case '+':
                r = num1+num2;
                break;
            case '-':
                r = num1-num2;
                break;
            case '*':
                r = num1*num2;
                break;
            case '/':
                r = num1/num2;
                break;
            default:
                System.out.println("throws Exception");
                r = itr;
        }
        return r;
    }
    public static int romanNumeral(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }
    public static String romanSolution(int arabNumeral) {
        String[] romanAll = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
                "*****", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
                "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
                "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String q = romanAll[arabNumeral];
        return q;

    }
}