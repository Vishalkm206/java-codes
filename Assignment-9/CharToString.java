public class CharToString {
    public static void main(String[] args){
        char [] char_arr={'h','e','l','l','o',' ', 'w','o','r','l','d'};
        String s= new String(char_arr);
        System.out.println("Character array to string object: "+s);

        String s1="Computer is fun";
        char [] char_arr1=s1.toCharArray();
        System.out.println("String object to character array: ");
        for(char i : char_arr1){
            System.out.print(i);
        }
    }
    
}
