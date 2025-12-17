public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (day > 0 && day < 6 && vacation == false) {
            return "7:00";
        } else if (day > 0 && day < 6) {
            return "10:00";
        } else if (vacation == false) {
            return "10:00";
        } else {
            return "off";
        }

    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a - b == 6 || b - a == 6 || a + b == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a == b || b == c || a == c) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        if (str.substring(str.length()).equals("b") || str.substring(0, 1).equals("f")) {
            return "FizzBuzz";
        } else if (str.substring(str.length()).equals("b")) {
            return "Buzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        }
        return "";

    }

    public static String doubleChar(String str) {
        String newstring = "";
        for (int i = 0; i < str.length(); i++) {
            String chardouble = str.substring(i, i + 1) + str.substring(i, i + 1);
            newstring += chardouble;
        }
        return newstring;

    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int dogcount = 0;
        int catcount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                dogcount++;
            } else if (str.substring(i, i + 3).equals("cat")) {
                catcount++;
            }
        }

        return dogcount == catcount;
    }

    // public static String mixString(String a, String b) {
    // String newstring = "";

    // for (int i = 0; i < a.length()+b.length(); i++){
    // if (i %2 != 0 && i/2 < a.length()){
    // newstring += a.substring(i/2, i/2+1);
    // }else if (i/2 < a.length()) {
    // newstring += b.substring(i/2, i/2+1);
    // }
    // }
    // return newstring;

    // }

    public static String mixString(String a, String b) {
        String sb = "";
        int max = Math.max(a.length(), b.length());

        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                sb += a.charAt(i);
            }
            if (i < b.length()) {
                sb += b.charAt(i);
            }
        }

        return sb;
    }

    public static String repeatEnd(String str, int n) {
        StringBuilder builtString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builtString.append(str.substring(str.length() - n, str.length()));
        }
        return builtString.toString();
    }

    public static boolean endOther(String a, String b) {
        if (a.toLowerCase().substring(a.length() - b.length(), a.length())
                .equals(b.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static int countCode(String str) {
        int count = 0;
        char wildcard = 'a';
        for (int i = 0; i < str.length() - 3; i++) {
            for (int a = 0; a < 26; a++) {
                wildcard = (char) ('a' + a);
                if (str.toLowerCase().substring(i, i + 4).equals("co" + wildcard + "e")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int biggestdiff = 0;
        for (int numberuno : nums) {
            for (int i = 0; i < nums.length; i++) {
                int diff = numberuno - nums[i];
                if (diff > biggestdiff) {
                    biggestdiff = diff;
                }
            }
        }
        return biggestdiff;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for (int i = 0; i < n; i++) {
            fizz[i] = i;
        }

        return fizz;
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                i++;
                count++;

            }
        }
        return count >= 3;

    }

    public static String[] fizzArray2(int n) {
        String[] fizz = new String[n];
        for (int i = 0; i < n; i++) {
            fizz[i] = String.valueOf(i);
        }

        return fizz;
    }

    public static int[] zeroFront(int[] nums) {
        int[] zeroarray = new int[nums.length];
        int zeropos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[zeropos] = 0;
                nums[i] = nums[zeropos];
                zeropos++;
            }
        }
        return zeroarray;
    }

    public static String[] wordsWithout(String[] words, String target) {
        String[] newArray = new String[0];

        for (String string : words) {
            int notwanted = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.substring(i, i + target.length()).equals(target)) {
                    notwanted++;

                }
                if (notwanted == 0) {

                    String[] temp = new String[newArray.length + 1];
                    for (int b = 0; b < newArray.length; b++) {
                        temp[i] = newArray[i];
                    }

                    temp[newArray.length] = string;
                    newArray = temp;
                }
            }
        }
        return newArray;

    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        int mid = scores.length / 2;

        int avg1 = Utils.average(scores, 0, mid);
        int avg2 = Utils.average(scores, mid, scores.length);

        return Math.max(avg1, avg2);
    }

    public static boolean scoresIncreasing(int[] scores) {
        int greaterthan = 0;

        for (int i : scores) {
            if (i >= greaterthan) {
                greaterthan = i;
            } else {
                return false;
            }
        }
        // to-do: implement this method
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int largesta = 0;
        int largestb = 0;
        for (int numa : a) {
            if (Utils.isMultipleOf10(numa)) {
                if (numa > largesta) {
                    largesta = numa;
                }
            }
        }

        for (int numb : a) {
            if (Utils.isMultipleOf10(numb)) {
                if (numb > largestb) {
                    largestb = numb;
                }
            }
        }

        return largesta + largestb;
    }

    public static String firstTwo(String str) {
        String returnString = "";
        if (str.length() >= 2) {
            returnString = str.substring(0, 2);
        } else if (str.length() == 1) {
            returnString = str + "*";
        } else {
            returnString = "**";
        }
        return returnString;
    }

    public static double divide(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return max / min;
    }
}
