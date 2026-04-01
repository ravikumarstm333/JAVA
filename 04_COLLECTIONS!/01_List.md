
# List
## Ordered collection.
```java
ArrayList
LinkedList
Vector
```
## ArrayList
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
System.out.println("ArrayList: " + arrayList);
```
### Uses a dynamic array. 
### Not synchronized (not thread-safe).
### Best for frequent get/set operations

## LinkedList
```java
LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.add(10);
linkedList.add(20);
System.out.println("LinkedList: " + linkedList);
```
### Uses a doubly linked list. 
### Not synchronized (not thread-safe).
### Efficient for frequent insertions and deletions.

## Vector
```java
Vector<Integer> vector = new Vector<>();
vector.add(10);
vector.add(20);
System.out.println("Vector: " + vector);   
```
### Uses a dynamic array, like ArrayList. 
### Synchronized (thread-safe).
### Slower than ArrayList due to synchronization overhead


## Key Differences Summary
```java
Feature	                ArrayList	            LinkedList	            Vector

Internal Structure	    Dynamic array	        Doubly linked list	    Dynamic array
Synchronization	        No (not thread-safe)	No (not thread-safe)	Yes (thread-safe)
Get/Access Speed	    Fast (O(1))	            Slow (O(n))	            Fast (O(1))
Add/Remove Speed	    Slow in middle (O(n))	Fast (O(1) at ends)	    Slow due to sync (O(n))
Growth Rate	            Increases by 50%	    Grows by one node	    Doubles in size
```