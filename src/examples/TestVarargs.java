public class TestVarargs {
    static int sum(int... a){
        int res = 0;
        for(int i:a)
            res += i;
        return res;
    }

    static void printAll(String... strs){
        for(String s: strs)
            System.out.println(s);
        return;
    }

    public static void main(String[] args){
        //sum(1,2,3,4);
        printAll(args);
        return;
    }
}
