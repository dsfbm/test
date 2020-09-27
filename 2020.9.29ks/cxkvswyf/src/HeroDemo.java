import java.util.Random;

/**
 * 创建HeroDemo类
 */
public class HeroDemo {
    /**
     * 添加main方法
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 创建cxk对象并对其初始化
         */
        Hero cxk = new Hero();
        cxk.setName("蔡徐坤");
        String[] Skillcxk = {"唱", "跳", "rap", "篮球"};
        cxk.setSkill(Skillcxk);
        cxk.setHp(700.0);
        /**
        * 创建wyf对象并对其初始化
        */
        Hero wyf = new Hero();
        wyf.setName("吴亦凡");
        String[] Skillwyf = {"rap", "篮球", "街舞", "大碗宽面"};
        wyf.setSkill(Skillwyf);
        wyf.setHp(700.0);
        /**
         * 完成随机判断谁先出手功能.
         */
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0){
            System.out.println("摇到0，cxk开始攻击wyf");
        }else {
            System.out.println("摇到1，wyf开始攻击cxk");
        }
        /**
         * 完成判断功能
         */
        while (true) {
            if (i == 0) {
                 //每次先攻击前先判断蔡徐坤的血量
                if (cxk.getHp() <= 0) {
                    System.out.println(cxk.getName() + "血量小于等于0，无法继续攻击，" + wyf.getName() + "获胜");
                    return;
                }
                cxk.attack(wyf);
                //每次先攻击前先判断吴亦凡的血量
                if (wyf.getHp() <= 0) {
                    System.out.println(wyf.getName() + "血量小于等于0，无法继续攻击，" + cxk.getName() + "获胜");
                    return;
                }
                wyf.attack(cxk);
            } else if (i == 1) {
                 //每次先攻击前先判断蔡徐坤的血量
                if (wyf.getHp() <= 0) {
                    System.out.println(wyf.getName() + "血量小于等于0，无法继续攻击，" + cxk.getName() + "获胜");
                    return;
                }
                wyf.attack(cxk);
                 //每次先攻击前先判断蔡徐坤的血量
                if (cxk.getHp() <= 0) {
                    System.out.println(cxk.getName() + "血量小于等于0，无法继续攻击，" + wyf.getName() + "获胜");
                    return;
                }
                cxk.attack(wyf);
            }
        }

    }
}




