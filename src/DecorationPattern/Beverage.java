package DecorationPattern;

public abstract class Beverage {

    String description = "NoName";
//
//    public virtual string getDescription() {
//        return description;
//    }
//
    public abstract double Cost();
	
}



/*


using System;
using System.Net;
using System.Windows;
using System.Windows.Controls;    
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;

namespace DecorationPatternExercise
{
    public abstract class Beverage
    {

        string description = "NoName";

        public string des
        {
            get { return description; }
            set { description = value; }
        }

        public virtual string getDescription()
        {
            return description;
        }

        public abstract double Cost();

    }

    public abstract class condimentDecorator : Beverage
    {


        public override double Cost()
        {
            throw new NotImplementedException();
        }
    }

    public class Espresso : Beverage
    {
        public Espresso()
        {
            des = "에소프레소";
        }

        public override double Cost()
        {
            return 1.99;
        }
    }

    public class HouseBlend : Beverage
    {
        public HouseBlend()
        {
            des = "하우스블렌드";
        }

        public override double Cost()
        {
            return 0.89;
        }
    }

    public class Mocha : condimentDecorator
    {
        Beverage beverage;
        public Mocha(Beverage bev)
        {
            this.beverage = bev;
        }

        public override string getDescription()
        {
            return beverage.getDescription() + "모카";
        }
        public override double Cost()
        {
            return 0.20 + beverage.Cost();
        }

    }
}

/////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;

namespace DecorationPatternExercise
{
    public partial class MainPage : UserControl
    {
        public MainPage()
        {
            InitializeComponent();

            Beverage bev = new Espresso();
            MessageBox.Show(bev.getDescription());

            Beverage bev2 = new Espresso();
            bev2 = new Mocha(bev2);
            MessageBox.Show(bev2.getDescription());
            MessageBox.Show(bev2.Cost().ToString());
        }
    }
}

*/