## Steps to create your own exception class

Create a new class whose name should end with *Exception* like *ClassNameException*.This is a convention to differentiate an exception class from regular ones.

Make the class extends one of the exceptions which are subtypes of the *java.lang.Exception class*.Generally, a custom exception class always extends directly from the Exception class.

Create a constructor with a String parameter which is the detail message of the exception. In this constructor, simply call the super constructor and pass the message. 