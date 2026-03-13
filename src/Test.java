import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {

        String s = "tree";

        String ans = s.chars().mapToObj( c -> (char) c ).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting() ))
                .entrySet().stream()
                .sorted((e1,e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .map(m -> m.getKey() +""+m.getValue())
                .collect(Collectors.joining());

        List<String> list = Arrays.asList("Apple", "banana", "Straberry");
        List<List<String>> list1 = new ArrayList<>();
        list1.add(Arrays.asList("Pineapple", "Watermellon", "Sapota"));
        list1.add(list);

        List<String> res = list1.stream().flatMap(Collection::stream).toList();

//        System.out.println(res);

        String s1 = "banana";

        String ans2 = IntStream.range(0, s1.length()).boxed()
                .flatMap(i -> IntStream.range(i+1, s1.length()+1).mapToObj( j -> s1.substring(i, j)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey).max(Comparator.comparingInt(String::length)).orElse("");

        System.out.println(ans2);

        Map<String , String> map = new HashMap<>();

        map.get("1");

        

    }

}
