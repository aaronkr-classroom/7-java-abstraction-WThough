public abstract class Shape {
	String color;
	
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	//일반 메서드를 정의하면 모든 자식 클래스에서
	//같은 함수를 사용할 수 있다.
	public String getColor() {
		return color;
	}

}
