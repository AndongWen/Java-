package hsp.project.smallchangesys;

import java.util.Scanner;

public class SamllChangeSys {
    public static void main(String[] args) {
        Boolean loop = true;
        String choice;
        Scanner myScaner = new Scanner(System.in);
        String detail;
        double balance;
        double sal;
        double cost;

        do{
            System.out.println("\n================零钱通项目================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消    费");
            System.out.println("\t\t\t4 退    出");
            System.out.println("请选择相应的功能(1-4)");
            choice = myScaner.next();


            switch (choice){
                case "1":
                    System.out.println("1 零钱通明细");
                    break;
                case "2":
                    System.out.println("2 收益入账");
                    break;
                case "3":
                    System.out.println("3 消    费");
                    break;
                case "4":
                    System.out.println("4 退    出");
                    loop = false;
                    break;
                default:
                    System.out.println("你的选择有错误，请重新选择！");
                    break;
            }

        }while(loop);
    }
}
