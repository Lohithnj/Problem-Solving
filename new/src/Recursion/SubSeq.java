package Recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        skip("" ,"baccad");
//        System.out.println(skip("baaaad"));
//        System.out.println(StartWithApple("abcappledef"));
//        System.out.println(StartWithAppNotApple("abcappledef"));
//        System.out.println(StartWithAppNotApple("abcappldef"));

        subseq("","abc");

//        System.out.println(subseqret("","abc"));

//        System.out.println(subseqAsciiret("","abc"));
    }

    //Set processed and unproccessed string in argument
    static void skip(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a')
            skip(p,up.substring(1));
        else
            skip(p+ch,up.substring(1));

    }

    //Passing string as a argument
    static String skip(String up){
        if(up.isEmpty()) {
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
            return skip(up.substring(1));
        else
            return ch+skip(up.substring(1));
    }

    static String StartWithApple(String up){
        if(up.isEmpty()) {
            return up;
        }

        if(up.startsWith("apple"))
            return StartWithApple(up.substring(5));
        else
            return up.charAt(0)+StartWithApple(up.substring(1));
    }

    static String StartWithAppNotApple(String up){
        if(up.isEmpty()) {
            return up;
        }

        if(up.startsWith("app") && ! up.startsWith("apple"))
            return StartWithAppNotApple(up.substring(5));
        else
            return up.charAt(0)+StartWithAppNotApple(up.substring(1));
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqret(p+ch,up.substring(1));
        ArrayList<String> right=subseqret(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseqAsciiret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> take=subseqAsciiret(p+ch,up.substring(1));
        ArrayList<String> dtake=subseqAsciiret(p,up.substring(1));
        ArrayList<String> asci=subseqAsciiret(p+(ch+0),up.substring(1));

        take.addAll(dtake);
        take.addAll(asci);
        return take;
    }

}
