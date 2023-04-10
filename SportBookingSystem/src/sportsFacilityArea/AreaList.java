package sportsFacilityArea;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreaList {
    static List<String> area;

    static {
        SportsFacilityList sportsFacilityList = new SportsFacilityList("축구장","농구장","수영장");

//        area=new HashMap<>();

    }

    public static void main(String[] args) {
        System.out.println(area.toString());
    }
}
