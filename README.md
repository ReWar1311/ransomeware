# !!WARNING!!
Do not run the code if you dont know what it is!

---
## How to run the code

- Clone the repository or download the code files.
- Modifications in main method of `ransom.java`:
    1. Set the string "path" to your path of folder in which you want to encrypt/decrypt all files, Example: 
    ```bash String path = "C:\\Users\\prash\\AppData\\Local\\test"; ```
    2. Set the string "path" to any value and keep it secure for decryption purposes, Example:
    ```bash  String key = "bdjhcf3" ```
    3. Run the EncryptAll function to encrypt all files inside folder and all its Descendants ```bash         EncryptAll(path,key); ```
     (or)
    Run the DecryptAll function to decrypt all files inside folder and all its Descendants ```bash         DecryptAll(path,key); ```

---
