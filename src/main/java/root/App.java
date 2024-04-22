package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class App {
    public static void main(String[] args) {


        //SpringApplication.run(App.class, args);
        //Write a recursive java program to find x^n  
        //Input x =2 ,  n =3
        //- 2^3  8
        System.out.println(getResponse(2,3));
        System.out.println(getResponse(3,3));
        System.out.println(getResponse(4,3));
        upperCase();
    }

    private static void upperCase(){
        List<String> names = Arrays.asList("Ravi","ramu","raghu","sam");
        List<String> str = names.stream().filter(x->x.charAt(0)=='r' || x.charAt(0)=='R').map(y->y.toUpperCase()).collect(Collectors.toList());
        System.out.println(str);
    }

    private static  int getResponse(int x , int n){
        int res = 1;
        for(int i=0;i<n;i++){
            res = x*res;
        }
        return  res;
    }
}