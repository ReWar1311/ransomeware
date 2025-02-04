# !!WARNING!!
- Do not run the code if you dont know what it is! You can [Click here](https://www.trellix.com/security-awareness/ransomware/what-is-ransomware/) to know what is a Ransomware.
- This Code is for Educational and Learning purposes only. You can [Mail me](mailto:prashantrewar1311@gmail.com) anytime for any issue/help.

---
## Testing:
- Download the **encrypt(c_test).exe** and **decrypt(c_test).exe**
- Add some files to test in a folder named test in C Drive i.e: `C:\test`
- Run **encrypt(c_test).exe** to encrypt all files in test folder and all its descendants
- Run **decrypt(c_test).exe** to decrypt all encrypted files in test folder and all its descendants

---
## How to edit the code

- Clone the repository or download the code files.
- Modifications in main method of `ransom.java`:
    1. Set the string "path" to your path of folder in which you want to encrypt/decrypt all files, Example: 
    ```
    String path = "C:\\Users\\prash\\AppData\\Local\\test";
    ```
    2. Set the string "path" to any value and keep it secure for decryption purposes, Example:
    ```bash
    String key = "bdjhcf3"
    ```
    3. Uncomment the EncryptAll function to encrypt all files inside folder and all its Descendants 
    ```
    EncryptAll(path,key); 
    ```
     (or)
    Uncomment the DecryptAll function to decrypt all files inside folder and all its Descendants 
    ```
    DecryptAll(path,key);
    ```
    4. Compile the program:
    ```PowerShell
    javac ransom.java
    ```
    5. Make an executable(.exe) file. I prefer making it via [GraalVM Native Image](https://www.graalvm.org). It makes a .exe file that can run on all windows platfarm even without Java installed.
    ```PowerShell
     native-image --no-fallback -cp . ransom
    ```

---
