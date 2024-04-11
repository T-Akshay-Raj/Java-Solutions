## Stream API
A Sequence of elements supporting sequential and parallel aggregate operations.
It Enable Functional Programming in java
In addition to stream which deals with stream of object references, there is support for primitve using IntStream, LongStream, Double Stream
A Stream pipeline consists of a 
1. **Source** (array or Collection or a generator function, and IO Channel)
2. **Intermediate Operation**: Zero or more intermediate operation(which transofrm a stream into another stream, such as filter(predicate)
3. **Terminal Operation**: Which produces result or side effect (eg. count(), collect(), forEach(Consumer)
Once a terminal operation is performed, the stream gets closed. You cannot use streams once terminated, create new stream instead if needed.
Lazy Streams: Without the terminal operation, the stream is lazy and the intermediate operations are not executed.

eg: Using streams on widget collection(Collection<Widgets>) to get sum of widgets of color red
``` java
int sum=widgets.stream().filter(w->w.getColor()==RED).mapToInt(w->w.getWeigth()).sum();
``` 
### Stream Creation:
#### Finite Stream:
- **From Array**: Using Arrays.stream(inputArray) or Using Stream.of(elements)
- **From Collection**: using CollectionName.Stream()
- **From Primitives**: Using IntStream.of(), DoubleStream.of() or LongStream.of()
- **Builder**: Using Stream.builder().add()...add().build();

#### Infinite Stream: Always use limit(number) as they provide infinite stream
- **Using generate**: Stream.generate(Supplier).limit(limitNumber)
- **Using Iterable**: Using Stream.iterate(Function).limit(limitNumber)

### Intermediate Operations:
- **filter** Stream<T> filter(Predicate<? super T> predicate)
- **map** Stream<T> map(Function<? super T> mapper)
- **flatMap** <R> Stream<R> flatMap<Function <? super T,? extends Stream<? extends R>> mapper)
- **peek** Stream<T> peek(Consumer<? super T> action)
- **limit** Stream<T> limit(long maxSize)
- **skip** Stream<T> skip(long n)
- **distinct** Stream<T> distinct()
- **sorted** Stream<T> sorted() or Stream<T> sorted<Comapator<? super T> comparator)

### Terminal Operations:
- **forEach** : void forEach(Consumer<?super T> action)
- **min** : Optional<T> min(Comparator<?super t>comparator)
- **max** : Optional<T> max(Comparator<?super t>comparator)
- **count** long count()
- **allMatch** boolean allMatch(Prdicate<? super T> predicate)
- **anyMatch** boolean anyMatch(Prdicate<? super T> predicate)
- **noneMatch** boolean noneMatch(Prdicate<? super T> predicate)
- **collect** <R,A> R collect(Collector<? super T,A,R> collector)
- **reduce** Optional<T> reduce(BinaryOperator<T> accumulator)


### Parallel Stream: Use Fork Join Framework
#### Ways to create parallel streams
- Use .parallelStream() instead of .stream()
- Use .parallel() method on stream

#### Parallel stream may or maynot be faster than sequential due to the activities like
- Split up
- Merged
- Memory managed

#### When to use
- Order execution is not needed
- Large dataset
