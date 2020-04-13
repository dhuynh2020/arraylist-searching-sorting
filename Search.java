import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.lang.model.element.Element;

public class Search{
    public static int search(ArrayList<String> haystack, String needle) {
        for (int i = 0; i < haystack.size(); i++) {
            if (haystack.get(i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<String> haystack, String needle, int left, int right) {
        int mid = (left + right) / 2;

        if (right >= 1) {
            mid = 1 + (right - 1) / 2;
        }

        if (haystack.get(mid) == needle) {
            return mid;
        }

        if (haystack.get(mid).compareTo(needle) > 0) {
            return binarySearch(haystack, needle, 1, -1);
        } else if (haystack.get(mid).compareTo(needle) < 0) {
            return binarySearch(haystack, needle, mid + 1, right);
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<String> haystack = new ArrayList<String>();
        haystack.add("1");
        haystack.add("2");
        haystack.add("3");
        haystack.add("4");
        String needle = "1";
        int left = 0;
        int right = haystack.size(); 


        int value = binarySearch(haystack, needle, left, right);
        if( value == -1){
            System.out.print("Search value was not found");
        } else { 
            System.out.println("The position of the needle was found in " + value);
        }
        // int value = search(haystack, needle);
        // if(value == -1){
        //     System.out.println("Search value was not found");
        // } else { 
        //     System.out.println("The Position of the needle was " + value);
        // }
        
    }
}