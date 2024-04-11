package Java8.StreamsApi.TerminalOperations;
//custom collector
public class CustomCollectorExample {
  public static void main(String[] args) {

  }
  //define custom collector
  //collect(Collectors.toList()) is a predefined collector which collects the elements of the stream into a List.
  //We can define our own custom collector by implementing the Collector interface.
  //The Collector interface has four methods:
  //1. Supplier supplier(): It returns a function which creates a new mutable result container.
  //2. BiConsumer accumulator(): It returns a function which folds a value into a mutable result container.
  //3. BinaryOperator combiner(): It returns a function which accepts two partial results and merges them.
  //4. Function finisher(): It returns a function which transforms the mutable result container into the final result.
  //5. Set characteristics(): It returns an immutable set of characteristics of the collector.
  //The following example demonstrates how to define a custom collector to collect the elements of the stream into a List.
  //The custom collector is defined by implementing the Collector interface.
  //The custom collector has the following characteristics:
  //1. The supplier() method returns an ArrayList instance.
  //2. The accumulator() method adds the element to the ArrayList.
  //3. The combiner() method merges two ArrayLists.
  //4. The finisher() method returns the ArrayList.
  //5. The characteristics() method returns an immutable set of characteristics of the collector.
  //The collect() method is used to collect the elements of the stream into a List using the custom collector.
  //The collect() method takes the custom collector as an argument.
  //The collect() method is a terminal operation.
  //The collect() method is a predefined method in the Stream interface.
  //The collect() method is overloaded.
  //The collect() method is defined as follows:

}
