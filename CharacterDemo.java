package StrategyLab;

public class CharacterDemo {
    public static void main(String[] args) {
        DefendStrategy defendStrategy = new DefendStrategy();
        AttackStrategy attackStrategy = new AttackStrategy();
        Character knightDefend = new Character(new Knight(defendStrategy));
        Character knightAttack = new Character(new Knight(attackStrategy));
        Character wizardDefend = new Character(new Wizard(defendStrategy));
        Character wizardAttack = new Character(new Wizard(attackStrategy));
        Character archerDefend = new Character(new Archer(defendStrategy));
        Character archerAttack = new Character(new Archer(attackStrategy));

        System.out.println(knightDefend.defend());

        System.out.println();

        System.out.println(knightAttack.attack());

        System.out.println();

        System.out.println(wizardAttack.attack());

        System.out.println();

        System.out.println(archerDefend.defend());

        System.out.println();

        System.out.println(archerAttack.attack());

    }
    
}
