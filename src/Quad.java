import java.util.Arrays;

public class Quad {
    private String q[];
     public Quad(String [] vals){
         this.q=vals;
     }
     public  Quad(String s1, String s2,String s3,String s4)
     {
         q= new String[4];
         q[0]=s1;
         q[1]=s2;
         q[2]=s3;
         q[3]=s4;
     }
     public String get(int index)
     {
         return q[index];
     }
     public void  set(int index ,String val)
     {
         q[index]=val;
     }

    @Override
    public String toString() {
        return '('+q[0]+','+q[1]+','+q[2]+','+q[3]+')';
    }
}
