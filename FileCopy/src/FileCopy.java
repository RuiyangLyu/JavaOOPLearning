import java.io.*;
import java.util.SplittableRandom;

public class FileCopy {
    public static void main(String[] args) {

    }
    public static void Copy(String SourceFile , String CopiedFile) throws IOException {


        FileInputStream in = new FileInputStream(SourceFile);
        FileOutputStream out = new FileOutputStream(CopiedFile);

        byte[] buffer = new byte[1024];
        int word_len;
        while ((word_len = in.read(buffer)) != -1) {
            out.write(buffer, 0, word_len);
        }

        in.close();
        out.close();

        BufferedReader bf = new BufferedReader(new FileReader(SourceFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(CopiedFile));

        String str;
        while (null != (str = bf.readLine())) {
            bw.write(str);
            bw.newLine();
        }

        bf.close();
        bw.close();

    }
}
