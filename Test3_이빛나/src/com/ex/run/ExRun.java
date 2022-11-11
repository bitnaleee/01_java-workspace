package com.ex.run;

import com.ex.view.ExMenu;

public class ExRun {

	public static void main(String[] args) {
		
		ExMenu view = new ExMenu();
		view.mainMenu();

	}
	
	
	  /*
	  - 포트폴리오 : 우선 ExMenu, ExController 클래스 안의 문제 확인 후 프로젝트 완성시키기 => 해당 프로젝트를 압축하여 제출하시오
	  
	  - 구두발표 : 아래 내용에 대한 답변 어딘가에 써두기 
	  	 1) 컬렉션이란 뭔지 설명하시오.
	  		자바에서 컬렉션 프레임워크(collection framework)란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미한다.
			배열의 단점을 보완하여 저장하는 크기의 제약이 없고, 추가, 삭제, 정렬 등의 기능처리가 간단하다. 또한 여러 타입의 데이터가 저장 가능하다.

			이러한 컬렉션 프레임워크는 자바의 인터페이스(interface)를 사용하여 구현된다.
			컬렉션 데이터 그룹을 크게 3가지 타입이 존재한다고 인식하고 각 컬렉션을 다루는 필요한 기능을 가진 3개의 인터페이스를 정의하고 있다. 

			1. List 인터페이스 : 순서O, 데이터 중복O
			(구현클래스 : Vector, ArrayList, LinkedList, Stack, Queue 등)
			2. Set 인터페이스 : 순서X, 데이터 중복X
			(구현클래스 : HashSet, TreeSet 등)
			3. Map 인터페이스 : 키(어떤 값의 열쇠같은 의미)와 값이 한 쌍으로 이루어짐, 순서X, 키 중복O 값 중복X
			(구현클래스 : HashMap, TreeMap, Hashtable, Properties 등)

			여기서 List와 Set 인터페이스는 모두 Collection 인터페이스를 상속받지만, 구조상의 차이로 Map 인터페이스는 별도로 정의된다
			(List와 Set인터페이스의 공통된 부분을 Collection 인터페이스에서 정의)
			컬렉션 프레임워크의 모든 컬렉션 클래스들은 List, Set, Map중의 하나를 구현하며, 구현한 인터페이스의 이름이 클래스의 이름에 포함되어있어서
			이름만으로도 클래스의 특징을 쉽게 알 수 있다.
			
	     2) 포트폴리오에서 사용한 컬렉션인 ArrayList에 대해 설명하시오. 그리고 ArrayList에서 제공하는 주된 메소드 3개이상을 설명하시오.
	    	ArrayList는 컬렉션 프레임워크에서 가장 많이 사용되는 컬렉션 클래스이다
			List 인터페이스를 구현하기 때문에 데이터의 저장순서가 유지되고 중복을 허용한다는 특징이 있다
			ArrayList는 Object배열을 이용해서 데이터를 순차적으로 저장한다
			첫 번째 저장한 객체는 Object배열의 0번째 위치에 저장되고 그다음은 1번째 이런식으로 순서대로 저장되며, 
			배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성해서 기존의 배열에 저장된 내용을 새로운 배열로 복사한 다음 저장한다
			
			주된 메소드 3가지
			boolean. add(Object o) : ArrayList의 마지막에 객체를 추가. 성공하면 true
			void clear() : ArrayList를 완전히 비운다
			boolean contains(Object o) : 지정된 객체(o)가 ArrayList에 포함되어 있는지 확인
			boolean isEmpty() : ArrayList가 비어있는지 확인
			int.size() : ArrayList에 저장된 객체의 개수를 반환
			boolean remove(Object o) : 지정한 객체를 제거(성공하면 true, 실패하면 false) 
			
	     3) 그 외에 어떤 컬렉션 종류가 있는지, 이때 각 컬렉션의 특징에 대해서도 설명하시오.
	    	Set인터페이스는 중복을 허용하지 않고 저장순서가 유지되지 않는 컬렉션 클래스를 구현하는데 사용된다 HashSet, TreeSet등이 있다
			Map인터페이스는 키(key)와 값(value)을 하나의 쌍으로 묶어서 저장하는 컬렉션클래스를 구현하는데 사용된다 키는 중복될 수 없지만 값은 중복을 허용
			기존의 저장된 데이터와 중복된 키와 값을 저장하면 기존의 값은 없어지고 마지막에 저장된 값이 남게 된다 Hashtable, HashMap, LinkedHashMap,TreeMap 등이 있다
			Enumeration, Iterator,ListIterator 은 모두 컬렉션에 저장된 요소에 접근하는데 사용되는 인터페이스이다. 
	    	
	     4) 제네릭을 작성하는 이유에 대해 설명하시오.
	    	제네릭(Generics)은 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능이다
			객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안정성을 높이고 형변환의 번거로움이 준다 
			즉, 다룰 객체의 타입을 미리 명시해줌으로써 번거로운 형변환도 줄고 코드도 간결해진다
	    
	     5) String 타입을 int 타입으로 바꾸고자 할 때 어떤 방법을 이용해야되는지 설명하시오. 
	    	parseInt()와 valueOf()메소드를 사용할 수 있다.
			둘 다 java.lang.Integer 클래스의 static 메소드이고, 파라미터로 숫자로 변환할 문자열을 입력받는다
			둘의 차이점은 parseInt()메소드는 기본데이터 타입인 int를 리턴, 
			valueOf() 메소드는 문자열을 변환하여 Integer Object를 리턴한다는 것이다
	 */

}
