package se.addq.java4test;

public class RomanSum {
    public String romanSum(String input1, String input2) {

        input1 = convertToI(input1);
        input2 = convertToI(input2);

        String returnvalue = input1 + input2;

        return convertToRoman(returnvalue);
    }

    private String convertToRoman(String returnvalue) {
        returnvalue = returnvalue.replace("IIIII", "V");
        returnvalue = returnvalue.replace("IIII", "IV");
        returnvalue = returnvalue.replace("VV","X");
        returnvalue = returnvalue.replace("VIV","IX");
        returnvalue = returnvalue.replace("XXXX","XL");
        return returnvalue;
    }

    private String convertToI(String input) {
        input = input.replace("IX","IIIIIIIII");
        input = input.replace("IV","IIII");
        input = input.replace("X","IIIIIIIIII");
        input = input.replace("V","IIIII");
        return input;
    }

    private String convertToIEarly(String input) {
        if (input.equals("IV")) {
            return "IIII";
        } else if(input.equals("V")) {
            return "IIIII";
        } else {
            return input;
        }
    }

    public String sumOfII(String input1, String input2) {
        return input1 + input2;
    }

    public String sumOfV(String input1, String input2) {
        String returnvalue = convertToIEarly(input1);
        returnvalue += convertToIEarly(input2);

        if (returnvalue.equals("IIIII")) {
            return "V";
        } else if (returnvalue.equals("IIII")) {
            return "IV";
        } else {
            return returnvalue;
        }

    }


}
