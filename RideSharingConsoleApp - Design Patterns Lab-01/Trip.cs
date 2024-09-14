using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RideSharingConsoleApp___Design_Patterns_Lab_01
{
    public class Trip
    {
        public string id;
        public string dropOffLocation;
        public string pickUpLocation;
        public string status;
        public decimal distance;
        public RideType rideType;
    }
}
