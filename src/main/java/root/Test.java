package root;

import org.springframework.boot.context.event.SpringApplicationEvent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    /*i/p - ABC
     ABC
ACB
BAC
BCA
CBA
CAB
     */

    public static void main343(String args[]){
        String str = "123";
        permutation("" ,str);
    }
    private static void permutation(String perm , String word){
        if(word.isEmpty()){
            System.out.println(perm);
        }else{
            for(int i=0;i<word.length();i++){
                permutation(perm+word.charAt(i) , word.substring(0,i)+word.substring(i+1,word.length()));
            }
        }
    }

    public static void  main(String  args[]){
        List<Integer> list1 = Arrays.asList(10,20,30,40);
        List<Integer> list2 = Arrays.asList(20,30,60,80);
        List<Integer> resp = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(resp);
    }

}
