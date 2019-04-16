package example.chap6_15_4;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		//Method ��ü�� �ϳ��� ó��
		for(Method method : declaredMethods) {
			//printAnnotation ��ü ���
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			//�޼ҵ� �̸� ���
			System.out.println("[" + method.getName() + "]");
			//���м� ���
			for(int i=0; i<printAnnotation.number(); i++) {
				System.out.print(printAnnotation.value());
			}
			System.out.println();
			
			try {
				//�޼ҵ� ȣ��
				method.invoke(new Service());
			} catch (Exception e) {}
			System.out.println();
		}

	}

}