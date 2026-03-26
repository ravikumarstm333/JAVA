# What is String 
## java me String eak class hoti hai jo java.lang package me hoti hai

# Declear
```java
String s="hello";
// actualy aisa hota hai 
String s=new String("Hello");
```
## but the memory behaviour is diffrent
# JAVA Memory Structure
## java memory mainly have in 2 part 
# Heap Memory
# String Constant Pool(SCP)
## this is special area in side heap , where store String literals

## Example strings:
```t
"hello"
"JAVA"
"world"
```
## Purpose:
```t
"avoid dublicate string"
"save memory"
```
# StringTokenizer
## StringTokenizer is a legacy Java class used to split a string into tokens based on specified delimiters.

# Key Methods
```java
StringTokenizer st = new StringTokenizer("a,b,c", ",");   

hasMoreTokens(): Returns true if more tokens are available.
nextToken(): Returns the next token as a String.
countTokens(): Returns the number of remaining tokens.
hasMoreElements() / nextElement(): Legacy methods from Enumeration interface
```

# StringBuilder 
## StringBuilder is provide to modify(mutablity od string) without creating new object

## but in String it is emutable and if i change then we should make a new object;

# key Uses
## String manipulation: Append, insert, delete, or reverse text. 
## Performance optimization: Avoids creating multiple string objects during concatenation. 
## Dynamic string building: Ideal for loops, file parsing, or constructing queries

# Common Methods
```java
append(str): Adds string at the end.
insert(index, str): Inserts string at specified position.
delete(start, end): Removes characters in range.
replace(start, end, str): Replaces substring.
reverse(): Reverses the sequence.
toString(): Converts StringBuilder to String.
setCharAt(index, ch): Changes character at index.
deleteCharAt(index): Removes single character. 
```

## Example
```java

```