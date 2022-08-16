package util.extra;

//import model.messages.FileType;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Random;

public class EncodeDecodeFile {
    public static String encode(String path) {
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                try {
                    byte[] bytes = Files.readAllBytes(file.toPath());
                    return Base64.getEncoder().encodeToString(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static String byteArrayToString(byte[] byteArrayImage){
        return Base64.getEncoder().encodeToString(byteArrayImage);
    }

    public static byte[] decode(String encoded) {
        if (encoded != null) {
            return Base64.getDecoder().decode(encoded);
        }
        return null;
    }
//    public static void downloadFileAndSave(String encoded, FileType fileType) throws IOException {
//        String format = "";
//        switch (fileType) {
//            case MP4 -> format = ".mp4";
//            case JPG -> format = ".jpg";
//            case PDF -> format = ".pdf";
//            case MP3 -> format = ".mp3";
//            case NOTHING -> format = ".db";
//            default -> format = ".jar";
//        }
//        byte[] decoded = decode(encoded);
//        String path = "./src/main/resources/downloadedfiles/" + new Random().nextLong() + format ;
//        File file = new File(path);
//        file.createNewFile();
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        fileOutputStream.write(decoded);
//        fileOutputStream.close();
//        fileOutputStream.flush();
//    }
//
//    public static FileType getFormat(String path) {
//        int index= 0;
//        for (int i = path.length() - 1; i >= 0; i--) {
//            if (path.charAt(i) == '.')break;
//            else index = i;
//        }
//        String format = path.substring(index, path.length());
//        if (format.equals("pdf"))return FileType.PDF;
//        else if (format.equals("jpg"))return FileType.JPG;
//        else if (format.equals("mp3"))return FileType.MP3;
//        else return FileType.MP4;
//    }
}
