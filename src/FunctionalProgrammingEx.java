import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalProgrammingEx {

    //Some Functional Programming examples with Lambda Functions
    //T is the type of argument, R is the return type
    public static Integer compute(Function<Integer, Integer> function , Integer value){
        return function.apply(value);
    }

    private static Integer invert(Integer value){
        return -value;
    }

    public static Integer invertTheNumber(){
        Integer toInvert = 5;
        return compute((a) -> -a, toInvert);
    }


    public static Integer changeTheNumber(Function<Integer, Integer> func){
        Integer toChange = 5;
        return compute(func, toChange);
    }
    BiFunction<Integer,Integer,Integer> add = (a , b) -> a + b;


}

