import java.util.*;

public class Main {
    public static void main(String[] args) {
// 学年と授業のリストをマップで管理します。
        Map<Integer, List<String>> gradeToClassesMap = new HashMap<>();
// 各学年に対する授業のリストを追加します。
        gradeToClassesMap.put(1, new ArrayList<>() {{
            add("数学");
            add("英語");
            add("歴史");
        }});
        gradeToClassesMap.put(2, new ArrayList<>() {{
            add("生物");
            add("地理");
            add("外国語");
        }});
        gradeToClassesMap.put(3, new ArrayList<>() {{
            add("化学");
            add("物理");
            add("現代文");
        }});

        Scanner scanner = new Scanner(System.in);
        try {
// 学年をユーザーに入力してもらいます。
            System.out.println("学年を入力してください（1〜3年生）:");
            int grade = scanner.nextInt();

// 入力された学年に対応する授業のリストを取得して表示します。
            if (gradeToClassesMap.containsKey(grade)) {
                List<String> classes = gradeToClassesMap.get(grade);
                System.out.println(grade + "年生の受けるべき授業:");
                for (String className : classes) {
                    System.out.println(" - " + className);
                }
            } else {
                System.out.println("指定された学年の授業リストは存在しません。");
            }
        } catch (InputMismatchException e) {
// 数字以外が入力された場合など、例外が発生したときの処理
            System.out.println("不正な入力がありました。数字の1〜3を入力してください。");
        } finally {
// Scannerを閉じます。
            scanner.close();
        }
    }
}


