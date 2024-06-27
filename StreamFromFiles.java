package Java8Features;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
// trying to read a file and convert it into stream and displaying on console
public class StreamFromFiles {
public static void main(String[] args) throws IOException {
	// taking file from local repository (system) and converting into streams
	Stream <String> para=Files.lines(Path.of("C:\\Users\\vishw\\OneDrive\\Documents\\pentagon2\\sample.txt"));
	para.forEach(System.out::println);
	// using bufferedReader method to read the file and converting to streams
	BufferedReader bread=Files.newBufferedReader(Paths.get("C:\\Users\\vishw\\OneDrive\\Documents\\pentagon2\\sample.txt"));
	Stream<String> lines=bread.lines();
	lines.forEach(System.out::println);
	// from list to stream 
	List<String> strList=Files.readAllLines(Path.of("C:\\Users\\vishw\\OneDrive\\Documents\\pentagon2\\sample.txt"));
	Stream<String> sentence =strList.stream();
	sentence.forEach(System.out::println);
}
}
