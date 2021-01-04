package simplest.possible.implementation;

import java.util.List;

public class PrimeFactors {
    public List  factors;
    public <T> List<T> of(int i) {
        if(i==1){
            return factors;
        }
        else
        {
            factors.add(2);
            return factors;
        }



    }
}
