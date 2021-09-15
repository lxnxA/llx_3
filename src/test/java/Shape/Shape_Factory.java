package Shape;

public class Shape_Factory {
    public static Shape_Project getProject(String arg){
        Shape_Project product=null;
        try{
            if(arg.equalsIgnoreCase("Circle"))
                product= new ConcreteProjectCircle();
            else if(arg.equalsIgnoreCase("Rectangle"))
                product=new ConcreteProjectRectangle();
            else if (arg.equalsIgnoreCase("Triange"))
                product=new ConcreteProjectTriangle();
            else {
                throw new UnsupportedShapeException();
            }
        }catch(UnsupportedShapeException exception){
            exception.printStackTrace();
            System.out.println("图形创建失败");
        }
        return product;

    }
}
