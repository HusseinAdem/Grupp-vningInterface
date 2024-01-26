package TestClasses;


public class Person implements Greetable , Movable, Emotional{
    String namn;
    int age;
    Position position;
    Emotions emotions;


    public Person(String namn, int age, Position position, Emotions emotions ){
        this.namn = namn;
        this.age = age;
        this.position = position;
        this.emotions = emotions;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namn='" + namn + '\'' +
                ", age=" + age +
                ", position=" + position +
                ", emotions=" + emotions +
                '}';
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void sayhello() {
        System.out.println("Hello everybody");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Hello goodby");
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
        position = position.LAYING;
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
    public void toBeHappy() {
        emotions = emotions.HAPPY;
    }

    @Override
    public void toBeAngry() {
        emotions = emotions.ANGRY;
    }

    @Override
    public void toBeSad() {
        emotions = emotions.SAD;
    }

}



