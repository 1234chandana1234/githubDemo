
// * java? java is a object oriented language , easy to learn, case sensitive we can reuse the code and java is open source .
//Every line of code that runs in Java must be inside a class
// class name should always start with upercase letter\

//Main method
// The main() method is required and you will see it in every Java program : public static void main(String[] args)

//print()  and println() -> difference is next line
// you can print numbers in print() method , all words should be inside " "  .

//System.out.println (" printing ");
//System .out.println(10000);


/* Single-line Comments
Single-line comments start with two forward slashes (//).

Any text between // and the end of the line is ignored by Java (will not be executed).

This example uses a single-line comment before a line of code:

Example
// This is a comment
 * 
 * 
Java Variables

Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

* Final Variables
If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)

* Identifiers
All Java variables must be identified with unique names.

These unique names are called identifiers.

*The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names

Data types are divided into two groups:

*
*Primitive data types - includes byte, short, int, long, float, double, boolean and char

*Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

Use float or double?

The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.


* Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
The size of a primitive type depends on the data type, while non-primitive types have all the same size.

*Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

*Operators : They are to perform operations on operator ,Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators

Arithmatic operators
+	Addition	Adds together two values	x + y	
-	Subtraction	Subtracts one value from another	x - y	
*	Multiplication	Multiplies two values	x * y	
/	Division	Divides one value by another	x / y	
%	Modulus	Returns the division remainder	x % y	
++	Increment	Increases the value of a variable by 1	++x	
--	Decrement	Decreases the value of a variable by 1	--x


 assignment operators:

Operator	Example	Same 
=	x = 5	x = 5	
+=	x += 3	x = x + 3	
-=	x -= 3	x = x - 3	
*=	x *= 3	x = x * 3	
/=	x /= 3	x = x / 3	
%=	x %= 3	x = x % 3	
&=	x &= 3	x = x & 3	
|=	x |= 3	x = x | 3	
^=	x ^= 3	x = x ^ 3	
>>=	x >>= 3	x = x >> 3	
<<=	x <<= 3	x = x << 3

Comparasion operator :Comparison operators are used to compare two values

Operator	Name	Example	
==	Equal to	x == y	
!=	Not equal	x != y	
>	Greater than	x > y	
<	Less than	x < y	
>=	Greater than or equal to	x >= y	
<=	Less than or equal to	x <= y

*Logical operators are used to determine the logic between variables or values:

Operator	Name	Description	Example	Try it
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

*conditional statements 

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

if (condition) {
  // block of code to be executed if the condition is true
}

if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}

if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}

Short Hand If...Else :It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements

variable = (condition) ? expressionTrue :  expressionFalse;

*SWITCH

switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}

This is how it works:

* The switch expression is evaluated once.
* The value of the expression is compared with the values of each case.
* If there is a match, the associated block of code is executed.
* The break and default keywords are optional, and will be described later in this chapter

while (condition) {
  // code block to be executed
}



do {
  // code block to be executed
}
while (condition);

The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:

*/
 
package javanew;

public class basics {
	
	public static void main (String Args[]) {
		
		
		//variables are holding data temporarly , it changes each time we assaign 
		int a = 10;
		a= 15;
        System.out.print(a);
        //example for final variable 
        final int b= 10 ;
		//b=20; throws error
        
        //Datatype examples
        
        int myNum = 5;
        float myFloatNum = 5.99f;
        
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        
        //declaring many variables
         String carname, color ;
         int carNumber,Noofcar;
        
         //initializing many numbers
         int q=3, e=4;
        
        //To combine both text and a variable, use the + character:
        
        System.out.println(myText + "  Ram your Roll no is " + myNum);
        
        //widening casting
        
        int small = 8;
        double smalldouble = small;
        
        
        // narrowing casting
        
        double S = 7.0d;
        int B = (int)S;
        
        System.out.println(smalldouble +" "+  B);
        
        //String example
        
        String chirag = "dgjfghugfgjodtjejkhieiowerjoljfgkefghkdfjghdjfkgoyejfeiytierjpiohoufhdghuifhidguifhsoutyhofhuieghoeihioehuehgoerithiouutuuuuuuufhdjghjghkghdufhhggftdtdtdtdtdtdtn";
        
        System.out.println(" No of letters are  " + chirag.length());
        
        String txt = "Hello World";
        System.out.println("capital=" + txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println("small=" + txt.toLowerCase()); 
        
        //short hand if else : ternary operator 
        
        int x = 10, y=13;
        String ans = (x<13) ? "good morning ": " good noon ";
        System.out.println(ans);
        
        
       //Switch statement 
        
       int day = 3;
       
       switch(day){
       
       case 1 : System.out.println(" day = Monday ");
       break;
       
       case 2 : System.out.println("day = tuesday ");
       break;
       
       case 3 : System.out.println("day = wednesday");
       break ;
       
       default :
    	   
    	   System.out.println("wrong input ");
    	
   	
       
    	   
       }
       
       String name = "AJAY";
		String revrse =" ";
		for (int i =0; i<name.length();i++) {
			revrse = name.charAt(i)+revrse;
			System.out.print(revrse);
		}
	}

}
