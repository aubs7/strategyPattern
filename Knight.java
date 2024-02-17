package StrategyLab;

public class Knight implements Strategy {
    private DefendStrategy defendStrategy;
    private AttackStrategy attackStrategy;
    private String output;

    public Knight(DefendStrategy defendStrategy){
        this.defendStrategy = defendStrategy;
    }

    public Knight(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }

    @Override
    public String defend(){
        output = "Knight" + defendStrategy.shield();
        output += "\nKnight" + defendStrategy.dodge();
        output += "\nKnight" + defendStrategy.createMagic();

        return output;
       
    }

    @Override
    public String attack() {
        output = "Knight" + attackStrategy.swingSword();

        return output;
    }
}
