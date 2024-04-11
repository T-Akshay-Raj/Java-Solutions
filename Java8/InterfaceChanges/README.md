### Static methods
- An Interface can contain static methods since java8
- These methods contains body
- Can ony be called on the interface (eg: InterfaceName.staticMethodName())
- Cannot be overridden or hidden in implementing class as this only belong to interface

### Default method:
- Allows non static methods to contain body
- An Interface can contain default methods since java 8
- These methods contains body
- Interface doesnt enforce implementing class to override thedefault methods
- Default methods are available to access for class and can be overridden

### Functional Interface:
- Interface with only abstract method
- May contain static and default methods
- Can contain abstract methods that match th method signature in Object
- Annotating with @FunctionalInterface is Optional but when an interface annotated with it cannot have more than 1 abstarct message.
- Used along with lambda
