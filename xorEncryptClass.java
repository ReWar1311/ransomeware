import java.io.*;
import java.nio.file.Files;

public class xorEncryptClass {
    public static byte[] xorEncrypt(byte[] input, byte key) {
        byte[] output = new byte[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = (byte) (input[i] ^ key);
        }
        return output;
    }
    public static void encryptFile(String inputFile, String key) {
        try {
            byte[] inputData = Files.readAllBytes(new File(inputFile).toPath());
            byte[] encryptedData = inputData;
            for(int i=0; i<key.length(); i++) {
                encryptedData = xorEncrypt(encryptedData, (byte) key.charAt(i));
            }
            System.out.println("Encryption done! "+inputFile);
            try{
            Files.write(new File(inputFile + ".rewar").toPath(), encryptedData);
            Files.delete(new File(inputFile).toPath());
            }catch(Exception e){
                System.out.println("Error in write/delete while encrypting file: "+e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decryptFile(String inputFile, String key) {
        if(!inputFile.endsWith(".rewar")) {
            System.out.println("Invalid file format!");
            return;
        }
        try {
            byte[] inputData = Files.readAllBytes(new File(inputFile).toPath());
            byte[] decryptedData = inputData;
            for(int i=key.length()-1; i>=0; i--) {
            decryptedData = xorEncrypt(decryptedData, (byte) key.charAt(i));
            }
            System.out.println("Decryption done!");
            String outputFile = inputFile.substring(0, inputFile.length() - 6);
            try{
            Files.write(new File(outputFile).toPath(), decryptedData);
            Files.delete(new File(inputFile).toPath());
            }catch(Exception e){
                System.out.println("Error in write/delete while decrypting file: "+e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
