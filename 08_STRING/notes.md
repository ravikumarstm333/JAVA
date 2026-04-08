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
# Case 1 String Lteral

```java
String s1="Hello";
String s2="Hello";
```
```t 
"the above code we see tow object s1 and s2 have same value "hello"
Step 1
Java check करता है String Pool में "Hello" है या नहीं

Step 2
अगर नहीं है → create

Step 3
अगर है → reuse"
```
## memory digram
```t
"String Pool

      "Hello"
       ↑   ↑
      s1   s2"
```
### make only one object
# Case 2 Using new Keyword
```java
String s1=new String("hello");
```
## what do in side the memory
