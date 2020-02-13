## Steps to create your own exception class

1) Create a new class whose name should end with *Exception* like *ClassNameException*.This is a convention to differentiate an exception class from regular ones.

2) Make the class extends one of the exceptions which are subtypes of the *java.lang.Exception class*.Generally, a custom exception class always extends directly from the Exception class.

3) Create a constructor with a String parameter which is the detail message of the exception. In this constructor, simply call the super constructor and pass the message.


*Here*, is the Exception file with class SubuException:

public class SubuException extends Exception 
{
    public SubuException(String hello)
    {
        super(hello);  
    }
} 

We create another file *test.java* to run the code of above java code

class Test
{
    static void ReserveName(String name) throws SubuException
    {
        if(name == "subu")
        {
            throw new SubuException("NameIsReserved");
        }else{
            System.out.println("You can use this name.");
        }
    }

    public static void main(String[] args) {
        try {
           ReserveName("subu");
        } 
        catch (SubuException e) {
            System.out.println("You cannot reserve this name. " + e);
        }
    }
    }
    
    OUTPUT:
    You cannot reserve this name. SubuException: NameIsReserved
