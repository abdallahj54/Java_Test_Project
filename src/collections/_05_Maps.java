package collections;

import java.util.HashMap;

public class _05_Maps {
    public static void main(String[] args) {
        /*
        Key             Value
        IL              Illinois
        WI              Wisconsin
        CA              California

        1               Vlad
        2               Andrii
        3               Filiz
        4               Vlad

        1               10
        2               2

        Altay           [Valentina, Aya, Bashar]
         */

        HashMap<String, String> map = new HashMap<>();
        map.put("IL", "Illinois");
        map.put("WI", "Wisconsin");
        map.put("CA", "California");
        map.put("CA", "abc");
        map.put(null, "xxx");
        map.put(null, "yyy");
        map.put("A", null);
        map.put("B", null);
        map.put("C", null);

        System.out.println(map.size()); //7
        System.out.println(map); //{null=yyy, A=null, WI=Wisconsin, B=null, IL=Illinois, C=null, CA=abc}
    }
}