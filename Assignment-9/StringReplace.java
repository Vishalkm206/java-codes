public class StringReplace {
    public static void main(String[] args){
        String s= "Hello dear students of my class";
        String olds="students";
        String news="friends";
        System.out.println(s);
        String str = s.replace(olds, news);
        System.out.println(str);
    }
}