package java_essentials.Java17.FirstLook.sealedClassAndSealedInterfaceExample;
public sealed interface Consumable permits Beverage {

    public void consume();
}
