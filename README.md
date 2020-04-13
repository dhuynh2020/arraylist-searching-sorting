## Searching

### Search Algorithms

**Search**

> `int search(ArrayList<String> haystack, String needle)`

> **goal**: returns the index of needle if it is found in haystack, or -1 if it is not there.

> **algorithm**: traverse the list, checking each item one by one if it matches the needle

**BinarySearch**

> `int binarySearch(ArrayList<String> haystack, String needle)`

> **goal**: returns the index of needle if it is found in haystack, or -1 if it is not there

> **precondition**: haystack is guaranteed to be in sorted order before running the function

> **algorithm**: find the middle element in the list (choose either middle element if there are two), check if it is the needle. You are done if it is. If it is not, check to see if the needle would be before or after this element. When it comes before, choose the first half of the list. Otherwise choose the second half of the list. Repeat the process of finding a middle element with the more limited range (from the end of the list to the previous middle element) until you either find the needle or are unable to continue splitting the list in half.
    
**Note**: Use the `compareTo` function to determine the alphabetical order of two Strings. Check the String API for more details.

### Search Questions

1. Find a deck of cards, some jellybeans, or any group of physical objects around your home that can be assigned an order. You need about 8 to 10 items to work with.
    1. Shuffle the items, producing a randomish arrangement. Perform a normal Search algorithm, once for an item that exists in the group, and once for one that does not.
    2. Arrange the items in ascending order. Perform a BinarySearch on the group, once for an item that exists in the group, and once for one that does not.
    3. What do you notice about the two algorithms?
    
2. What does it mean for an algorithm to be efficient? Which algorithm, search or binary search is more efficient? Why?
3. For the list: `["apple", "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"]`
    1. Describe, step by step, how each searching algorithm would process the list when searching for "blueberry"
    2. How many members of the list did `search` access (look at) when looking for blueberry? How many members did `binarySearch` access?
    3. If the list of fruits had been 1000 items long instead, how would your answer to question ii change?
  
**Implement the two search algorithms**
    
## Sorting

### Sorting Algorithms

**SelectionSort**

> `void selectionSort(ArrayList<String> list)`

> **goal**: Given any list, selectionSort changes it to be in ascending sorted order

> **algorithm**: Find the smallest number in the list. Swap it with the first item in the list. Find the next smallest number in the list. Swap it with the second item in the list.

**InsertionSort**

> `void insertionSort(ArrayList<String> list)`

> **goal**: Given any list, selectionSort changes it to be in ascending sorted order

> **algorithm**: Consider the second element of the list. If it is out of order with the first, swap them. Move on to the third element of the list. Swap it to its left until the first three elements of the list are in order compared to each other. Move to the fourth element, and swap it to its left until the first four element of the list are in order. Continue with the rest of the list, until all elements have been acted on.

**BubbleSort**

> `void bubbleSort(ArrayList<String> list)`

> **goal**: Given any list, selectionSort changes it to be in ascending sorted order

> **algorithm**: Consider the first two elements of the list. Swap them if they are out of order. Move to the next pair, the items at indexes 1 and 2. Swap them if they are out of order. Continue through each pair in the list, until the end is reached. This is one "pass" through the list. Continue passing through the list until a single entire pass requires no swaps.

### Sorting Questions

1. Find a deck of cards, some jellybeans, or any group of physical objects around your home that can be assigned an order. You need about 8 to 10 items to work with. Shuffle the items, producing a randomish arrangement.
    1. Perform a SelectionSort on the list.
    2. Shuffle again, and perform an InsertionSort on the list.
    3. Shuffle again, and perform a BubbleSort on the list.
    4. What do you notice about the algorithms?
2. These algorithms are typically called `comparison sorts` because they rely on comparing two elements at a time. For each algorithm:
    1. How many comparisons would it perform for a list of 10 items that were already in order?
    2. How many comparisons does it perform in the worst possible pre-arrangement of 10 items?
    3. How many comparisons would you expect it to perform, approximately, on 10 random items? 100? 1000?
3. If you were searching for an element in a random list, would it be reasonable to use one of these algorithms to sort the list first and use binarySearch, or would you be better off using a normal search? Why or why not?

**Implement the three sorting algorithms**
