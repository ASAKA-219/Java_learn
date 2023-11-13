public class sample401{
    public static void main(Strng[] args){
        // a[i]〜a[n-1]の範囲から最小を見つけ位置をkに入れる (a[k]が仮の最小値)
        int k = i;
        for (int j = i + 1; j < n ; j++) {
            if ( a[j] < a[k]) {
                k = j;
            }
        }
        
    }
}