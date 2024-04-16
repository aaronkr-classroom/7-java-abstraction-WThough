public class Bike extends TwoWheeler {
	// Vehicle 추상 클래스의 매서드
	public void printPrice() {
		System.out.println("가격: 150,000원");
	}
	
	//TwoWheeler 추상 클래의 메서드
	public void printType() {
		System.out.println("이것은 자전거입니다.");
	}
	
	// Bike 일반 클래스이 메서드
	public void printBrand() {
		System.out.println("브랜드: 삼천리");
	}

}
