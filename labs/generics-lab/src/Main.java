import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println(pair);

        // Task 2
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        System.out.println(NumberStats.calculateAverage(numbers)); // Output: 25.0
        System.out.println(NumberStats.findMax(numbers));          // Output: 40

        // Task 3
        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);

        printList(words);   // Output: Hello World
        printList(numbers1); // Output: 1 2 3

        // Task 4
        ProductRepository<ProductRepository.Product> repository = new ProductRepository<>();
        repository.addProduct(new ProductRepository.Product(1, "Laptop"));
        repository.addProduct(new ProductRepository.Product(2, "Phone"));

        System.out.println(repository.getAllProducts());
        // Output: [Product{id=1, name='Laptop'}, Product{id=2, name='Phone'}]

        // Task 5
        StringSorter sorter = new StringSorter();
        List<String> items = Arrays.asList("Banana", "Apple", "Cherry");
        sorter.sort(items);
        System.out.println(items); // Output: [Apple, Banana, Cherry]
    }

    private static void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}
