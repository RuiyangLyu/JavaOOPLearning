
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class phoneCodeReader {
    public static final String FilePath = "C:\\Users\\MSI\\Documents\\GitHub\\JavaOOPLearning\\ArrayListLearn\\ArrayListLearn\\src\\phonecode.txt";//文件目录
    private static Map<String, String> hashMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        File2HashMap();
        System.out.println(hashMap);

        System.out.println(hashMap.get("12336"));

        hashMap.remove("12316");
        System.out.println(hashMap);
    }

    public static void File2HashMap() throws IOException {
        File file = new File(FilePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String data = null;
            while ((data = reader.readLine()) != null){
                String[] param = data.split(",");
                hashMap.put(param[0],param[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
