public class factorial {

    static int facto(int n) {
        if (n == 0)
            return 1;
        else
            return n * facto(n - 1);
    }

}
