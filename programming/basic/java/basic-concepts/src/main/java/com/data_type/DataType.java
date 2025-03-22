package com.data_type;

import java.util.Arrays;

public class DataType {
    void primitiveData() {
        // Boolean
        Boolean booleanDataType = true;

        // Numeric
        // Character
        Character characterDataType = 'a';

        // Integer
        int intDataType = 1;
        byte byteDataType = 1;
        long longDataType = 1;
        short shortDataType = 1;

        // Floating point
        float floatDataType = 1.2f;
        double doubleDataType = 1.222;

        System.out.println(booleanDataType);
        System.out.println(characterDataType);
        System.out.println(intDataType);
        System.out.println(byteDataType);
        System.out.println(longDataType);
        System.out.println(shortDataType);
        System.out.println(floatDataType);
        System.out.println(doubleDataType);
    }

    void nonPrimitiveData() {
        // Non primitive
        String stringDataType = "String value";
        int[] intArrayDataType = { 1, 2, 3, 4 };

        System.out.println(stringDataType);
        System.out.println(Arrays.toString(intArrayDataType));
    }

    void stringDataType() {
        String str = "I am working with string data type";
        System.out.println("\n ************* String ***********");
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("data", "data replaced"));
        System.out.println(str.substring(29, 33)); // Get some part without mutation
        System.out.println(str.indexOf("data"));
        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(0));
        System.out.println(str.compareTo("data"));
        System.out.println(str.concat("   "));
        System.out.println(str.trim());
        System.out.println(str.contains("data"));
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }

    void arrayDataType() {
        int[] intArr = { 1, 2, 3, 4 };
        int[] intArr2 = { 1, 2, 3, 4, 5 };
        System.out.println("\n ************* Array ***********");
        System.out.println(Arrays.compare(intArr, intArr2));
        System.out.println(Arrays.equals(intArr, intArr2));
        System.out.println(Arrays.toString(intArr));
        System.out.println(intArr.length);
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        Arrays.fill(intArr, 10);
        System.out.println(Arrays.toString(intArr));
    }

    public static void main(String args[]) {
        DataType dt = new DataType();
        dt.primitiveData();
        dt.nonPrimitiveData();
        dt.stringDataType();
        dt.arrayDataType();
    }
}