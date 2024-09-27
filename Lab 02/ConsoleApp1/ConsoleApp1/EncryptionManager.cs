using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class EncryptionManager
    {
        IencryptionAlgorithm encryptor;

        public EncryptionManager(IencryptionAlgorithm encryptor)
        {
            this.encryptor = encryptor;
        }

        private string encrypt(string plaintext) { 
            return encryptor.encrypt(plaintext);
        }

        private string decrypt(string ciphertext)
        {
            return encryptor.decrypt(ciphertext);
        }

        public void encryptFile(string filePath, string outputPath)
        {
            try
            { 
                string content = File.ReadAllText(filePath);
                string encryptedContent = encrypt(content);
                WriteStringToFile(encryptedContent, outputPath);

            }
            catch (Exception ex)
            {
                Console.WriteLine($"An error occurred: {ex.Message}"); 
            }
        }
        public string decryptFile(string filePath) {
            try
            {
                string decryptedContent = File.ReadAllText(filePath);
                return decrypt(decryptedContent);

            }
            catch (Exception ex)
            {
                Console.WriteLine($"An error occurred: {ex.Message}");
                return "Decryption Unsuccessful";
            }
        }
        public void WriteStringToFile(string content, string outputPath)
        {
            try
            { 
                File.WriteAllText(outputPath, content);
                Console.WriteLine($"Content successfully written to: {outputPath}");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"An error occurred while writing to the file: {ex.Message}");
            }
        }
    }
}
