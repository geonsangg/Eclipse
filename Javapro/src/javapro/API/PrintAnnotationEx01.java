package javapro.API;

import java.lang.reflect.Method;

public class PrintAnnotationEx01 {

	public static void main(String[] args) throws Exception {
		Method[] dcMethod = Service.class.getDeclaredMethods(); //Service가 가지고 있는 클레스의 메서드 정보를 가져온다.
		for(Method method:dcMethod) {
			//System.out.println(method);
			PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class);
			//PrintAnnotation클래스에서 method의 정보를 가져와서 printAnno에 넣어준다.
			printLine(printAnno);
			//method = dcMethod를 향상된 포문으로 받는 객체.
			method.invoke(new Service()); //Service 클래스의 메서드 호출.
			printLine(printAnno);
		}

	} //main

	//출력메서드                                     ↓ = printLine메서드의 printAnno
	public static void printLine(PrintAnnotation printAnno) {
		int num = printAnno.number(); //number = 설정한 15
		for(int i=0; i<num; i++) {
			String val = printAnno.value(); 
			System.out.print(val);
		}
		System.out.println();
	}
}
