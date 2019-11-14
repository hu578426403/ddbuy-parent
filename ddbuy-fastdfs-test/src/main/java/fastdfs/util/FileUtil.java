package fastdfs.util;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class FileUtil {
    /**
     * 返回StorageClient对象
     * @return
     * @throws Exception
     */
    public static StorageClient getStorageClient() throws Exception{
        //1.加载配置
        ClientGlobal.init("fastdfs.properties");
        //2.获得trackerClient对象
        TrackerClient trackerClient = new TrackerClient();
        //3.获得trackerServer对象
        TrackerServer trackerServer = trackerClient.getConnection();
        //4.获得存储对象
        StorageClient storageClient = new StorageClient(trackerServer,null);
        return storageClient;
    }
}
