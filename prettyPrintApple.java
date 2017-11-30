public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
	for(Apple apple: inventory){
		String output == AppleFormatter.accept(apple);
		System.out.println(output);
	}
}

public interface AppleFormatter{
	String accept(Apple apple);
}


public class AppleSimpleFormatter implements AppleFormatter{
	public String accept(Apple apple){
		return "An apple of " + apple.getWeight() + "g";
	}
}

public class AppleFancyFormatter implements AppleFormatter{
	public String accept(Apple apple){
		String characteristic = apple.getWeight() > 150 ? "heave" : "light";
		return "A " +  characteristic + " " + apple.getColor() + " apple";
	}
}

prettyPrintApple(inventory, new AppleFancyFormatter());
prettyPrintApple(inventory, new AppleSimpleFormatter());
