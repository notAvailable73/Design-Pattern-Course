using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RideSharingConsoleApp___Design_Patterns_Lab_01
{
    public class Driver : user
    {
        public bool availability;

        public Driver(string name, string id, string location) : base(name, id, location)
        {
            
        }
    }
}
