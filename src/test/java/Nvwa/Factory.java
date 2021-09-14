package Nvwa;

public class Factory {
    public static Project getPeoject(String arg){
        Project product =null;
        if(arg.equalsIgnoreCase("W"))
            product=new ConcreteProductW();
        else if(arg.equalsIgnoreCase("M"))
            product=new ConcreteProjectM();
        else if(arg.equalsIgnoreCase("R"))
            product=new ConcreteProjectR();
        return product;
    }

}
