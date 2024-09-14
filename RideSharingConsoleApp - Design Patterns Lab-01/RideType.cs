using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RideSharingConsoleApp___Design_Patterns_Lab_01
{
    public abstract class RideType
    {
        public int capacity;
        public List<Driver> drivers;
        public abstract decimal calculateFare(int distance);
    }


    public class Carpool : RideType
    {
        public Carpool() {
            capacity = 3;
        }
        public override decimal calculateFare(int distance)
        {
            return 10*distance;
        }
    }

    public class LuxaryRide : RideType
    {
        public LuxaryRide()
        {
            capacity = 5;
        }
        public override decimal calculateFare(int distance)
        {
            return 20 * distance;
        }
    }

    public class Bike : RideType
    {
        public Bike()
        {
            capacity = 1;
        }
        public override decimal calculateFare(int distance)
        {
            return 5 * distance;
        }
    }
}   


