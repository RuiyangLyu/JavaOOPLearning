import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadThread implements Runnable {
    private String fileName;
    private long start, end;
    private String url;
    private long downloadedSize;

    public DownloadThread(String fileName, String url, long start, long end) {
        this.fileName = fileName;
        this.url = url;
        this.start = start;
        this.end = end;
        downloadedSize = 0;
    }

    public long getDownloadedSize() {
        return downloadedSize;
    }

    @Override
    public void run() {
        RandomAccessFile file = null;
        InputStream is = null;
        try {
            URL realUrl = new URL(url);
            HttpURLConnection httpcon = (HttpURLConnection) realUrl.openConnection();
            httpcon.setConnectTimeout(5000);//// 设置连接请求超时的时间
            httpcon.setReadTimeout(5000);//设置读取超时时间
            httpcon.setRequestMethod("GET");
            //指定文件下载的起始位置
            httpcon.setRequestProperty("Range", "bytes=" + start + "-" + end);

            httpcon.connect();
            if (httpcon.getResponseCode() == 206) {
                file = new RandomAccessFile(fileName, "rwd");
                file.seek(start);
                is = httpcon.getInputStream();

                int len = 0;
                byte[] buffer = new byte[1024];
                while ((len = is.read(buffer)) != -1) {
                    file.write(buffer, 0, len);// 写文件
                    downloadedSize += len;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
