//package su.bzz.study.skillBoxSound;
//


//try {
//        InputStream in = new FileInputStream(file.getPath());
//        client.files().uploadBuilder("/" + file.getName())
//        .uploadAndFinish(in);
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//
//import com.dropbox.core.DbxRequestConfig;
//import com.dropbox.core.v2.DbxClientV2;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class MainSound {
//
//    String ACCESS_TOKEN = "sl.AkIsgiOs4H9_OysaBD240oAJzimwBhnk3Af3umppg3_EUsuij1-IC1Wf2UqRgidSazsdE08FTdt6wNsPRKJEpb9F-BdisbAB-0QYe58bebFfjsqOX_nBNLTOFwecj61dKMO9aGo";
//
//    DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial")
//            .build();
//    DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
//
//
//    try {
//        InputStream in = new FileInputStream
//                ("Users\USER\Downloads\Telegram Desktop\capture_20201023122711333.jpg");
//
//        client.files().uploadBuilder("/test.txt")
//                .uploadAndFinish(in);
//    } catch(Exception e){
//        e.printStackTrace();
//    }
//
//
//
//}
