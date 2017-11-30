public static List<apple> filterApples(List<Apple> invertory, ApplePredicate p){
	List<Apple> result = new ArrayList<>();
	for(Apple apple: invertory){
		if(p.test(apple)){
			result.add(apple);
		}
	}
	return result;
}

public interface ApplePredicate{
	boolean test(Apple apple);
}

public class AppleGreenColorPredicate implements ApplePredicate{
	public boolean test(Apple apple){
		return "green".equals(apple.getColor());
	}
}

List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());





