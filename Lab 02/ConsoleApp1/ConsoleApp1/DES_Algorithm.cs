using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class DES_Algorithm : IencryptionAlgorithm
    {

        private readonly byte[] key;
        private readonly byte[] iv;

        // Default key value (must be 8 bytes for DES)
        private const string DefaultKey = "my8byte!";

        public DES_Algorithm()
        {
            key = Encoding.UTF8.GetBytes(DefaultKey);
            iv = new byte[8]; // DES block size is 8 bytes
            Array.Copy(key, iv, 8); // Using the key for IV (not recommended for production)
        }

        public string encrypt(string plainText)
        {
            using (var des = DES.Create())
            {
                des.Key = key;
                des.IV = iv;

                var encryptor = des.CreateEncryptor(des.Key, des.IV);
                using (var ms = new MemoryStream())
                {
                    using (var cs = new CryptoStream(ms, encryptor, CryptoStreamMode.Write))
                    {
                        using (var sw = new StreamWriter(cs))
                        {
                            sw.Write(plainText);
                        }
                    }
                    return Convert.ToBase64String(ms.ToArray());
                }
            }
        }

        public string decrypt(string encryptedText)
        {
            using (var des = DES.Create())
            {
                des.Key = key;
                des.IV = iv;

                var decryptor = des.CreateDecryptor(des.Key, des.IV);
                using (var ms = new MemoryStream(Convert.FromBase64String(encryptedText)))
                {
                    using (var cs = new CryptoStream(ms, decryptor, CryptoStreamMode.Read))
                    {
                        using (var sr = new StreamReader(cs))
                        {
                            return sr.ReadToEnd();
                        }
                    }
                }
            }
        }
    }
}
