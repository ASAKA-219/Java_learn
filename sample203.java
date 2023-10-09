class Airplane{
    public void fly(){
        System.out.println("飛行する");
    }
}

class Fighter extends Airplane{
    public void fight(){
        System.out.println("戦闘する");
    }
}
public class sample203 {
    public static void main(String[] rargs){
        Airplane a = new Airplane();
        Fighter f = new Fighter();
        a.fly();
        f.fly();
        f.fight();
    }
}