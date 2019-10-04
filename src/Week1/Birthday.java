package Week1;

public class Birthday {

        public void run(int sampleSize){

            double notSameChance = 1.0;
            for (int i = 0; i < sampleSize; i++)
                notSameChance *= (365-i) / 365.0;
            System.out.println("\nBased on a sample size of "+sampleSize);
            System.out.printf("Not Same Birthday chance: %.0f%%\n",
                    (notSameChance * 100) );
            System.out.printf("Same Birthday chance: %.0f%%\n",
                    ((1 - notSameChance) * 100)  );
        }
}

/*
     364!/(342! * 365^22) = 0.492703 = 49.3% chance of not sharing a birthday
     1 - 0.493 * 100 = 50.7%   chance of sharing a birthday

     364!/(342! * 365^100) = 0.001 chance of not sharing a birthday
     1 - 0.001 * 100 = 99.9% chance of sharing a birthday
 */