using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class CaesarCipherAlgorithm: IencryptionAlgorithm
    {
        
        public string decrypt(string input)
        {
            int shift = 3;
            if (string.IsNullOrEmpty(input))
                return input;

            char[] buffer = input.ToCharArray();

            for (int i = 0; i < buffer.Length; i++)
            {
                char letter = buffer[i];

                if (char.IsLetter(letter))
                {
                    char offset = char.IsUpper(letter) ? 'A' : 'a';
                    letter = (char)(((letter - shift - offset + 26) % 26) + offset);
                }

                buffer[i] = letter;
            }

            return new string(buffer);
        }

        public string encrypt(string input)
        {
            int shift = 3;
            if (string.IsNullOrEmpty(input))
                return input;

            char[] buffer = input.ToCharArray();

            for (int i = 0; i < buffer.Length; i++)
            {
                char letter = buffer[i];

                // Check if the character is a letter
                if (char.IsLetter(letter))
                {
                    // Determine if the letter is uppercase or lowercase
                    char offset = char.IsUpper(letter) ? 'A' : 'a';

                    // Shift the letter and wrap around the alphabet
                    letter = (char)(((letter + shift - offset) % 26) + offset);
                }

                buffer[i] = letter;
            }

            return new string(buffer);
        }
    }
}
