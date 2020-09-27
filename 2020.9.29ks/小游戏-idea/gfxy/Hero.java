package com.zhcpt.sixtest.gfxy;
import java.util.Random;

public class Hero {

    private String Name;
    private String[] Skill;
    private int[] SkillHurt;
    private double Hp;
    public Hero(String name, String[] skill, int[] skillHurt, double hp) {
        Name = name;
        Skill = skill;
        SkillHurt = skillHurt;
        Hp = hp;
    }

    public Hero() {
    }

    public String getName() {
        return Name;
    }

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

    public  void attack(Hero otherHero) {
    Random random = new Random();
    int SkillNum = random.nextInt(Skill.length);
    String Skill = this.Skill[SkillNum];
    double SkillHurt = otherHero.SkillHurt[SkillNum];
    otherHero.Hp = otherHero.Hp - SkillHurt;
    System.out.println(this.Name + "使用了" + Skill + "技能，对"
            + otherHero.getName() + "造成了" + SkillHurt
            + "伤害" + otherHero.getName() + "现在还剩" + otherHero.getHp() + "血量");
}
}