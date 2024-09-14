using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RideSharingConsoleApp___Design_Patterns_Lab_01
{
    public class user
    {
        public string Name { get; set; }
        public string id { get; set; }
        public string location { get; set; }
        public float rating { get; set; }
        
        public user(string name, string id, string location)
        {
            this.Name = name;
            this.id = id;
            this.location = location;
        }

    }
}
