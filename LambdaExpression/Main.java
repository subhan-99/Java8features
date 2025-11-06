package LambdaExpression;

public class Main {
	public static void main(String[] args) {
		Employee employee = () -> "Software Engineer";
		System.out.println(employee.getName());
		Employee editor =() -> "editor";
		System.out.println(editor.getName());
			
	}

}
