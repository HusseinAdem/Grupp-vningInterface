package TestClasses;

public class Animal implements Emotional , Movable {
    String animal;
    String name;
    Emotions emotional;
    Position position;

    public Animal(String animal,String name,Emotions emotional,Position position ){
        this.animal = animal;
        this.name = name;
        this.emotional = emotional;
        this.position = position;
    }

    @Override
    public void toBeHappy() {
        this.emotional = emotional.HAPPY;
    }

    @Override
    public void toBeAngry() {
        this.emotional = emotional.ANGRY;
    }

    @Override
    public void toBeSad() {
        this.emotional = emotional.SAD;
    }

    @Override
    public void toStand() {
        this.position = position.STANDING;
    }

    @Override
    public void toSitDown() {
        this.position = position.SITTING;
    }

    @Override
    public void toLay() {
        this.position = position.LAYING;
    }

    @Override
    public void toJump() {
        this.position = position.JUMPING;
    }

    @Override
    public void toGo() {
        this.position = position.GOING;
    }
}
