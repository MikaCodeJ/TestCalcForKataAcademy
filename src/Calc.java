import java.util.Scanner;

public class Calc {
    Scanner scanner = new Scanner(System.in);
    NumbersRoman num1Roman = NumbersRoman.I;
    NumbersRoman num2Roman = NumbersRoman.II;
    NumbersRoman num3Roman = NumbersRoman.III;
    NumbersRoman num4Roman = NumbersRoman.IV;
    NumbersRoman num5Roman = NumbersRoman.V;
    NumbersRoman num6Roman = NumbersRoman.VI;
    NumbersRoman num7Roman = NumbersRoman.VII;
    NumbersRoman num8Roman = NumbersRoman.VIII;
    NumbersRoman num9Roman = NumbersRoman.IX;
    NumbersRoman num10Roman = NumbersRoman.X;
    NumbersRoman num11Roman = NumbersRoman.XI;
    NumbersRoman num12Roman = NumbersRoman.XII;
    NumbersRoman num13Roman = NumbersRoman.XIII;
    NumbersRoman num14Roman = NumbersRoman.XIV;
    NumbersRoman num15Roman = NumbersRoman.XV;
    NumbersRoman num16Roman = NumbersRoman.XVI;
    NumbersRoman num17Roman = NumbersRoman.XVII;
    NumbersRoman num18Roman = NumbersRoman.XVIII;
    NumbersRoman num19Roman = NumbersRoman.XIX;
    NumbersRoman num20Roman = NumbersRoman.XX;
    NumbersRoman num21Roman = NumbersRoman.XXI;
    NumbersRoman num22Roman = NumbersRoman.XXII;
    NumbersRoman num23Roman = NumbersRoman.XXIII;
    NumbersRoman num24Roman = NumbersRoman.XXIV;
    NumbersRoman num25Roman = NumbersRoman.XXV;
    NumbersRoman num26Roman = NumbersRoman.XXVI;
    NumbersRoman num27Roman = NumbersRoman.XXVII;
    NumbersRoman num28Roman = NumbersRoman.XXVIII;
    NumbersRoman num29Roman = NumbersRoman.XXIX;
    NumbersRoman num30Roman = NumbersRoman.XXX;
    NumbersRoman num31Roman = NumbersRoman.XXXI;
    NumbersRoman num32Roman = NumbersRoman.XXXII;
    NumbersRoman num33Roman = NumbersRoman.XXXIII;
    NumbersRoman num34Roman = NumbersRoman.XXXIV;
    NumbersRoman num35Roman = NumbersRoman.XXXV;
    NumbersRoman num36Roman = NumbersRoman.XXXVI;
    NumbersRoman num37Roman = NumbersRoman.XXXVII;
    NumbersRoman num38Roman = NumbersRoman.XXXVIII;
    NumbersRoman num39Roman = NumbersRoman.XXXIX;
    NumbersRoman num40Roman = NumbersRoman.XL;
    NumbersRoman num41Roman = NumbersRoman.XLI;
    NumbersRoman num42Roman = NumbersRoman.XLII;
    NumbersRoman num43Roman = NumbersRoman.XLIII;
    NumbersRoman num44Roman = NumbersRoman.XLIV;
    NumbersRoman num45Roman = NumbersRoman.XLV;
    NumbersRoman num46Roman = NumbersRoman.XLVI;
    NumbersRoman num47Roman = NumbersRoman.XLVII;
    NumbersRoman num48Roman = NumbersRoman.XLVIII;
    NumbersRoman num49Roman = NumbersRoman.XLIX;
    NumbersRoman num50Roman = NumbersRoman.L;
    NumbersRoman num51Roman = NumbersRoman.LI;
    NumbersRoman num52Roman = NumbersRoman.LII;
    NumbersRoman num53Roman = NumbersRoman.LIII;
    NumbersRoman num54Roman = NumbersRoman.LIV;
    NumbersRoman num55Roman = NumbersRoman.LV;
    NumbersRoman num56Roman = NumbersRoman.LVI;
    NumbersRoman num57Roman = NumbersRoman.LVII;
    NumbersRoman num58Roman = NumbersRoman.LVIII;
    NumbersRoman num59Roman = NumbersRoman.LIX;
    NumbersRoman num60Roman = NumbersRoman.LX;
    NumbersRoman num61Roman = NumbersRoman.LXI;
    NumbersRoman num62Roman = NumbersRoman.LXII;
    NumbersRoman num63Roman = NumbersRoman.LXIII;
    NumbersRoman num64Roman = NumbersRoman.LXIV;
    NumbersRoman num65Roman = NumbersRoman.LXV;
    NumbersRoman num66Roman = NumbersRoman.LXVI;
    NumbersRoman num67Roman = NumbersRoman.LXVII;
    NumbersRoman num68Roman = NumbersRoman.LXVIII;
    NumbersRoman num69Roman = NumbersRoman.LXIX;
    NumbersRoman num70Roman = NumbersRoman.LXX;
    NumbersRoman num71Roman = NumbersRoman.LXXI;
    NumbersRoman num72Roman = NumbersRoman.LXXII;
    NumbersRoman num73Roman = NumbersRoman.LXXIII;
    NumbersRoman num74Roman = NumbersRoman.LXXIV;
    NumbersRoman num75Roman = NumbersRoman.LXXV;
    NumbersRoman num76Roman = NumbersRoman.LXXVI;
    NumbersRoman num77Roman = NumbersRoman.LXXVII;
    NumbersRoman num78Roman = NumbersRoman.LXXVIII;
    NumbersRoman num79Roman = NumbersRoman.LXXIX;
    NumbersRoman num80Roman = NumbersRoman.LXXX;
    NumbersRoman num81Roman = NumbersRoman.LXXXI;
    NumbersRoman num82Roman = NumbersRoman.LXXXII;
    NumbersRoman num83Roman = NumbersRoman.LXXXIII;
    NumbersRoman num84Roman = NumbersRoman.LXXXIV;
    NumbersRoman num85Roman = NumbersRoman.LXXXV;
    NumbersRoman num86Roman = NumbersRoman.LXXXVI;
    NumbersRoman num87Roman = NumbersRoman.LXXXVII;
    NumbersRoman num88Roman = NumbersRoman.LXXXVIII;
    NumbersRoman num89Roman = NumbersRoman.LXXXIX;
    NumbersRoman num90Roman = NumbersRoman.XC;
    NumbersRoman num91Roman = NumbersRoman.XCI;
    NumbersRoman num92Roman = NumbersRoman.XCII;
    NumbersRoman num93Roman = NumbersRoman.XCIII;
    NumbersRoman num94Roman = NumbersRoman.XCIV;
    NumbersRoman num95Roman = NumbersRoman.XCV;
    NumbersRoman num96Roman = NumbersRoman.XCVI;
    NumbersRoman num97Roman = NumbersRoman.XCVII;
    NumbersRoman num98Roman = NumbersRoman.XCVIII;
    NumbersRoman num99Roman = NumbersRoman.XCIX;
    NumbersRoman num100Roman = NumbersRoman.C;
















    int result;
    String result1;
    int geo; String geo1;
    int geo2;
    String endResult;

    String button1 = scanner.next();
    char operator = scanner.next().charAt(0);
    String button2 = scanner.next();
    String s = scanner.nextLine();




    public int convertRoman1() {

        if (button1.equals(num1Roman.getTransalation())) {  // "I" = "I"
            this.result = 1;
        } else if (button1.equals(num2Roman.getTransalation())) {
            this.result = 2;
        } else if (button1.equals(num3Roman.getTransalation())) {
            this.result = 3;
        } else if (button1.equals(num4Roman.getTransalation())) {
            this.result = 4;
        } else if (button1.equals(num5Roman.getTransalation())) {
            this.result = 5;
        } else if (button1.equals(num6Roman.getTransalation())) {
            this.result = 6;
        } else if (button1.equals(num7Roman.getTransalation())) {
            this.result = 7;
        } else if (button1.equals(num8Roman.getTransalation())) {
            this.result = 8;
        } else if (button1.equals(num9Roman.getTransalation())) {
            this.result = 9;
        } else if (button1.equals(num10Roman.getTransalation())) {
            this.result = 10;

        } else {
            throw new IllegalArgumentException("Error");

        }
        return result;

    }

    public int convertRoman2() {
        if (button2.equals(num1Roman.getTransalation())) {  // "I" = "I"
            this.result = 1;
        } else if (button2.equals(num2Roman.getTransalation())) {
            this.result = 2;
        } else if (button2.equals(num3Roman.getTransalation())) {
            this.result = 3;
        } else if (button2.equals(num4Roman.getTransalation())) {
            this.result = 4;
        } else if (button2.equals(num5Roman.getTransalation())) {
            this.result = 5;
        } else if (button2.equals(num6Roman.getTransalation())) {
            this.result = 6;
        } else if (button2.equals(num7Roman.getTransalation())) {
            this.result = 7;
        } else if (button2.equals(num8Roman.getTransalation())) {
            this.result = 8;
        } else if (button2.equals(num9Roman.getTransalation())) {
            this.result = 9;
        } else if (button2.equals(num10Roman.getTransalation())) {
            this.result = 10;

        } else {
            throw new IllegalArgumentException("Error");
        }
        return result;

    }

    public int getOperator() {
        switch (operator) {
            case '+':
                result = convertRoman1() + convertRoman2();
                break;
            case '-':
                result = convertRoman1() - convertRoman2();
                break;
            case '*':
                result = convertRoman1() * convertRoman2();
                break;
            case '/':
                result = convertRoman1() / convertRoman2();
                break;
            default:
                throw new IllegalArgumentException("Error");
        }
        return result;
    }

    public String getIntToRoman() {
        if (getOperator() == 2) {
            this.result1 = String.valueOf(getOperator());  // "1"
            result1 = num2Roman.getTransalation(); //"I:
        } else if (getOperator() == 1) {
            this.result1 = String.valueOf(getOperator());
            result1 = num1Roman.getTransalation();
        } else if (getOperator() == 3) {
            this.result1 = String.valueOf(getOperator());
            result1 = num3Roman.getTransalation();
        } else if (getOperator() == 4) {
            this.result1 = String.valueOf(getOperator());
            result1 = num4Roman.getTransalation();
        } else if (getOperator() == 5) {
            this.result1 = String.valueOf(getOperator());
            result1 = num5Roman.getTransalation();
        } else if (getOperator() == 6) {
            this.result1 = String.valueOf(getOperator());
            result1 = num6Roman.getTransalation();
        } else if (getOperator() == 7) {
            this.result1 = String.valueOf(getOperator());
            result1 = num7Roman.getTransalation();
        } else if (getOperator() == 8) {
            this.result1 = String.valueOf(getOperator());
            result1 = num8Roman.getTransalation();
        } else if (getOperator() == 9) {
            this.result1 = String.valueOf(getOperator());
            result1 = num9Roman.getTransalation();
        } else if (getOperator() == 10) {
            this.result1 = String.valueOf(getOperator());
            result1 = num10Roman.getTransalation();
        } else if (getOperator() == 11) {
            this.result1 = String.valueOf(getOperator());
            result1 = num11Roman.getTransalation();
        } else if (getOperator() == 12) {
            this.result1 = String.valueOf(getOperator());
            result1 = num12Roman.getTransalation();
        } else if (getOperator() == 13) {
            this.result1 = String.valueOf(getOperator());
            result1 = num13Roman.getTransalation();
        } else if (getOperator() == 14) {
            this.result1 = String.valueOf(getOperator());
            result1 = num14Roman.getTransalation();
        } else if (getOperator() == 15) {
            this.result1 = String.valueOf(getOperator());
            result1 = num15Roman.getTransalation();
        } else if (getOperator() == 16) {
            this.result1 = String.valueOf(getOperator());
            result1 = num16Roman.getTransalation();
        } else if (getOperator() == 17) {
            this.result1 = String.valueOf(getOperator());
            result1 = num17Roman.getTransalation();
        } else if (getOperator() == 18) {
            this.result1 = String.valueOf(getOperator());
            result1 = num18Roman.getTransalation();
        } else if (getOperator() == 19) {
            this.result1 = String.valueOf(getOperator());
            result1 = num19Roman.getTransalation();
        } else if (getOperator() == 20) {
            this.result1 = String.valueOf(getOperator());
            result1 = num20Roman.getTransalation();
        } else if (getOperator() == 21) {
            this.result1 = String.valueOf(getOperator());
            result1 = num21Roman.getTransalation();
        } else if (getOperator() == 22) {
            this.result1 = String.valueOf(getOperator());
            result1 = num22Roman.getTransalation();
        } else if (getOperator() == 23) {
            this.result1 = String.valueOf(getOperator());
            result1 = num23Roman.getTransalation();
        } else if (getOperator() == 24) {
            this.result1 = String.valueOf(getOperator());
            result1 = num24Roman.getTransalation();
        } else if (getOperator() == 25) {
            this.result1 = String.valueOf(getOperator());
            result1 = num25Roman.getTransalation();
        } else if (getOperator() == 26) {
            this.result1 = String.valueOf(getOperator());
            result1 = num26Roman.getTransalation();
        } else if (getOperator() == 27) {
            this.result1 = String.valueOf(getOperator());
            result1 = num27Roman.getTransalation();
        } else if (getOperator() == 28) {
            this.result1 = String.valueOf(getOperator());
            result1 = num28Roman.getTransalation();
        } else if (getOperator() == 29) {
            this.result1 = String.valueOf(getOperator());
            result1 = num29Roman.getTransalation();
        } else if (getOperator() == 30) {
            this.result1 = String.valueOf(getOperator());
            result1 = num30Roman.getTransalation();
        } else if (getOperator() == 31) {
            this.result1 = String.valueOf(getOperator());
            result1 = num31Roman.getTransalation();
        } else if (getOperator() == 32) {
            this.result1 = String.valueOf(getOperator());
            result1 = num32Roman.getTransalation();
        } else if (getOperator() == 33) {
            this.result1 = String.valueOf(getOperator());
            result1 = num33Roman.getTransalation();
        } else if (getOperator() == 34) {
            this.result1 = String.valueOf(getOperator());
            result1 = num34Roman.getTransalation();
        } else if (getOperator() == 35) {
            this.result1 = String.valueOf(getOperator());
            result1 = num35Roman.getTransalation();
        } else if (getOperator() == 36) {
            this.result1 = String.valueOf(getOperator());
            result1 = num36Roman.getTransalation();
        } else if (getOperator() == 37) {
            this.result1 = String.valueOf(getOperator());
            result1 = num37Roman.getTransalation();
        } else if (getOperator() == 38) {
            this.result1 = String.valueOf(getOperator());
            result1 = num38Roman.getTransalation();
        } else if (getOperator() == 39) {
            this.result1 = String.valueOf(getOperator());
            result1 = num39Roman.getTransalation();
        } else if (getOperator() == 40) {
            this.result1 = String.valueOf(getOperator());
            result1 = num40Roman.getTransalation();
        } else if (getOperator() == 41) {
            this.result1 = String.valueOf(getOperator());
            result1 = num41Roman.getTransalation();
        } else if (getOperator() == 42) {
            this.result1 = String.valueOf(getOperator());
            result1 = num42Roman.getTransalation();
        } else if (getOperator() == 43) {
            this.result1 = String.valueOf(getOperator());
            result1 = num43Roman.getTransalation();
        } else if (getOperator() == 44) {
            this.result1 = String.valueOf(getOperator());
            result1 = num44Roman.getTransalation();
        } else if (getOperator() == 45) {
            this.result1 = String.valueOf(getOperator());
            result1 = num45Roman.getTransalation();
        } else if (getOperator() == 46) {
            this.result1 = String.valueOf(getOperator());
            result1 = num46Roman.getTransalation();
        } else if (getOperator() == 47) {
            this.result1 = String.valueOf(getOperator());
            result1 = num47Roman.getTransalation();
        } else if (getOperator() == 48) {
            this.result1 = String.valueOf(getOperator());
            result1 = num48Roman.getTransalation();
        } else if (getOperator() == 49) {
            this.result1 = String.valueOf(getOperator());
            result1 = num49Roman.getTransalation();
        } else if (getOperator() == 50) {
            this.result1 = String.valueOf(getOperator());
            result1 = num50Roman.getTransalation();
        } else if (getOperator() == 51) {
            this.result1 = String.valueOf(getOperator());
            result1 = num51Roman.getTransalation();
        } else if (getOperator() == 52) {
            this.result1 = String.valueOf(getOperator());
            result1 = num52Roman.getTransalation();
        } else if (getOperator() == 53) {
            this.result1 = String.valueOf(getOperator());
            result1 = num53Roman.getTransalation();
        } else if (getOperator() == 54) {
            this.result1 = String.valueOf(getOperator());
            result1 = num54Roman.getTransalation();
        } else if (getOperator() == 55) {
            this.result1 = String.valueOf(getOperator());
            result1 = num55Roman.getTransalation();
        } else if (getOperator() == 56) {
            this.result1 = String.valueOf(getOperator());
            result1 = num56Roman.getTransalation();
        } else if (getOperator() == 57) {
            this.result1 = String.valueOf(getOperator());
            result1 = num57Roman.getTransalation();
        } else if (getOperator() == 58) {
            this.result1 = String.valueOf(getOperator());
            result1 = num58Roman.getTransalation();
        } else if (getOperator() == 59) {
            this.result1 = String.valueOf(getOperator());
            result1 = num59Roman.getTransalation();
        } else if (getOperator() ==60) {
            this.result1 = String.valueOf(getOperator());
            result1 = num60Roman.getTransalation();
        } else if (getOperator() == 61) {
            this.result1 = String.valueOf(getOperator());
            result1 = num61Roman.getTransalation();
        } else if (getOperator() == 62) {
            this.result1 = String.valueOf(getOperator());
            result1 = num62Roman.getTransalation();
        } else if (getOperator() == 63) {
            this.result1 = String.valueOf(getOperator());
            result1 = num63Roman.getTransalation();
        } else if (getOperator() == 64) {
            this.result1 = String.valueOf(getOperator());
            result1 = num64Roman.getTransalation();
        } else if (getOperator() == 65) {
            this.result1 = String.valueOf(getOperator());
            result1 = num65Roman.getTransalation();
        } else if (getOperator() == 66) {
            this.result1 = String.valueOf(getOperator());
            result1 = num66Roman.getTransalation();
        } else if (getOperator() == 67) {
            this.result1 = String.valueOf(getOperator());
            result1 = num67Roman.getTransalation();
        } else if (getOperator() == 68) {
            this.result1 = String.valueOf(getOperator());
            result1 = num68Roman.getTransalation();
        } else if (getOperator() == 69) {
            this.result1 = String.valueOf(getOperator());
            result1 = num69Roman.getTransalation();
        } else if (getOperator() == 70) {
            this.result1 = String.valueOf(getOperator());
            result1 = num70Roman.getTransalation();
        } else if (getOperator() == 71) {
            this.result1 = String.valueOf(getOperator());
            result1 = num71Roman.getTransalation();
        } else if (getOperator() == 72) {
            this.result1 = String.valueOf(getOperator());
            result1 = num72Roman.getTransalation();
        } else if (getOperator() == 73) {
            this.result1 = String.valueOf(getOperator());
            result1 = num73Roman.getTransalation();
        } else if (getOperator() == 74) {
            this.result1 = String.valueOf(getOperator());
            result1 = num74Roman.getTransalation();
        } else if (getOperator() == 75) {
            this.result1 = String.valueOf(getOperator());
            result1 = num75Roman.getTransalation();
        } else if (getOperator() == 76) {
            this.result1 = String.valueOf(getOperator());
            result1 = num76Roman.getTransalation();
        } else if (getOperator() == 77) {
            this.result1 = String.valueOf(getOperator());
            result1 = num77Roman.getTransalation();
        } else if (getOperator() == 78) {
            this.result1 = String.valueOf(getOperator());
            result1 = num78Roman.getTransalation();
        } else if (getOperator() == 79) {
            this.result1 = String.valueOf(getOperator());
            result1 = num79Roman.getTransalation();
        } else if (getOperator() == 80) {
            this.result1 = String.valueOf(getOperator());
            result1 = num80Roman.getTransalation();
        } else if (getOperator() == 81) {
            this.result1 = String.valueOf(getOperator());
            result1 = num81Roman.getTransalation();
        } else if (getOperator() == 82) {
            this.result1 = String.valueOf(getOperator());
            result1 = num82Roman.getTransalation();
        } else if (getOperator() == 83) {
            this.result1 = String.valueOf(getOperator());
            result1 = num83Roman.getTransalation();
        } else if (getOperator() == 84) {
            this.result1 = String.valueOf(getOperator());
            result1 = num84Roman.getTransalation();
        } else if (getOperator() == 85) {
            this.result1 = String.valueOf(getOperator());
            result1 = num85Roman.getTransalation();
        } else if (getOperator() == 86) {
            this.result1 = String.valueOf(getOperator());
            result1 = num86Roman.getTransalation();
        } else if (getOperator() == 87) {
            this.result1 = String.valueOf(getOperator());
            result1 = num87Roman.getTransalation();
        } else if (getOperator() == 88) {
            this.result1 = String.valueOf(getOperator());
            result1 = num88Roman.getTransalation();
        } else if (getOperator() == 89) {
            this.result1 = String.valueOf(getOperator());
            result1 = num89Roman.getTransalation();
        } else if (getOperator() == 90) {
            this.result1 = String.valueOf(getOperator());
            result1 = num90Roman.getTransalation();
        } else if (getOperator() == 91) {
            this.result1 = String.valueOf(getOperator());
            result1 = num91Roman.getTransalation();
        } else if (getOperator() == 92) {
            this.result1 = String.valueOf(getOperator());
            result1 = num92Roman.getTransalation();
        } else if (getOperator() == 93) {
            this.result1 = String.valueOf(getOperator());
            result1 = num93Roman.getTransalation();
        } else if (getOperator() == 94) {
            this.result1 = String.valueOf(getOperator());
            result1 = num94Roman.getTransalation();
        } else if (getOperator() == 95) {
            this.result1 = String.valueOf(getOperator());
            result1 = num95Roman.getTransalation();
        } else if (getOperator() == 96) {
            this.result1 = String.valueOf(getOperator());
            result1 = num96Roman.getTransalation();
        } else if (getOperator() == 97) {
            this.result1 = String.valueOf(getOperator());
            result1 = num97Roman.getTransalation();
        } else if (getOperator() == 98) {
            this.result1 = String.valueOf(getOperator());
            result1 = num98Roman.getTransalation();
        } else if (getOperator() == 99) {
            this.result1 = String.valueOf(getOperator());
            result1 = num99Roman.getTransalation();
        } else if (getOperator() == 100) {
            this.result1 = String.valueOf(getOperator());
            result1 = num100Roman.getTransalation();

        } else {
            throw new IllegalArgumentException("Error");

        }
        return result1;

    }

    int stringToIntNumbers1() {
        if (button1.equals("1")) {
            this.geo = geo;
            return geo = 1;


        } else if (button1.equals("2")) {
            this.geo = geo;
            return geo = 2;
        } else if (button1.equals("3")) {
            this.geo = geo;
            return geo = 3;
        } else if (button1.equals("4")) {
            this.geo = geo;
            return geo = 4;
        } else if (button1.equals("5")) {
            this.geo = geo;
            return geo = 5;
        } else if (button1.equals("6")) {
            this.geo = geo;
            return geo = 6;
        } else if (button1.equals("7")) {
            this.geo = geo;
            return geo = 7;
        } else if (button1.equals("8")) {
            this.geo = geo;
            return geo = 8;
        } else if (button1.equals("9")) {
            this.geo = geo;
            return geo = 9;
        } else if (button1.equals("10")) {
            this.geo = geo;
            return geo = 10;
        }
        return geo;
    }

    int stringToIntNumbers2() {
        if (button2.equals("1")) {
            this.geo2 = geo2;
            return geo2 = 1;


        } else if (button2.equals("2")) {
            this.geo2 = geo2;
            return geo2 = 2;
        } else if (button2.equals("3")) {
            this.geo2 = geo2;
            return geo2 = 3;
        } else if (button2.equals("4")) {
            this.geo2 = geo2;
            return geo2 = 4;
        } else if (button2.equals("5")) {
            this.geo2 = geo2;
            return geo2 = 5;
        } else if (button2.equals("6")) {
            this.geo2 = geo2;
            return geo2 = 6;
        } else if (button2.equals("7")) {
            this.geo2 = geo2;
            return geo2 = 7;
        } else if (button2.equals("8")) {
            this.geo2 = geo2;
            return geo2 = 8;
        } else if (button2.equals("9")) {
            this.geo2 = geo2;
            return geo2 = 9;
        } else if (button2.equals("10")) {
            this.geo2 = geo2;
            return geo2 = 10;
        }
        return geo2;
    }

    public String ArabicIntToString() {
        if (ResultOperation() == 1) {
        } else if (ResultOperation() == 2) {
            this.geo1 = String.valueOf(ResultOperation());  // "1"
        } else if (ResultOperation() == 3) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 4) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 5) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 6) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 7) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 8) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 9) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 11) {
            this.geo1 = String.valueOf(ResultOperation());

        } else if (ResultOperation() == 12) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 13) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 14) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 15) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 16) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 17) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 18) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 19) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 20) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 21) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 22) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 23) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 24) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 25) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 26) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 27) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 28) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 29) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 30) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 31) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 32) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 33) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 34) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 35) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 36) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 37) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 38) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 39) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 40) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 41) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 42) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 43) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 44) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 45) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 46) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 47) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 48) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 49) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 50) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 51) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 52) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 53) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 54) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 55) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 56) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 57) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 58) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 59) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 60) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 61) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 62) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 63) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 64) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 65) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 66) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 67) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 68) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 69) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 70) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 71) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 72) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 73) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 74) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 75) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 76) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 77) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 78) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 79) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 80) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 81) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 82) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 83) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 84) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 85) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 86) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 87) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 88) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 89) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 90) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 91) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 92) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 93) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 94) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 95) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 96) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 97) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 98) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 99) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 100) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == 0) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -1) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -2) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -3) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -4) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -5) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -6) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -7) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -8) {
            this.geo1 = String.valueOf(ResultOperation());
        } else if (ResultOperation() == -9) {
            this.geo1 = String.valueOf(ResultOperation());
        }
        return geo1;
    }

    public int ResultOperation() {
        if (stringToIntNumbers1() > 0 && stringToIntNumbers1() <= 10 && stringToIntNumbers2() > 0 && stringToIntNumbers2() <= 10) {
            switch (operator) {
                case '+':
                    result = stringToIntNumbers1() + stringToIntNumbers2();
                    break;
                case '-':
                    result = stringToIntNumbers1() - stringToIntNumbers2();
                    break;
                case '*':
                    result = stringToIntNumbers1() * stringToIntNumbers2();
                    break;
                case '/':
                    result = stringToIntNumbers1() / stringToIntNumbers2();
                    break;
                default:
                    throw new IllegalArgumentException("Error");

            }
        } else {
            throw new IllegalArgumentException("Error");
        }
        return result;
    }

    public String resultOperation() {
        try {
            String[] symbols = s.split(" ");
            if (symbols.length != 1)       throw new IllegalArgumentException("Error");

        } catch (Exception e) {
            throw new IllegalArgumentException("Error");

        }
        if (button1.equals("1")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("2")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("3")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("4")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("5")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("6")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("7")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("8")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("9")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("10")) {
            this.endResult = ArabicIntToString();
        } else if (button1.equals("I")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("II")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("III")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("IV")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("V")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("VI")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("VII")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("VIII")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("IX")) {
            this.endResult = getIntToRoman();
        } else if (button1.equals("X")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("1")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("2")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("3")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("4")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("5")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("6")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("7")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("8")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("9")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("10")) {
            this.endResult = ArabicIntToString();
        } else if (button2.equals("I")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("II")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("III")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("IV")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("V")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("VI")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("VII")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("VIII")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("IX")) {
            this.endResult = getIntToRoman();
        } else if (button2.equals("X")) {
            this.endResult = getIntToRoman();
        } else {
            throw new IllegalArgumentException("Error");
        }
        return endResult;
    }

}
