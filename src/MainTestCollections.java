import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainTestCollections {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		List <Integer> numbers = Arrays.asList(4,53,3);
		strings.add("Ветвление");
		strings.add("Циклы");
		strings.add("Хобби");
		strings.add("Строки");
		strings.remove("Ветвление");
		strings.add(2, "Массивы");
		int size = strings.size();
		System.out.println(strings);
		System.out.println(size);
		Collections.sort(strings);
		System.out.println(strings);
		
		LinkedList <String> linkedStrings = new LinkedList<>();
		linkedStrings.addFirst("Антон");
		linkedStrings.addFirst("Андрей");
		linkedStrings.addLast("Дима");
		linkedStrings.addLast("Олег");
		List <String> linkedStrings1 = Arrays.asList("Екатерина", "Лариса","Елена");
		linkedStrings.addAll(linkedStrings1);
		System.out.println(linkedStrings);
		linkedStrings.add(4, "Вова");
		System.out.println(linkedStrings);
		int numberLinked = linkedStrings.indexOf("Лариса");
		System.out.println(numberLinked);
		System.out.println("Пробую отправить в GitHub2");
		
	}

}
