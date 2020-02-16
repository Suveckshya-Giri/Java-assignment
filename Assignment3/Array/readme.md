## Array
An array is a group of like-typed variables that are referred to by a common name.Arrays in Java work differently than they do in C/C++. Following are some important point about Java arrays.

In Java all arrays are dynamically allocated.(discussed below)
Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using sizeof.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered and each have an index beginning from 0.
Java array can be also be used as a static field, a local variable or a method parameter.
The size of an array must be specified by an int value and not long or short.
The direct superclass of an array type is Object.
Moreover, Java provides the features of anonymous arrays which is not available in C/C++.

!(array_length)https://www.javatpoint.com/images/core/array.gif

##Example##
//Java Program to illustrate the use of declaration, instantiation   
//and initialization of Java array in a single line  
class Array
{  
public static void main(String args[])
{  
int a[]={33,3,4,5};//declaration, instantiation and initialization  
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
}
}  


##Output:

33
3
4
5