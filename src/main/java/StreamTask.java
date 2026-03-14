import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        Stream<String> words = Stream.of("Java", "Stream", "API", "is", "cool");
        System.out.println(getStringFromStream(words));
    }
}