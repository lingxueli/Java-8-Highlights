public static String processFile() throws IOException {
	try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
		return br.readLine();
	}
}


// behavior abstraction
public static String processFile(BufferedReaderProcessor p) throws IOException{
	try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
		return p.process(br);
	}
}
 
@FunctionalInterface
public interface BufferedReaderProcessor{
	String process(BufferedReader br) throws IOException;
}

// impletement behavior by lamda expression

String oneLine = processFile((BufferedReader br) -> br.readLine());
String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());


