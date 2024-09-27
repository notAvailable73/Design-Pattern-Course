using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string inputFilePath = @"C:\Users\CSE\source\repos\ConsoleApp1\plainTextFile.txt";
            string outputFilePath = @"C:\Users\CSE\source\repos\ConsoleApp1\decryptedTextFile.txt";

            Console.WriteLine("You want to - \n1. Encrypt\n2. Decrypt\nSubmit your response: ");
            int input = int.Parse(Console.ReadLine());
            switch (input)
            {
                case 1:
                    IencryptionAlgorithm encryptionAlgorithm;
                    EncryptionManager enManager = null;
                    Console.WriteLine("Choose the algorithm for encryption:\n1. AES\n2. DES\n3. Ceaser Cipher\nSubmit your response: ");
                    int AlgorithmInput = int.Parse(Console.ReadLine());
                    switch (AlgorithmInput)
                    {
                        case 1:
                            encryptionAlgorithm = new AES_Algorithm();
                            enManager = new EncryptionManager(encryptionAlgorithm);
                            break;
                        case 2:
                            encryptionAlgorithm = new DES_Algorithm();
                            enManager = new EncryptionManager(encryptionAlgorithm);

                            break;
                        case 3:
                            encryptionAlgorithm = new CaesarCipherAlgorithm();
                            enManager = new EncryptionManager(encryptionAlgorithm);

                            break;
                        default:
                            break;
                    }

                    enManager.encryptFile(inputFilePath, outputFilePath);

                    break;
                case 2:
                    IencryptionAlgorithm decryptionAlgorithm;
                    EncryptionManager denManager = null;
                    Console.WriteLine("Choose the algorithm for encryption:\n1. AES\n2. DES\n3. Ceaser Cipher\nSubmit your response: ");
                    int dAlgorithmInput = int.Parse(Console.ReadLine());
                    switch (dAlgorithmInput)
                    {
                        case 1:
                            decryptionAlgorithm = new AES_Algorithm();
                            denManager = new EncryptionManager(decryptionAlgorithm);
                            break;
                        case 2:
                            decryptionAlgorithm = new DES_Algorithm();
                            denManager = new EncryptionManager(decryptionAlgorithm);

                            break;
                        case 3:
                            decryptionAlgorithm = new CaesarCipherAlgorithm();
                            denManager = new EncryptionManager(decryptionAlgorithm);

                            break;
                        default:
                            break;
                    }
                    Console.WriteLine(denManager.decryptFile(outputFilePath));
                    break;
                default:
                    break;
            }

            //CaesarCipherAlgorithm c = new CaesarCipherAlgorithm();
            //Console.WriteLine(c.encrypt("abcd"));

        }
         
    }
}
