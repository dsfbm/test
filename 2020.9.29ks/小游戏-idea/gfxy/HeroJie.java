package com.zhcpt.sixtest.gfxy;

import java.util.Random;

/**
 * @author 温彬
 */
public class HeroJie {
    public static void main(String[] args) {
        int[] SkillHurt = {50, 70, 80, 100};
        String[]     Skillcxk = {"唱", "跳", "rap", "篮球"};
        Hero cxk = new Hero("蔡徐坤", Skillcxk, SkillHurt, 700);
        String[] Skillwyf = {"rap", "修车", "街舞", "呆猫沙"};
        Hero wyf = new Hero("吴亦凡", Skillwyf, SkillHurt, 700);
        Random random = new Random();
        int i = random.nextInt(2);
        System.out.println("VS开始，首先摇色子决定谁先、出手");
        while (true) {
            if (i == 0) {
                System.out.println("蔡徐坤先攻击吴亦凡");
                if (cxk.getHp() <= 0) {
                    System.out.println(cxk.getName() + "血量低于0，无法继续攻击" + wyf.getName() + "获胜");
                    break;
                }
                cxk.attack(wyf);

                if (wyf.getHp() <= 0) {
                    System.out.println(wyf.getName() + "xiedi" + cxk.getName() + "获胜");
                }
                wyf.attack(cxk);
            } else if (i == 1) {
                System.out.println("吴亦凡开始攻击蔡徐坤");
                if (wyf.getHp() <= 0) {
                    System.out.println(wyf.getName() + "血量低，无法攻击" + cxk.getName() + "获胜");
                    break;
                }
                wyf.attack(cxk);

                if (cxk.getHp() <= 0) {
                    System.out.println(cxk.getName() + "血量为0" + wyf.getName() + "获胜");
                }
                cxk.attack(wyf);

            }


        }

    }
}




