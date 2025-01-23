package com.StreamAPI.Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_API {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,6,8,10);
        list.forEach(n -> System.out.println(n));

        ////////////////////////////////////

        // Stream use only 1
        List<Integer> list = Arrays.asList(2,4,6,8,10);
        Stream<Integer> data = list.stream();
        data.forEach(n -> System.out.println(n));

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10);
        Stream<Integer> data = list.stream();
        Long count = data.count();
        System.out.println(count);

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
        Stream<Integer> data = list.stream();
        Stream<Integer> sortedData = data.sorted();
        sortedData.forEach(n -> System.out.println(n));

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
           for (int n : list){
               System.out.println(n*2);
           }

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
        Stream<Integer> data = list.stream();
        Stream<Integer> mapData = data.map(n -> n*2);
        mapData.forEach(n -> System.out.println(n));

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
         list.stream().map(n -> n*2).forEach(n -> System.out.println(n));

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
        list.stream()
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
        list.stream()
                .filter(n -> n%2 == 1)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if(n%2==1)
                    return true;
                else
                return false;
            }
        };
        list.stream()
                .filter(predicate)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));
    }

    ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
        Predicate<Integer> predicate = n -> n%2 == 1;
        list.stream()
                .filter(predicate)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

        ////////////////////////////////////

        List<Integer> list = Arrays.asList(2,8,6,4,10,19,17);
        int result = list.stream()
                .filter(n -> n%2==1)
                .sorted()
                .map(n -> n*2)
                .reduce(0, (c, e) -> c+e);
        System.out.println(result);


        //////////////////////////////////////////

        Do Research
    Java Stream API
1/. Stream base on data type
      - Generic Stream (Used for processing objects)
      - Primitive Streams ( Primitive streams have specialized methods like sum(), average(), and min() to optimize     performance.)

            2/. Stream base on source
     - Collection Streams (collections like List, Set, or Map using the .stream() or .parallelStream() methods)
    List<String> list = Arrays.asList("a", "b", "c");
    Stream<String> stream = list.stream();
     - Array Streams (Created from arrays using Arrays.stream())
    String[] array = {"a", "b", "c"};
    Stream<String> stream = Arrays.stream(array);
     - File Streams (Created to process file content using classes like Files.lines() or BufferedReader.lines())
    Stream<String> lines = Files.lines(Paths.get("file.txt"));
     - Stream Builders (Created using Stream.builder() or Stream.of())
    Stream<String> stream = Stream.of("a", "b", "c");
     - Infinite Streams (Generated using Stream.generate() or Stream.iterate() for potentially unbounded data)
    Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
3/. Streams Based on Processing Mode
     - Sequential Streams (Process elements in a sequential order, one by one)
    Created using .stream()
     - Parallel Streams (Process elements in parallel, utilizing multiple threads for faster execution)
    Created using .parallelStream() or converting a sequential stream using .parallel()

    Generic Stream: Stream<T>
    Primitive Streams: IntStream, LongStream, DoubleStream
    Source Streams: Collection, Array, File, Builder, Infinite Streams
    Processing Modes: Sequential, Parallel Streams










}



}
