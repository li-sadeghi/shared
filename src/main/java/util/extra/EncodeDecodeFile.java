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

    public static String getFormat(String path){
        int index = 0;
        for (int i = path.length() - 1; i >=0; i--) {
            if (path.charAt(i) == '.'){
                index = i + 1;
                break;
            }
        }
        return path.substring(index);
    }

    public static void downloadFileAndSave(String encoded, String fileType) throws IOException {
        byte[] decoded = decode(encoded);
        String path = "./src/main/resources/downloadedfiles/" + new Random().nextLong() + "." + fileType ;
        File file = new File(path);
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(decoded);
        fileOutputStream.close();
        fileOutputStream.flush();
    }
}
