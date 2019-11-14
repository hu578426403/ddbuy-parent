package fastdfs;

import fastdfs.util.FileUtil;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

import java.io.FileOutputStream;

public class uploadTest {
    @Test
    /**
     * 上传文件测试
     */
    public void uploadFile(){

        try {
            //1.加载配置
            ClientGlobal.init("fastdfs.properties");
            //2.创建TrackerClient对象
            TrackerClient trackerClient = new TrackerClient();
            //3.获得TrackerServer对象
            TrackerServer trackerServer = trackerClient.getConnection();
            //4.获取StorageClient(存储)对象
            StorageClient storageClient = new StorageClient(trackerServer,null);
            //上传文件
            String[] infos = storageClient.upload_file("D:\\uploads\\2019\\10\\24\\11\\02\\12\\1571886132530.gif", "gif", null);
            //关闭资源
            //关闭客户端
            storageClient = null;
            trackerClient = null;
            //关闭服务器
            trackerServer.close();

            //打印信息
            System.out.println("上传成功...");
            for (String info : infos) {
                System.out.println(info);
            }

        } catch (Exception e) {
            System.err.println("上传失败...");
            e.printStackTrace();
        }
    }

    @Test
    /**
     * 删除文件
     */
    public void delFile(){
        try {
            //得到storageClient存储对象
            StorageClient storageClient = FileUtil.getStorageClient();
            //删除文件
            storageClient.delete_file("group1","M00/00/00/wKgBHl3NmbKAC9xwAABWprpO8hk782.gif");
            System.out.println("删除成功...");
        } catch (Exception e) {
            System.err.println("删除失败...");
            e.printStackTrace();
        }
    }

    @Test
    /**
     * 下载文件
     */
    public void downFile(){
        try {
            StorageClient storageClient = FileUtil.getStorageClient();
            byte[] bs = storageClient.download_file("group1", "M00/00/00/wKgBHl3NmbKAC9xwAABWprpO8hk782.gif");
            //获取输出流
            FileOutputStream fos = new FileOutputStream("d:/uploads/aaa.gif");
            //输出
            fos.write(bs);
            //释放资源
            fos.close();
            System.out.println("下载成功...");
        } catch (Exception e) {
            System.err.println("下载失败...");
            e.printStackTrace();
        }
    }
}
