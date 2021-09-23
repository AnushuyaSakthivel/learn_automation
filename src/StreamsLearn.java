import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


public class StreamsLearn {

    public static void main (String [] args){
        List<String> sample = Arrays.asList("Sakthivel","Jothi","goki","anu","swathi");
        sample.stream().filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

    }
}
