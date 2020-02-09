class StaticVariable
{
    static int a;
    public static void main(String[] args)
    {
 	 StaticVariable s = new StaticVariable();
         System.out.println(s.a);
	 //recommend way
	 System.out.println(StaticVariable.a);
     }
}