package TestClasses;

public class Robot implements Greetable, Movable{
    Position position;
    String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void sayhello() {
        System.out.println("Hello! I am " + name + "!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye from Robotek");
    }

    @Override
    public void toStand() {
        position = Position.STANDING;
    }

    @Override
    public void toSitDown() {
        position = Position.SITTING;
    }

    @Override
    public void toLay() {
        position = Position.LAYING;
    }

    @Override
    public void toJump() {
        position = Position.JUMPING;
    }

    @Override
    public void toGo() {
        position = Position.GOING;
    }
}
