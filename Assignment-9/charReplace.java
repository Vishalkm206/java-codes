public class charReplace {
    public static void main(String[] args){
        String s= "Hello World";
        char oldCh='o';
        char newCh='x';
        System.out.println(s);
        String str = s.replace(oldCh, newCh);
        System.out.println(str);
    }
}
