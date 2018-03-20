import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample{
    public void convertObjects(){
        Stream<String> objectStream = Stream.of("Hello", "World");

    }
    public void convertStuff(){
        String[] array = {"Apple", "Banana"};
        Set<String> emptySet = new HashSet<>();
        List<Integer> emptyList = new LinkedList<>();
        Stream<String> arrayStream = Arrays.stream(array);
        Stream<String> setStream = emptySet.stream();
        Stream<Integer> listStream = emptyList.stream();

    }

    public void showMap(){
        Stream.of(1,2,3).map(num -> num * num).forEach(System.out::println);

    }
    public void showFlatMapLists(){
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(4,5,6);
        Stream.of(numbers1, numbers2).flatMap(List::stream).forEach(System.out::println);
    }

    public void showFilter(){
        Stream.of(0,1,2,3).filter(num -> num < 2).forEach(System.out::println);

    }
    public void negateFilter(){
        Predicate<Integer> small = num -> num < 2;
        Stream.of(0,1,2,3).filter(small.negate()).forEach(System.out::println);
    }

    public void filterNull(){
        Stream.of(0,1,null,3).filter(Objects::nonNull).map(num -> num * 2).forEach(System.out::println);
    }

    public void showCollect(){
        List<Integer> filtered = Stream.of(0,1,2,3).filter(num -> num < 2).collect(Collectors.toList());
    }
    public void showJoining(){
        String sentence = Stream.of("who", "are", "you").collect(Collectors.joining(" "));
        System.out.println(sentence);
    }

    public void showReduceSum(){
        Integer sum = Stream.of(1,2,3).reduce(0, Integer::sum);
        System.out.println(sum); //6 1+2+3+0
    }
    public void showSort(){
        Stream.of(3,2,4,0).sorted((c1,c2) -> c1 - c2).forEach(System.out::println);
    }
    public void sumWithIntStream(){
        Integer sum = Stream.of(0,1,2,3).mapToInt(num -> num).sum();
    }

}
