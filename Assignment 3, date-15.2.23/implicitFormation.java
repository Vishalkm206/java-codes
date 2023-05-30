class implicitFormation {
    public static double add(double a, double b){
        return (a+b);
    }    
    public static int add(int a, int b){
        return (a+b);
    }
    public static void main(String[] args){
        System.out.println("sum: "+add(2,3));
        System.out.println("sum: "+add('a','b'));
    }
}
