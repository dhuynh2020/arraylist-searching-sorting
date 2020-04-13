import java.util.*;


public class Sorting{
    public static void main(String[]args){
        ArrayList <String> list = new ArrayList<String>(); 
        list.add("apple");
        list.add("banana");
        list.add("strawberry");
        list.add("cherry");
        list.add("pineapple");
        list.add("lemon");
        list.add("mango");
        list.add("watermelon");

        // selectionSort(list);
        // insertionSort(list);
        bubbleSort(list);
        // Collections.shuffle(list);
        System.out.println(list);
        
        
    }

    public static void selectionSort(ArrayList<String> list){
        for(int i = 0 ; i < list.size(); i++){
            String first = list.get(i);
            int firstLocation = i;
            String current= list.get(i); 
            for(int j = i + 1; j < list.size(); j++){
                if(first.compareTo(list.get(j)) >= 0){
                    first = list.get(j);
                    firstLocation = j;
                }
            }
            list.set(i, first);
            list.set(firstLocation, current);
        }
    }

    public static void insertionSort(ArrayList <String> list){
        int n = list.size();

        for(int i = 1; i < n; i++){
            String key = list.get(i);
            int j = i - 1;
            while(j>= 0 && list.get(j).compareTo(key) > 0){
                list.set( j+ 1, list.get(j));
                j = j - 1;
                list.set(j+1, key);
            }
        }
    }

    public static void bubbleSort(ArrayList <String> list){
        boolean finish = false;
        while (!finish){
            int swapCount = 0;
            for (int i = 1; i < list.size(); i++){
                String current = list.get(i);
                String swap = list.get(i-1);
                if (current.compareTo(swap) < 0){
                    list.set(i, swap);
                    list.set(i-1, current);
                    swapCount += 1;
                }
            }
            if (swapCount == 0){
                finish = true;
            }
        }
    }
}

