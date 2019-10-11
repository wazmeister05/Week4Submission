package Week1;

public class Birthday {

        public void run(int sampleSize) {

            //The sum for this is -----   365! / ((365-n)! * 365^n).
            //trying the below however, just produces NaN because the numbers are just too ridiculous.
            //System.out.println(factorial(365) / (factorial(365-i) * Math.pow(365,sampleSize)));

            //another sum for this is --------   1-(364/365)*(363/365)...((365-n)/365).
            //according to https://www.dcode.fr/birthday-problem
            //this led me to the following, stupidly short solution, compared to how I felt when I first read the problem.

            double test = 1;
            for (int i = 0; i < sampleSize; i++) {
                test = test * (365 - i) / 365;
            }
            test = (1 - test) * 100;
            System.out.println("\nBased on a sample size of " + sampleSize);
            System.out.printf("%.2f", test);
            System.out.println("% chance of sharing a birthday");

        }


            //program I made to calculate a factorial. It didn't turn out to be useful
            // but I'm leaving it here because I'm proud of it.
            //n x n-1 x n-2 etc
            //sadly, to use it to find the birthday paradox, double is too small.
            public double factorial(double max){
                double maximum = max;
                for(int i = 1; i < max; i++){
                   maximum = maximum * (max - i);
                }
                return maximum;
            }
}