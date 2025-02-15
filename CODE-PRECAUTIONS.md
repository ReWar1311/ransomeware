# Precautions for Using xorEncryptClass

## 1. **Backup Important Files**
- Before encrypting any file, make sure to create a backup.
- If an error occurs during encryption or decryption, the original file might be lost.

## 2. **Use a Strong and Consistent Key**
- The encryption key must be the same for both encryption and decryption.
- Losing the key will make decryption impossible.
- Use a key with sufficient length and complexity for security.

## 3. **Do Not Encrypt System or Critical Files**
- Avoid encrypting system files, executables, or configuration files that are crucial for system functionality.
- Encrypting such files may cause system instability or loss of important data.

## 4. **Verify File Size Before Encrypting**
- Files larger than **1.1GB (1,100,000,000 bytes)** will not be encrypted to prevent excessive memory usage and potential crashes.
- Ensure the file is within the supported size limit.

## 5. **Ensure Sufficient Storage Space**
- Encryption and decryption create a new file before deleting the original.
- Ensure there is enough storage space to accommodate the new file before deletion.

## 6. **Original File is Only Deleted After Complete Encryption**
- The program reads the original file and applies encryption step-by-step.
- Only after successful encryption and saving of the new file, the original file is deleted.
- This prevents accidental data loss in case of unexpected errors or program interruptions.

## 7. **Be Cautious with the `.rewar` Extension**
- Encrypted files receive a `.rewar` extension.
- Make sure not to rename or delete this extension unless decrypting.

## 8. **Avoid Interrupting the Process**
- Do not close the program while it is encrypting or decrypting a file.
- Doing so might leave the file in an unusable state.

## 9. **Check File Existence Before Running**
- The program checks for the existence of the file before encryption and decryption.
- Ensure that the correct file path is used.

## 10. **Code Specialties and Precautions Taken**
- The program is designed with multiple safety mechanisms:
  - **Existence Check**: It ensures the file exists before performing any operation.
  - **File Size Restriction**: Files over 1.1GB are not processed to avoid excessive memory use.
  - **Non-Empty File Requirement**: The program ensures the file is not empty before encryption.
  - **Multi-Pass Encryption**: The encryption process applies XOR operations in multiple iterations using each character of the key.
  - **Sequential Decryption**: Decryption follows the reverse order of encryption steps to ensure accuracy.
  - **Controlled File Deletion**: The original file is **only deleted after complete encryption or decryption** to prevent accidental data loss.
  - **Error Handling**: Catches and handles exceptions related to file reading, writing, and deletion.
  - **Automatic Extension Management**: Encrypted files automatically receive a `.rewar` extension to distinguish them.

## 11. **Use on Trusted Systems Only**
- Running this program on untrusted systems might lead to security risks.
- Ensure the execution environment is secure to prevent unauthorized access.

## 12. **Be Mindful of File Permissions**
- Ensure that you have the necessary permissions to read, write, and delete files before using the program.
- Running as an administrator may be required in some cases.

## 13. **Legal and Ethical Use**
- This program should only be used for **personal or authorized** encryption needs.
- Misuse for unauthorized encryption or ransomware-like activities is strictly prohibited.

## 14. **Test with Sample Files First**
- Before encrypting important data, test the encryption and decryption process with a sample file to ensure everything works as expected.

By following these precautions, you can safely use the `xorEncryptClass` without risking data loss or corruption.


