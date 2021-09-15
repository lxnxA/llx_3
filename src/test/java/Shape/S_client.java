package Shape;

import java.util.Scanner;

public class S_client {
    public static void main(String[] args){
        Shape_Project project;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你要创建对象（Circle,Rectangle,Triangle");
        String pro2= input.next();
        project=Shape_Factory.getProject(pro2);
        project.draw();
        project.erase();
    }
}
