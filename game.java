class hishintai {
    private int atack;

    public void shin() {
        System.out.println("行くぞ飛信隊！！！！！！！１");
        this.atack=93;
    }

    public hishintai(){
        System.out.println("３万人おめでとう");
    }

    public void kyokai(int form){
        System.out.println("私はどこにいてもずっと飛信隊だ");
        if(form==2){
            System.out.println("舞うぞ、緑穂。");
            this.atack=97;
        }
        this.atack=95;
    }
}

public class game {
    public static void main(String[] args){
        hishintai h = new hishintai();
    }
}