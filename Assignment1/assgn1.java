Q1. When was java develope and who is the inventor of java? Why we use java for programming?

Ans.Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of Sun's Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses.
java was developed by James Gosling.
Reasons to use Java for programming :
1.Cross-platform compatibility: Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.).
2.Popularity: It is one of the most popular programming languages in the world.
3.Job demand: Java has a large demand in the current job market.
4.Ease of learning: It is easy to learn and simple to use.
5.Open-source and free: Java is open-source and free to use.
6.Security and performance: It is secure, fast, and powerful.
7.Community support: Java has a huge community of developers.


Q2.  What are the features of java.
Ans.The primary objective of Java programming language creation was to make it portable, simple and secure programming language. 
features are:
1. Simple                                 7. Architecture neutral
2. Object-Oriented                        8. Interpreted
3. Portable                               9. High Performance
4. Platform independent                   10. Multithreaded                
5. Secured                                11. Distributed
6. Robust                                 12. Dynamic

Q3. what is JDK, JRE, JVM?
Ans : 1. JDK (Java Development Kit) is a Kit that provides the environment to develop and execute(run) the Java program. JDK is a kit(or package) that includes two things

Development Tools(to provide an environment to develop your java programs)
JRE (to execute your java program).
2. JRE (Java Runtime Environment) is an installation package that provides an environment to only run(not develop) the java program(or application)onto your machine. JRE is only used by those who only want to run Java programs that are end-users of your system.

3. JVM (Java Virtual Machine) is a very important part of both JDK and JRE because it is contained or inbuilt in both. Whatever Java program you run using JRE or JDK goes into JVM and JVM is responsible for executing the java program line by line, hence it is also known as an interpreter.

Q4.what is the structure of java program. write a program to print hello world.
Ans. class first{
      
      public static void main(String []args){
      
          System.out.println("Hello World") ;    
      }
}

Q5. Define Variables in java. Explain different scope of variable.
Ans:A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
Variable is a name of memory location. There are three types of variables in java: local, instance and static.

Variables are an essential part of data storage and manipulation in the realm of programming. In addition to making values available within a programme, they offer a means of holding them temporarily. Not all variables, though, are made equally. Each variable has a scope that specifies how long it will be seen and used in a programme.

Q6.Define data types in java.
ans: Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:

1.Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
2.Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

Q7.  What is type casting in java?
Ans: Convert a value from one data type to another data type is known as type casting.  

     In Java, type casting is a method or process that converts a data type into another data type in both ways manually and automatically. The automatic conversion is done by the compiler and manual conversion performed by the programmer

Q8.  Write a program to add two number by taking input from user.

Ans. public class add{
   public static void main(String []args) {
	   int num1,num2;
	   Scanner obj = new Scanner(System.in);
	   System.out.println("Enter number 1");
	   num1 = obj.nextInt();
	   System.out.println("Enter number 2");
	   num2 = obj.nextInt();
	   System.out.println(num1 + num2);
   }
}

Q9.  Define operator and its type?
Ans. There are many types of operators in Java which are given below:
     1. Unary Operator
     2. Arithmetic Operator
     3. Shift Operator
     4. Relational Operator
     5. Bitwise Operator
     6. Logical Operator
     7. Ternary Operator 
     8. Assignment Operator.

 Q10. Write a program to perform operators operation.
  Ans:  1. public class Unary{  
         public static void main(String args[]){  
         int x=10;  
         System.out.println(x++);  
         System.out.println(++x);//12  
         System.out.println(x--);  
         System.out.println(--x);  
       }}  
      2.public class Arithmetic{  
        public static void main(String args[]){  
        int a=10;  
        int b=5;  
        System.out.println(a+b);  
        System.out.println(a-b); 
        System.out.println(a*b); 
        System.out.println(a/b);  
        System.out.println(a%b);  
       }}  
       3.public class OperatorShift{  
         public static void main(String args[]){  
         System.out.println(10<<2);  
         System.out.println(10<<3); 
        System.out.println(20<<2);  
        System.out.println(15<<4);  
       }} 
        