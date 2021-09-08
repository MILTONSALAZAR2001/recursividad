public class ejercicios {

    /*
    Maximo comun divisor (mcd), algoritmo de Euclides
    a = 412 y b = 184
     */
    public static int mcd(int a, int b){
        int mcd;

        if(a == b){
            //caso base
            mcd = b;

        } else {
            if(a > b){
                a = a - b;
            }else {
                b = b - a;
            }
            mcd = mcd(a,b);
        }
        return mcd;
    }
}
