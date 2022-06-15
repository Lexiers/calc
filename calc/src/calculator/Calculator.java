package calculator;


import java.util.Locale;
import java.util.Scanner;




public class Calculator {
    public static void main(String[] args) throws Exception {
        while (true) {
            Calculator1 calculatorHelper = new Calculator1();
            System.out.println("Введите выражение:");
            Scanner myObj = new Scanner(System.in);
            String input = myObj.nextLine();
            System.out.println(calculatorHelper.calc(input));
        }
    }
}

class Calculator1 {
    public String calc(String input) throws Exception {
        String[] splitText = input.split(" ");
        Boolean rome = false;
        int letter1, letter2;
        int countLetters = 0;


        int countPlus = 0, countMinus = 0, countUmn = 0, countDel = 0;
        for (char element : input.toCharArray()) {
            if (element == '+') countPlus++;
            if (element == '*') countUmn++;
            if (element == '/') countDel++;
            if (element == '-') countMinus++;
        }
        if (countDel >= 2|| countMinus >= 2 || countUmn >= 2 || countPlus >= 2){
            throw new Exception("Неверный формат записи");
        }


        try {
            for (int i = 0; i < 3; i+=2) {
                try {
                    Integer.parseInt(splitText[i]);
                } catch (NumberFormatException e) {
                    rome = true;
                    countLetters++;
                }

            }
            if (countLetters == 1) {
                throw new Exception("Неверный формат записи");
            }
        } catch (Exception e){
            throw new Exception("Неверный формат записи");
        }


        letter1 = getLetter(splitText[0]);
        letter2 = getLetter(splitText[2]);
        int result = getResult(letter1, letter2, splitText[1]);
        String output;

        if (rome) {
            if (result < 0) {
                throw new Exception("Число меньше нуля");
            } else output = getRomeNumber(result);
        } else {

            if (letter1 > 10 || letter1 <= 0 || letter2 > 10 || letter2 <= 0) {
                throw new Exception("Введите числа от 1 до 10");
            } else output = String.valueOf(result);

        }
        return output;
    }

    public Integer getLetter(String letter) throws Exception {
        int integer = 0;

        try {
            integer = Integer.parseInt(letter);
        } catch (Exception e) {
            switch (letter.toLowerCase(Locale.ROOT)) {
                case "i":
                    integer = 1;
                    break;
                case "ii":
                    integer = 2;
                    break;
                case "iii":
                    integer = 3;
                    break;
                case "iv":
                    integer = 4;
                    break;
                case "v":
                    integer = 5;
                    break;
                case "vi":
                    integer = 6;
                    break;
                case "vii":
                    integer = 7;
                    break;
                case "viii":
                    integer = 8;
                    break;
                case "ix":
                    integer = 9;
                    break;
                case "x":
                    integer = 10;
                    break;
                default:
                    throw new Exception("Римская цифра больше 10");
            }
        }
        return integer;
    }

    public String getRomeNumber(int num) throws Exception {
        String romeNum = null;
        switch (num) {
            case 1:
                romeNum = "I";
                break;
            case 2:
                romeNum = "II";
                break;
            case 3:
                romeNum = "III";
                break;
            case 4:
                romeNum = "IV";
                break;
            case 5:
                romeNum = "V";
                break;
            case 6:
                romeNum = "VI";
                break;
            case 7:
                romeNum = "VII";
                break;
            case 8:
                romeNum = "VIII";
                break;
            case 9:
                romeNum = "IX";
                break;
            case 10:
                romeNum = "X";
                break;
            case 11:
                romeNum = "XI";
                break;
            case 12:
                romeNum = "XII";
                break;
            case 13:
                romeNum = "XIII";
                break;
            case 14:
                romeNum = "XIV";
                break;
            case 15:
                romeNum = "XV";
                break;
            case 16:
                romeNum = "XVI";
                break;
            case 17:
                romeNum = "XVII";
                break;
            case 18:
                romeNum = "XVIII";
                break;
            case 19:
                romeNum = "XIX";
                break;
            case 20:
                romeNum = "XX";
                break;
            case 21:
                romeNum = "XXI";
                break;
            case 23:
                romeNum = "XXIII";
                break;
            case 24:
                romeNum = "XXIV";
                break;
            case 25:
                romeNum = "XXV";
                break;
            case 26:
                romeNum = "XXVI";
                break;
            case 27:
                romeNum = "XXVII";
                break;
            case 28:
                romeNum = "XXVIII";
                break;
            case 29:
                romeNum = "XXIX";
                break;
            case 30:
                romeNum = "XXX";
                break;
            case 31:
                romeNum = "XXXI";
                break;
            case 32:
                romeNum = "XXXII";
                break;
            case 33:
                romeNum = "XXXIII";
                break;
            case 34:
                romeNum = "XXXIV";
                break;
            case 35:
                romeNum = "XXXV";
                break;
            case 36:
                romeNum = "XXXVI";
                break;
            case 37:
                romeNum = "XXXVII";
                break;
            case 38:
                romeNum = "XXXVIII";
                break;
            case 39:
                romeNum = "XXXIX";
                break;
            case 40:
                romeNum = "XL";
                break;
            case 41:
                romeNum = "XLI";
                break;
            case 42:
                romeNum = "XLII";
                break;
            case 43:
                romeNum = "XLIII";
                break;
            case 45:
                romeNum = "XLV";
                break;
            case 48:
                romeNum = "XLVIII";
                break;
            case 49:
                romeNum = "XLIX";
                break;
            case 50:
                romeNum = "L";
                break;
            case 54:
                romeNum = "LIV";
                break;
            case 56:
                romeNum = "LVI";
                break;
            case 60:
                romeNum = "LX";
                break;
            case 63:
                romeNum = "LXIII";
                break;
            case 64:
                romeNum = "LXIV";
                break;
            case 70:
                romeNum = "LXX";
                break;
            case 72:
                romeNum = "LXXII";
                break;
            case 80:
                romeNum = "LXXX";
                break;
            case 81:
                romeNum = "LXXXI";
                break;
            case 90:
                romeNum = "XCV";
                break;
            case 100:
                romeNum = "C";
                break;
            default:
                throw new Exception("Результат меньше 0 или больше 100");
        }
        return romeNum;
    }

    public Integer getResult(int letter1, int letter2, String s) throws Exception {
        int result = 0;
        switch (s) {
            case "/":
                result = letter1 / letter2;
                break;
            case "+":
                result = letter1 + letter2;
                break;
            case "-":
                result = letter1 - letter2;
                break;
            case "*":
                result = letter1 * letter2;
                break;
            default:
                throw new Exception("Неверный формат записи");
        }

        return result;
    }

}