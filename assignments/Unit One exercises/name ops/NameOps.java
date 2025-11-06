public class NameOps {



    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";

    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        return name.indexOf(" ", indexOfFirstSpace(name) + 1);
    }

    public static String findFirstName(String name) {
        int space = indexOfFirstSpace(name);
        int spacecount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                spacecount++;
            }
        }
        if (spacecount > 0) {
            return name.substring(0, space);
        }
        return name;
    }

    public static String findLastName(String name) {
        int spacecount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                spacecount++;
            }
        }
        if (spacecount == 0) {
            return "";
        } else if (spacecount == 1) {
            return name.substring(indexOfFirstSpace(name) + 1, name.length());
        } else {
            return name.substring(indexOfSecondSpace(name) + 1, name.length());
        }
    }

    public static String findMiddleName(String name) {
        int spacecount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                spacecount++;
            }

        }
        if (spacecount == 2) {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        } else {
            return "";
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        int spacecount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                spacecount++;
            }
        }
        if (spacecount == 0) {
            return name;
        } else if (spacecount == 1) {
            return name.substring(indexOfFirstSpace(name) + 1, name.length()) + ", "
                    + name.substring(0, indexOfFirstSpace(name));
        } else {
            return name.substring(indexOfSecondSpace(name) + 1, name.length()) + ", "
                    + name.substring(0, indexOfFirstSpace(name)) + " "
                    + name.substring(indexOfFirstSpace(name) + 1, indexOfFirstSpace(name) + 2)
                    + ".";
        }
    }
}
