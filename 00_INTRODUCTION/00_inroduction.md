### **Introduction to Java**

- **Definition:** Java is a **high-level, object-oriented programming language** used to build **real- world software applications** such as:
    - Banking systems (ATM, Net Banking)
    - Android mobile applications
    - Web backend systems (Flipkart, Amazon, Paytm)
    - Enterprise and government applications
- Java is not just a programming language, but a **complete platform** that provides:
    - A language to write programs
    - A runtime environment to execute programs
    - Libraries and tools to build large-scale applications
### **History of Java**

**Origins of Java (1991–1994)**

- Java was developed at **Sun Microsystems**
- Developed by the **Green Team** led by **James Gosling**
- Other members: Patrick Naughton, Mike Sheridan

**Original Purpose**

- Designed for **consumer electronic devices** (TVs, set-top boxes)
- Existing languages like C and C++ were **platform-dependent**

**Early Names**

- Initially called **Greentalk**
- Renamed to **Oak** (after an oak tree outside Gosling’s office)
- Finally renamed to **Java** in 1995 (inspired by Java coffee)

**Official Release**

- Java was officially released on **May 23, 1995**
- Introduced the concept of **Write Once, Run Anywhere (WORA)**

**Oracle Era**

- In **2010**, Oracle acquired Sun Microsystems
- Java development moved to a **6-month release cycle**
- Introduction of **LTS (Long Term Support)** versions

**Important Java Versions**

- Java 8 (2014) – Major industry adoption
- Java 11 (LTS)
- Java 17 (LTS)
- Java 21 (Latest LTS)

**Java Editions**

| **Edition** | **Full Name** | **Purpose** |
| --- | --- | --- |
| **JSE** | Java Standard Edition | The core platform. Used for standalone, networking, database, and GUI applications. It includes the core libraries and the Virtual Machine10. |
| **JEE** | Java Enterprise Edition | Built on top of JSE. Used for large-scale, multi-tiered, scalable, and secure network applications (e.g., banking systems)11. |
| **JME** | Java Micro Edition | A subset of JSE designed for micro-devices like mobile phones, sensors, and set-top boxes12. |

---

### Features of Java

**Key Features of Java**

- **Simple:** The syntax is clean and easy to understand compared to older languages.
- **Object-Oriented:** Supports OOP concepts, making code easier to develop and maintain compared to structured programming.
- **Portable (WORA):** **W**rite **O**nce, **R**un **A**nywhere. Java code is compiled into **bytecode**, which can run on any Operating System (OS).

**Advanced Features**

- **Security & Robustness**
    - **Secure:**
        - No direct memory access
        - Bytecode verification
        - Security Manager inside JVM
    - **Robust (Strong):**
        - Uses a **dynamic memory management system** (Heap memory) to allocate and deallocate memory automatically at runtime.
        - Strong **Exception Handling** mechanism to manage errors gracefully.
- **Multithreaded:** Supports executing multiple tasks simultaneously to improve performance.
- **The JDK (Java Development Kit)**
    - The **JDK** is the software implementation of the Java Standard Edition specification.
    - It is required to **develop and execute** Java applications

---

### JDK or Java SDK

Java Standard Edition comes in the form of Specification, and the implementation of this
specification is the JDK software, also known as Java SDK (Java Standard
Development Kit).

JDK is a **complete software development kit** used to:

- Write Java programs
- Compile Java programs
- Run Java programs

![image.png](attachment:97a68d3b-63b8-427b-86c0-aab03f1eff87:image.png)

**The Formula**

<aside>

- **JDK** = JRE + Development Tools (Compiler, Debugger).
- **JRE** = JVM + Predefined Library Classes.
</aside>

[JDK Installation](https://www.notion.so/JDK-Installation-2ef225f418d380e09d9fe84f2d659ff4?pvs=21)

---

### JVM

JVM (Java Virtual Machine) is a **software-based virtual machine** that:

- Executes Java bytecode
- Converts bytecode into machine-specific instructions

<aside>

JVM is **not a physical machine**. It is a program that runs on top of the operating system.

</aside>

**Why JVM is Needed?**

- Different operating systems understand different machine code.
- JVM acts as a **bridge** between Java bytecode and the operating system.

**JVM Makes Java Platform Independent**

- Same bytecode runs on Windows, Linux, macOS
- Only JVM changes, not Java code

---

### Java Runtime Environment (JRE)

**What is JRE?**

- JRE provides the **environment required to run Java applications**.
- If you only want to **run Java programs**, JRE is sufficient.

**JRE Contains**

- JVM
- Core Java libraries
- Supporting runtime files

**Formula**

JRE = JVM + Libraries

**Who Needs JRE?**

- End users
    - Systems that only execute Java applications

<aside>

JRE does NOT contain development tools like compiler or debugger

</aside>

---

### **Basic Steps To Develop a Java Program:**

![image.png](attachment:849109a0-b6fc-48db-b45b-8467add5b026:image.png)

**First Java Program**

```java
import java.lang.*;

public class First{
	public static void main(String [] args){
		System.out.println("Hello World");
	}
}
```

---

### **How Java Is Platform Independent**

First, understand what “Platform” means

<aside>

A **platform** = **Operating System + Hardware**

</aside>

eg :- Windows ,Linux ,macOS.

- If a program runs **only on one OS**, it is **platform dependent**.
- If the **same program runs on multiple OS**, it is **platform independent**.

<aside>

**C++ Program Execution** 

- **Source Code:** You write `first.cpp`. This is understandable by humans but not by the computer.
- **Compilation:** The compiler translates this directly into machine code specific to your Operating System (OS).
- **The Result (`.exe`):** You get a `first.exe` file. This file "speaks" the specific language of that Operating System (e.g., Windows).

**The Problem:**
If you take that `first.exe` file and try to run it on a Linux or Mac computer, it will fail. It's like trying to speak French to someone who only understands Japanese. The file is tightly coupled to the OS it was created on. This makes C++ **Platform Dependent**.

![image.png](attachment:af6b0bc2-bc54-4b66-b775-1c685d3365a3:image.png)

</aside>

<aside>

**JAVA Program Execution** 

- **Source Code:** You write `First.java`.
- **Compilation:** The Java compiler (`javac`) does **not** create code for the OS. Instead, it creates a `First.class` file containing **Bytecode**.
    - *Key Concept:*  Bytecode is a platform-independent, intermediate code generated by the Java compiler that ****doesn't belong to Windows, Linux, or Mac. It belongs to Java.
- **The JVM (The Translator):** This is where the magic happens. We don't run the code directly on the OS. We give the `.class` file to the **JVM (Java Virtual Machine)**.
- **Execution:** The JVM reads the Bytecode and translates it into commands that the underlying OS can understand.

![image.png](attachment:2d6e3f05-1ff5-4034-9d48-49b41a8851c3:image.png)

</aside>

---

### **The WORA (Write Once, Run Any Where) Feature of Java**

<aside>

**Write Once, Run Anywhere"**

This diagram illustrates the ultimate benefit of Java's architecture.

- **Step 1: Write Once (`Fisrt.java`)**
You write the code one time.
- **Step 2: Compile Once (`First.class`)**
You compile it once to generate the Bytecode. This `.class` file is portable. You can email this single file to three different friends using three different operating systems.
- **Step 3: Run Anywhere (The 3 JVMs)**
    - **Red Path:** The Windows user has a **Windows JVM**. It translates the Bytecode into Windows commands.
    - **Grey Path:** The macOS user has a **Mac JVM**. It translates the *same* Bytecode into Mac commands.
    - **Yellow Path:** The Linux user has a **Linux JVM**. It translates the *same* Bytecode into Linux commands.
</aside>