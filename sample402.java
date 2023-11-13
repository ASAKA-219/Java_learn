public class sample402.java{
    public static void main(String[] args){
        // 小さい順に並んでいる連a[0]〜a[i-1]に対して，新しい値tの
        // 挿入位置を空けるために，tより大きい要素を後ろにずらす
        int j = i;
        while (j >= 1) {
            if (a[j-1] <= t) break; // 挿入位置を発見
            a[j] = a[j-1];
            j--;
        }
        // 挿入位置がjに入っている
    }
}