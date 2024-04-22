package root;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    /*
    Input: aaabc
Output: abaca
Input: aaabb
Output: ababa
input: aabcd
output -> abac
     */
    public static void main(String args[]){
        String str = "aaabc";
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i) , map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }

        String response = "";
        for(Map.Entry<Character,Integer> ent: map.entrySet()){
            if(response.isEmpty()){
                response = response+ent.getKey();
                int val = ent.getValue().intValue();
                ent.setValue(val-1);
                map.put(ent.getKey(),ent.getValue());
            }
            else if(!response.isEmpty() &&  response.charAt(response.length()-1)!=ent.getKey() && ent.getValue()!=0){
                response= response+ent.getKey();
                int val = ent.getValue().intValue();
                ent.setValue(val-1);
                map.put(ent.getKey(),ent.getValue());
            }
        }
        System.out.println(response);
    }

    private static void res(String str){

    }
}
