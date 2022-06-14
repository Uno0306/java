package step04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import model.domain.Person;

public class OptionalStreamTest {

	public static void main(String[] args) {
		// Optional
		// empty : 빈 Optional 객체 생성
		Optional<String> opt1 = Optional.empty();
//		System.out.println(opt1);

		// of(value) : null이 아닌 데이터 생성(null 저장시 NPE)
		Optional<String> opt2 = Optional.of("Java");
//		System.out.println(opt2);
//		System.out.println(opt2.get());

//		Optional<String> opt3 = Optional.of(null); // 예외 발생
//		System.out.println(opt3);

		// ofNullable : 값이 Null일수도, 아닐수도 있는 경우
//		Optional<String> opt4 = Optional.ofNullable("Java");
//		System.out.println(opt4);
//		
//		Optional<String> opt5 = Optional.ofNullable(null);
//		System.out.println(opt5);

		// ifPresent
//		Optional<String> opt6 = Optional.ofNullable("Java");
//		opt6.ifPresent(v -> System.out.println(v.charAt(0)));
//		
//		Optional<String> opt7 = Optional.ofNullable(null);
//		opt7.ifPresent(v -> System.out.println(v));

		// orElse : 파라미터로 값을 받음
		// orElseGet : 파라미터로 함수형 인터페이스를 받음
//		Optional<String> opt8 = Optional.ofNullable("Java");
//		System.out.println(opt8.orElse("orElse 실행"));
//		
//		Optional<String> opt9 = Optional.ofNullable(null);
//		System.out.println(opt9.orElse("orElse 실행"));

		// orElseThrow
//		Optional<String> opt10 = Optional.ofNullable(null);
//		System.out.println(opt10.orElseThrow(IllegalArgumentException::new));

		// Stream
		// step01 Stream 생성
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(arr1);

		Stream<Integer> stream1 = arr1.stream();
		System.out.println(stream1);
		stream1.forEach(num -> System.out.println(num));

		// step02 중개 연산
		// Filter : Stream 내 요소 중 조건에 맞는 것을 선택
		List<String> arr2 = Arrays.asList("apple", "banana", "melon");
		arr2.stream().filter(v -> v.contains("a"));

		// Map : Stream 내 요소가 특정 로직을 수행 후 새로운 Stream 반환
		List<Integer> arr3 = Arrays.asList(1, 2, 3);
		arr3.stream().map(v -> v + 1);

		// Sorted : 정렬 / 역순 정렬 (기본적으로는 오름차순)
		arr3.stream().sorted();
		arr3.stream().sorted(Comparator.reverseOrder());

		// step03 최종 연산
		// count, min, max, sum
		// foreach
		// collect

		List<Integer> arr4 = Arrays.asList(1, 2, 3, 3, 3, 4, 5, 5);
		System.out.println(arr4);
		arr4.stream().collect(Collectors.toSet()).forEach(v -> System.out.println(v));

		// reduce
		System.out.println(arr4.stream().reduce((v1, v2) -> v1 + v2)); // Optional[26] : 내부적으로 null 들어갈 수 있다고 판단.
		System.out.println(arr4.stream().reduce(0, (v1, v2) -> v1 + v2)); // 26 : 초기값 0 이 존재. null 안들어간다 판단.

		System.out.println("--");
		// ex. sorted
		Arrays.asList("A", "AB", "O", "B").stream().sorted().forEach(System.out::println);

		// sum
		System.out.println(IntStream.of(1, 5, 8, 3, 6).sum());

		// 문제! I이고 J인 사람들만 출력하시오! (and)
		Person donghyun = new Person("donghyun", "intp");
		Person yeyeong = new Person("yeyeong", "isfj");
		Person doheon = new Person("doheon", "isfj");
		Person minkyu = new Person("minkyu", "enfp");
		Person yongju = new Person("yongju", "estj");
		Person yunho = new Person("yunho", "enfp");
		Person jeongin = new Person("jeongin", "infp");
		Person hanju = new Person("hanju", "isfp");
		Person seongjun = new Person("seongjun", "isfp");
		Person uijin = new Person("uijin", "isfp");
		Person jongheon = new Person("jongheon", "isfj");
		Person hyunchae = new Person("hyunchae", "infj");
		Person yeongkwang = new Person("yeongkwang", "isfp");
		Person yeonghun = new Person("yeonghun", "esfj");
		Person myungyun = new Person("myungyun", "enfj");

		List<Person> personList = new ArrayList<Person>();
		personList.add(donghyun);
		personList.add(yeyeong);
		personList.add(doheon);
		personList.add(minkyu);
		personList.add(yongju);
		personList.add(yunho);
		personList.add(jeongin);
		personList.add(hanju);
		personList.add(seongjun);
		personList.add(uijin);
		personList.add(jongheon);
		personList.add(hyunchae);
		personList.add(yeongkwang);
		personList.add(yeonghun);
		personList.add(myungyun);

		System.out.println(personList);

		Stream<Person> streamMbti = personList.stream();
		System.out.println(streamMbti);

		streamMbti.forEach(person -> System.out.println(person));

		System.out.println("---");
		personList.stream().filter(p -> (p.getMbti().contains("i") && p.getMbti().contains("j")))
				.forEach(System.out::println);
		System.out.println("---");

	}

}
