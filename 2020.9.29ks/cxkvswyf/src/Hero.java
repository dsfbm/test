import java.util.Random;

/**
 * 创建hero类
 */
public class Hero {
    /**
     * 定义属性
     */
    private String Name;
    private String[] Skill;
    private int[] SkillHurt={50 , 60 , 70, 100};
    private double Hp;

    /**
     * 定义有参构造
     * @param name
     * @param skill
     * @param skillHurt
     * @param hp
     */
    public Hero(String name, String[] skill, int[] skillHurt, double hp) {
        Name = name;
        Skill = skill;
        SkillHurt = skillHurt;
        Hp = hp;
    }

    /**
     * 定义无参构造
     */
    public Hero() {
    }

    public String getName() {
        return Name;
    }

    /**
     * 创建get，set方法
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    public String[] getSkill() {
        return Skill;
    }

    public void setSkill(String[] skill) {
        Skill = skill;
    }

    public int[] getSkillHurt() {
        return SkillHurt;
    }

    public void setSkillHurt(int[] skillHurt) {
        SkillHurt = skillHurt;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    /**
     * 定义成员方法attack
     * @param hero
     */
    public  void attack(Hero hero) {
        /**
         * 定义数组并获取skill里的技能伤害
         */
    Random random = new Random();
    int stochastic = random.nextInt(Skill.length);
    String Skill =getSkill()[stochastic];
    double SkillHurt = hero.SkillHurt[stochastic];
    hero.Hp = hero.Hp - SkillHurt;
    System.out.println(getName() + "使用了" + '"'+Skill + '"'+"技能，对"
            +hero.getName() + "造成了" + '"'+SkillHurt + "伤害，"
            + hero.getName() + "现在还剩" + hero.getHp() + "血量！");
}
}