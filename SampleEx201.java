class Car{
    private int fuel = 0; //燃料
    private int migration = 0; //移動距離

    public Car(){ //コンストラクター
        System.out.println("Carオブジェクト初期化");
    }

    public void move(int fuel){
        if(fuel>=0){
            migration++;
            fuel--;
        }
        System.out.println("移動距離:"+migration);
        System.out.println("燃料:"+fuel);
    }

    public void supply(int fuel){
        if(fuel > 0){
            this.fuel += fuel;
        }
        System.out.println("燃料:"+fuel);
    }
}

class Ambulance extends Car{
    private int number = 119;

    public Ambulance(){
        System.out.println("Ambulanceオブジェクト継承");
    }

    public void savePeople(){
        System.out.println("救急救命活動");
        System.out.println("呼び出し"+number+"番");

    }
}

public class SampleEx201 {
    public static void main(String[] args) {
        //to do
        Car c = new Car(); //スーパークラス
        c.supply(10);
        c.move(10);
        c.move(10);
        Ambulance a = new Ambulance(); //サブクラス
        a.supply(10);
        a.move(10);
        a.savePeople();
    }
}