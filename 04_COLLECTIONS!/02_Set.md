
# Set
### not allowed Dublicate
```java
HashSet
TreeSet
LinkedHashSet
```
## HashSet
```java
HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(10); // Duplicate, ignored
System.out.println(set); // Output: [10]   
```
### No duplicate allowed.
### No insertion order maintained.
### Fast O(1) operations.

## TreeSet
```java
TreeSet<Integer> set = new TreeSet<>();
set.add(10);
set.add(10); // Duplicate, ignored
System.out.println(set); // Output: [10]   
```

### No duplicate allowed.
### Elements sorted in natural order.
### O(log n) operations.

## LinkedHashSet
```java
LinkedHashSet<Integer> set = new LinkedHashSet<>();
set.add(10);
set.add(10); // Duplicate, ignored
System.out.println(set); // Output: [10]   
```
### No duplicate allowed.
### Maintains insertion order.
### O(1) operations, slightly slower than HashSet.