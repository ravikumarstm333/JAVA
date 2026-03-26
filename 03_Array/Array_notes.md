# What is Array
## Array is Fixed Size Container that Store same type of Element

```java
int[] arr=new int[5];
```
### that means 
#### Java memory me 5 integers ke liye continuous jagah reserve karta hai

### see How it look in side memory
```java
Index:   0   1   2   3   4
Value:  [0] [0] [0] [0] [0]
Address:100 104 108 112 116
```
### Explanation:
```java
i am not give any value so default value is 0
Har int = 4 bytes
Memory continuous hoti hai
Isliye index se access bahut fast hota hai.
Access time: O(1)
```
## Dis Advantage
### array ki Size ko change nahi kar sakte agar karte hai to java eak new memory me new array creat karta hai (heep me)
```java
int[] arr=new int[3];
int[] arr=new int[4];
// both are diffrent memory
```
# 1D Array And 2D Array
## 1D Array
```java
int[] arr=new int[];
```
## 2D Array
```java
int[][] matrix=new int[row][colume];
```
### Example
```java
int[][] matrix=new int[4][5];
[
       0 1 2 3 4
    0 [0,0,0,0,0],
    1 [0,0,0,0,0],
    2 [0,0,0,0,0],
    3 [0,0,0,0,0]
]
```
<<<<<<< HEAD
=======

## Some functions
```java
Arrays.sort(arr);            // array sort karne ke liye

Arrays.toString(arr);        // array ko string me print karne ke liye

Arrays.fill(arr, 5);         // poore array me 5 fill kar deta hai

Arrays.equals(arr1, arr2);   // do arrays equal hain ya nahi check

Arrays.binarySearch(arr, 10); // sorted array me element search

Arrays.copyOf(arr, 10);      // array copy karke new size banana

Arrays.copyOfRange(arr, 1, 4); // specific range copy

Arrays.stream(arr);          // array ko stream me convert
```
>>>>>>> 1af2563 (update files)
