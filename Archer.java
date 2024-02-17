package StrategyLab;

public class Archer implements Strategy{
    private DefendStrategy defendStrategy;
    private AttackStrategy attackStrategy;
    private String output;

    public Archer(DefendStrategy defendStrategy){
        this.defendStrategy = defendStrategy;
    }

    public Archer(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }


    @Override
    public String defend(){
        output = "Archer" + defendStrategy.shield();

        return output;

    }

    @Override
    public String attack() {
        output = "Archer" + attackStrategy.shootArrow();

        return output;
    }
}
