import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class NumberStats<T extends Number> {
    public static <T extends Number> OptionalDouble calculateAverage(List<T> numbers) {
        return numbers.stream().mapToDouble(Number::doubleValue).average();
    }

    public static <T extends Comparable<T>> Optional<T> findMax(List<T> numbers) {
        return numbers.stream().max(Comparator.naturalOrder());
    }
}
