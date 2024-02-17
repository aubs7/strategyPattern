package StrategyLab;

public class Wizard implements Strategy{
    private DefendStrategy defendStrategy;
    private AttackStrategy attackStrategy;
    private String output;

    public Wizard(DefendStrategy defendStrategy){
        this.defendStrategy = defendStrategy;
    }

    public Wizard(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }

    @Override
    public String defend(){
        output = "Wizard" + defendStrategy.createMagic();

        return output;

    }

    @Override
    public String attack() {
        output = "Wizard" + attackStrategy.castSpell();

        return output;
    }
}
