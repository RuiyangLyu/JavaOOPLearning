import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class DownLoader implements Runnable{
    static String url = "https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png";
    static String destFile = "D:/Test/test.png";
    @Override
    public void run(){
        URL realUrl = null;
        try {
            realUrl = new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        HttpURLConnection httpcon;
        try {
            httpcon = (HttpURLConnection) realUrl.openConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        httpcon.setConnectTimeout(5000);//// 设置请求超时的时间

        try {
            httpcon.setRequestMethod("GET");
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        }
        try {
            httpcon.connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            if (httpcon.getResponseCode() == 200) {

                RandomAccessFile file = new RandomAccessFile(destFile, "rwd");
                InputStream is = httpcon.getInputStream();

                int len = 0;
                byte[] buffer = new byte[4096];
                while ((len = is.read(buffer)) != -1) {
                    file.write(buffer, 0, len);// 写文件
                    int downloadedSize = len;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
