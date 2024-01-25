import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> hamsterMap = new HashMap<>();
        hamsterMap.put("ゴールデンハムスター", new ArrayList<>());
        hamsterMap.put("ロボロフスキーハムスター", new ArrayList<>());

        hamsterMap.get("ゴールデンハムスター").add("ハム太");
        hamsterMap.get("ロボロフスキーハムスター").add("はむお");

        try {
            for (Map.Entry<String, List<String>> entry : hamsterMap.entrySet()) {
                System.out.println(entry.getKey() + "の名前:");
                for (String name : entry.getValue()) {
                    System.out.println(" - " + name);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}