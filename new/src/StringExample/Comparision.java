package StringExample;

public class Comparision {
    public static void main(String[] args) {
        char ch='e';
        char ch1='b';
        String a="hello";
        String b="hello";

        String ind="o";
        System.out.println(ch==ch1);
        System.out.println(a==b);//check whether the objects are same datatype.
        System.out.println(a.equals(b));//check only value of object.

        String str1=new String("kunal");
        String str2=new String("kunal");

        System.out.println(str1==str2);//it checks only for the same object.
        System.out.println(str1.equals(str2));//it checks the value of the different object using 'equals' method

        System.out.println(a.indexOf(ind));//4
    }
}
