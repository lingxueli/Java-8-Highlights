// Predicate
@FunctionalInterface
public interface Predicate{
	boolean test(T t);
}

public static List<T> filter(List<T> list, Predicate<T> p){
	List<T> results = new ArrayList<T>();
	for(T s : list){
		if(p.test(s)){
			result.add(s);
		}
	}
	return result;
}

// Consumer
@FunctionalInterface
public interface Consumer<T>{
	void accept(T t);
}

public static void forEach(List<T> list, Consumer<T> c){
	for(T i : list){
		c.accept(i);
	}
}

forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> System.out.println(i));


// Function
@FunctionalInterface
public interface Function<T,R>{
	R apply(T t);
}

public static List<R> map(List<T> list, Function<T,R> f){
	List<R> result = new ArrayList<>();

	for(T s : list){
		result.add(f.apply(s));
	}
	return result;
}

List<Integer> l = map(Arrays.asList("lamdas","in","action"),(String s) -> s.length());