import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String , String> id = new HashMap<>();

        try{
            FileReader fr = new FileReader("db.txt");
            BufferedReader f = new BufferedReader(fr);

            String line;

            while ((line = f.readLine()) != null){
                String[] db = line.split(" ");

                String dbId = db[0];
                String dbPassword = db[1];

                id.put(dbId, dbPassword);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


        String userID;
        String userPw;

        while (true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.println("id: ");
            userID = sc.nextLine().trim();

            if (id.containsKey(userID)){
                System.out.println("password: ");
                userPw = sc.nextLine().trim();
                if (userPw.equals(id.get(userID))){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
        }
    }

}