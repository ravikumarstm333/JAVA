# What is ArrayList
### ArrayList is a dynamic array 
### that means size increas automatic

## ArrayList
```java
import java.util.*; // thay have all class, library and module
import java.util.ArrayList;
ArrayList<Integer> List=new ArrayList<>();
```
### add Element
```java
List.add(10);
List.add(20);
List.add(30);
```
### Memory internally kuch aisa hota hai:
```java
Capacity = 10 (default) /// java me ArrayList ka default capacity 10 hoti hai

Index:   0    1    2    3   4   5   6   7   8   9
Value:  [10] [20] [30] [ ] [ ] [ ] [ ] [ ] [ ] [ ]

Size: 3;
Capacity: 10;
```

## How to increase capacity of ArrayList
### When capacity is full 
### Example:
```java
[1,2,3,4,5,6,7,8,9,10]
```
### now i want to add 11 java creat a new array with copy old array data and increase capacity

### example
```java
New Capacity = old * 1.5
add half of old capacity
```
### steps
```java
1️⃣ new array create
2️⃣ old data copy
3️⃣ new element add
```
## Array vs ArrayList
```java
Feature	            Array	          ArrayList
Size	            Fixed	          Dynamic
Memory	            Continuous	      Continuous
Speed	            Fast	          Thoda slow
Add element	        Hard	          Easy
Primitive types	    Yes	              Direct nahi
```

## Java example
## Array
```java
int[] arr = new int[3];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
```
## ArrayList
```java
import java.util.*;

ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
```

## Access speed comparison
```java
arr[2]      -> O(1)

list.get(2) -> O(1)
```
## Some methord
```java
arr.add(5);          // element add

arr.get(0);          // index 0 ka element access

arr.set(0, 10);      // index 0 par value update

arr.remove(0);       // index 0 ka element delete

arr.size();          // total elements

arr.contains(5);     // check karta hai 5 present hai ya nahi
```

## Collections function 
### that help to perform more operation on ArrayList
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
## Common Collections methods
```java
Collections.sort(list);      // sort
Collections.reverse(list);   // reverse
Collections.max(list);       // maximum element
Collections.min(list);       // minimum element
Collections.shuffle(list);   // random order
Collections.swap(list,1,2);  // do elements swap
```