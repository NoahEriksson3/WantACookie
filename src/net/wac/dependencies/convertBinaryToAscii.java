package net.wac.dependencies;

public class convertBinaryToAscii {

    // Function to convert binary to decimal
        static int binaryToDecimal(String n)
        {
            String num = n;

            // Stores the decimal value
            int dec_value = 0;

            // Initializing base value to 1
            int base = 1;

            int len = num.length();
            for (int i = len - 1; i >= 0; i--) {

                // If the current bit is 1
                if (num.charAt(i) == '1')
                    dec_value += base;
                base = base * 2;
            }

            // Return answer
            return dec_value;
        }

        // Function to convert binary to ASCII
        public static String setStringtoASCII(String str)
        {

            // To store size of s
            int N = (str.length());

            // If given String is not a
            // valid String
            if (N % 8 != 0) {
                return "Not Possible!";
            }

            // To store final answer
            String res = "";

            // Loop to iterate through String
            for (int i = 0; i < N; i += 8) {
                int decimal_value
                        = binaryToDecimal((str.substring(i, 8+i)));

                // Apprend the ASCII character
                // equivalent to current value
                res += (char)(decimal_value);
            }

            // Return Answer
            return res;
        }

        // Driver Code
        public static void main(String[] args)
        {
            String s = "0110110101110110";
            System.out.print(setStringtoASCII(s));

        }
    }

// This code is contributed by 29AjayKumar



