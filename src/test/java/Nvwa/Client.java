package Nvwa;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Project project;
        Scanner input=new Scanner(System.in);
        String pro="1";
        while (pro!="E") {
            System.out.println("请输入您的创建对象（'M','W','R')");
            pro = input.next();
            project = Factory.getPeoject(pro);
            project.methodSame();
            project.methodDiff();
        }
        System.out.println("已退出");
    }
}
