package NandhaSirClass;

public class EmptyScope {
    public static void main(String[] args) {
        int i;
        for(i=0;i<5;i++);//for(i=0;i<5;i++){    } which is empty loop and 'i' value is incremented at each iteration
        {
            System.out.println(i);//  '{    }' means empty scope  which execute the statement inside it.
        }
        System.out.println(i);
    }
}
