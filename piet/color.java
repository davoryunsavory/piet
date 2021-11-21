import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class color {
    String command_str;
    List<Integer> command_code;

    public color() {
        command_str = "";
    }

    public static String getCommand_str() {
        return command_str;
    }

    public void setCommand_str(String command_str) {
        this.command_str = command_str;
    }
    public List<Integer> getCommand_code() {
        return command_code;
    }

    public void setCommand_code(List<Integer> command_code) {
        this.command_code = command_code;
    }
    

    // red --> yellow --> green --> cyan --> blue --> magenta -->
    public static HashMap<Character, Integer> hue = new HashMap<>() {
        {
            put('r', 0);
            put('y', 1);
            put('g', 2);
            put('c', 3);
            put('b', 4);
            put('m', 5);
        }
    };
    // light --> average --> dark -->
    public static HashMap<Character, Integer> bright = new HashMap<>() {
        {
            put('l', 0);
            put('a', 1);
            put('d', 2);
        }
    };

    public static List<List<Character>> str_charList() {
        List<List<Character>> split_str_list = new ArrayList<>();
        s = getCommand_str();
        int a = 0;
        int b = 1;

        for (int i = 0; i < s.length() / 2; i++) {
            List<Character> internal_split_str_list = new ArrayList<>();
            internal_split_str_list.add(s.charAt(a));
            internal_split_str_list.add(s.charAt(b));
            split_str_list.add(internal_split_str_list);
            a += 2;
            b += 2;
        }
        return split_str_list;
    }

    public static List<List<Integer>> listChar_listInt(List<List<Character>> listChar) {
        List<List<Integer>> listInteger = new ArrayList<>();
        for (int i = 0; i < listChar.size(); i++) {
            List<Integer> internal_listInteger = new ArrayList<>();
            for (int k = 0; k < listChar.get(i).size(); k++) {
                if (hue.containsKey(listChar.get(i).get(k))) {
                    internal_listInteger.add(hue.get(listChar.get(i).get(k)));
                } else if (bright.containsKey(listChar.get(i).get(k))) {
                    internal_listInteger.add(bright.get(listChar.get(i).get(k)));
                }
            }
            listInteger.add(internal_listInteger);
        }

        return listInteger;
    }

    public static List<List<Integer>> listInt_listDiff(List<List<Integer>> listInt) {
        List<List<Integer>> listDiff = new ArrayList<>();

        for (int i = 0; i < listInt.size() - 1; i++) {
            List<Integer> internal_listInt = new ArrayList<>();
            for (int k = 0; k < listInt.get(i).size(); k++) {
                int num = listInt.get(i + 1).get(k) - listInt.get(i).get(k);
                if (num < 0) { // if negative
                    num = listInt.get(i).get(k) - listInt.get(i + 1).get(k);
                    num = 6 - num;
                    internal_listInt.add(num);
                } else {
                    internal_listInt.add(num);
                }
            }
            listDiff.add(internal_listInt);
        }

        return listDiff;
    }

    public static List<Integer> compose(List<List<Integer>> a) {
        List<Integer> combined_listInt = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            String temp_str = "";
            for (int k = 0; k < a.get(i).size(); k++) {
                temp_str = temp_str + String.valueOf(a.get(i).get(k));
                System.out.println(temp_str);
            }
            combined_listInt.add(Integer.parseInt(temp_str));
        }

        return combined_listInt;
    }

    public static void main(String[] args) {
        Stack<Integer> stackcolor = new Stack<>();

        color a = new color();
        a.setCommand_str("glydrd");
        a.

    }



    
}
