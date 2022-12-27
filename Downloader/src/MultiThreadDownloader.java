import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MultiThreadDownloader {
    private String url;             //被下载文件url
    private String localPath;        //本地文件所在目录，可以不需要
    private int totalThread;        // 线程数量
    private String fileName;        // 本地文件
    private long length;           // 用于保存文件大小
    private DownloadThread[] threads;  //多个下载线程

    public MultiThreadDownloader(String url, String path, String filename, int totalThread) {
        this.url = url;
        this.localPath = path;
        this.totalThread = totalThread;
        this.fileName = filename;
        threads = new DownloadThread[totalThread];
    }
    public long getLength() {
        return this.length;
    }
    public long getTotalDownloadedBytes() {
        long downloadedLen = 0;
        for (DownloadThread thread : threads) {
            downloadedLen += thread.getDownloadedSize();
        }
        return downloadedLen;
    }

    public void startDownloader() {
        HttpURLConnection httpcon = null;

        try {
            URL realUrl = new URL(url);
            httpcon = (HttpURLConnection) realUrl.openConnection();
            httpcon.setConnectTimeout(5000);//// 设置请求超时的时间
            httpcon.setRequestMethod("GET");
            httpcon.connect();
            if (httpcon.getResponseCode() == 200) {
                length = httpcon.getContentLengthLong();
                /*
                 * 以后再改进，长度未知或者链接转发的情况 if(length==-1) { totalThread=1; }
                 */
                // 创建待下载的文件
                RandomAccessFile raFile = new RandomAccessFile(localPath + "/" + fileName, "rwd");
                raFile.setLength(length);// 设置文件大小
                raFile.close();

                long partLength = length / totalThread;

                long start = 0, end = 0;

                for (int i = 0; i < totalThread; i++) {// 启动下载线程
                    start = partLength * i;
                    end = partLength * (i + 1) - 1;
                    if (i == totalThread-1) {
                        end = length - 1;
                    }
                    threads[i] = new DownloadThread(localPath + "/" + fileName, url, start, end);
                    new Thread(threads[i]).start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
