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