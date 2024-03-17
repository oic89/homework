package homework2;

import java.util.Scanner;

public class Test {
    private static RMB rmb = new RMB(0, 0, 0);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            if (rmb.getYuan()<0){
                //余剩人民币小于零，退出
                System.out.println("当前RMB小于零");
                return;
            }
            System.out.println("当前: " + rmb.getYuan() + "元 " + rmb.getJiao() + "角 " + rmb.getFen() + "分");
            System.out.println("加[1] 减[2] 退出[else]");
            System.out.print("请输入指令：");
            String order = sc.next();
            //识别指令
            switch (order) {
                case "1": {
                    addRMB();
                    break;
                }
                case "2": {
                    deleteRMB();
                    break;
                }
                default: {
                    return;
                }
            }
            System.out.println();
        }
    }

    //增加
    private static void addRMB() {
        System.out.print("请输入增加的元:");
        int yuan = sc.nextInt();
        rmb.setYuan(rmb.getYuan() + yuan);
        System.out.print("请输入增加的角:");
        int jiao = sc.nextInt();
        rmb.setJiao(rmb.getJiao() + jiao);
        System.out.print("请输入增加的分:");
        int fen = sc.nextInt();
        rmb.setFen(rmb.getFen() + fen);
        countRMB();
    }

    //减少
    private static void deleteRMB() {
        System.out.print("请输入减少的元:");
        int yuan = sc.nextInt();
        rmb.setYuan(rmb.getYuan() - yuan);
        System.out.print("请输入减少的角:");
        int jiao = sc.nextInt();
        rmb.setJiao(rmb.getJiao() - jiao);
        System.out.print("请输入减少的分:");
        int fen = sc.nextInt();
        rmb.setFen(rmb.getFen() - fen);
        countRMB();
    }

    //整理计算
    private static void countRMB() {
        if (rmb.getFen() >= 10) {
            int fen1 = rmb.getFen() / 10;
            int fen2 = rmb.getFen() % 10;
            rmb.setJiao(rmb.getJiao()+fen1);
            rmb.setFen(fen2);
        }
        while (rmb.getFen()<0){
            rmb.setJiao(rmb.getJiao()-1);
            rmb.setFen(rmb.getFen()+10);
        }
        if (rmb.getJiao() >= 10) {
            int jiao1 = rmb.getJiao() / 10;
            int jiao2 = rmb.getJiao() % 10;
            rmb.setYuan(rmb.getYuan()+jiao1);
            rmb.setJiao(jiao2);
        }
        while (rmb.getJiao()<0){
            rmb.setYuan(rmb.getYuan()-1);
            rmb.setJiao(rmb.getJiao()+10);
        }
    }
}
