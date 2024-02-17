package StrategyLab;

public class Character {
    private Strategy strategy;
    private Strategy newStrategy;

    public Character(Strategy strategy) {
        this.strategy = strategy;
    }

    public String defend(){
        return strategy.defend();
    }

    public String attack(){
        return strategy.attack();
    }

}
