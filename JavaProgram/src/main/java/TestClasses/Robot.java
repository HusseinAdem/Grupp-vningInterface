package TestClasses;

public class Robot implements Greetable, Movable{
    Position position;
    String name;

    public Robot(String name) {
        this.name = name;
        position = getPosition();
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void sayhello() {
        System.out.println("Hello! I am " + name + "!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye from " + name + "\n");
    }

    @Override
    public void toStand() {
        position = Position.STANDING;
    }

    @Override
    public void toSitDown() {
        position = Position.SITTING;
        System.out.println(name + " is " + position + " down!");
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

    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                ", name='" + name + '\'' +
                '}';
    }
}
