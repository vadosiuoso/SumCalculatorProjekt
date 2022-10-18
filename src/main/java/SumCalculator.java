import org.junit.jupiter.api.function.Executable;

public class SumCalculator {
    private int sum = 0;

    public int sum(int n) {
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

}
