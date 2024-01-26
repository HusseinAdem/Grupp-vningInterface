package TestClasses;

public class Pokemon implements Emotional,Movable{
    String type;
    String name;
    PossibleMoves pMove;
    PossibleEmotions pEmotion;

    public Pokemon(String type, String name, PossibleMoves pMove,PossibleEmotions pEmotion){
        this.type =type;
        this.name =name;
        this.pMove = pMove;
        this.pEmotion = pEmotion;
    }
    public Pokemon(){
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PossibleMoves getpMove() {
        return pMove;
    }

    public void setpMove(PossibleMoves pMove) {
        this.pMove = pMove;
    }

    public PossibleEmotions getpEmotion() {
        return pEmotion;
    }

    public void setpEmotion(PossibleEmotions pEmotion) {
        this.pEmotion = pEmotion;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", pMove=" + pMove +
                ", pEmotion=" + pEmotion +
                '}';
    }

    @Override
    public void toBeHappy() {
        pEmotion = PossibleEmotions.BABY_DOLL_EYES;
        System.out.println(pEmotion);
    }

    @Override
    public void toBeAngry() {pEmotion = PossibleEmotions.OUTRAGE;}

    @Override
    public void toBeSad() {pEmotion =PossibleEmotions.WORRYSEED;}

    @Override
    public void toStand() {pMove=PossibleMoves.ENDURE;}

    @Override
    public void toSitDown() {pMove = PossibleMoves.BRAVE_BIRD;}



    @Override
    public void toLay() {pMove = PossibleMoves.HYPNOSIS;}


    @Override
    public void toJump() {pMove=PossibleMoves.FEATHER_DANCE;}


    @Override
    public void toGo() {pMove=PossibleMoves.ENDEAVOR;}

}
