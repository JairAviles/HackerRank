import java.lang.Exception;

public class myCalculator {

	public int power(int n, int p) throws Exception {
		int pow = 1;
		if(Integer.signum(n) < 0 || Integer.signum(p) < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			for(int i = 0; i < p; i++) {
				pow *=n;
			}
		}
		return pow;
	}

}
