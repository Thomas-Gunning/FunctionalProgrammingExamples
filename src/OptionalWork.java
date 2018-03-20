import java.util.Optional;

public class OptionalWork{
    Integer i = 5;
    Optional<Integer> optionalI = Optional.of(i);

    public void playingWithOptionals(){
        String s = "Hello world";
        String nullString = null;
        Optional<String> optionalS1 = Optional.of(s); //will work
        Optional<String> optionalS2 = Optional.ofNullable(s); //will work too
        Optional<String> optionalNull1 = Optional.of(nullString); // NullPointerException
        Optional<String>  optionalNull2 = Optional.ofNullable((nullString)); //will work

        System.out.println(optionalS1.get());//Hello world
        System.out.println(optionalNull2.get()); // NosuchelementException
        if(!optionalNull2.isPresent()){
            System.out.println("Is Empty"); //will be printed
        }
    }

    public Integer doubleValueOrZero(Optional<Integer> value){
        /*if(value.isPresent()){
            return value.get() * 2;
        }
        return 0;*/
        return value.map(i -> i*2).orElse(0);
    }

    public void showFlatMap(){
        Optional<Double> two = Optional.of(2.0);
        Optional<Double> zero = Optional.of(0.0);
        two.flatMap(num -> divide(1.0, num)).orElse(0.0);
        zero.flatMap(num -> divide(1.0, num)).orElse(0.0);
    }

    private Optional<Double> divide(Double first, Double second) {
        if(second == 0){
            return Optional.empty();
        }
        return Optional.of(first/second);
    }


}
