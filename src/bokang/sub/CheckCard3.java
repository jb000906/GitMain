package bokang.sub;
/*
체크카드 클래스 Ver.03
	: initMembers 초기화 메소드는 삭제처리 
	
	1.충전은 10000원 단위로만 가능하다.
	만약 5000원을 충전하면 충전불능으로 처리한다.
	
	2.잔고가 부족하면 결제불능으로 처리해야 한다.
	
	3.생성자 오버로딩 처리
		new CheckCard3(카드번호, 소유자, 잔고, 포인트);
		new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
		new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	
	4.포인트 적립율 변경
		10만원 이하결재 : 0.1%적립
		10만원 초과결재 : 0.3%적립
 */
public class CheckCard3 {
	private long cardNumber;//카드번호
	private String owner;//소유자
	private int balance;// 잔액
	private int point;//포인트

	public CheckCard3() {}
	public CheckCard3(long cardNumber, String owner, int balance, int point) {
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	//new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
	public CheckCard3(long cardNumber, String owner, int balance) {
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = 0;
	}
		//new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	public CheckCard3(long cardNumber, String owner) {
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = 0;
		this.point = 0;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	//충전
	public void charge(int amount) {
		if(amount%10000==0) {
		this.balance+=amount;
		System.out.println("충전완료");
		}
		else {
			System.out.println("충전불가");
		}
	}
	
	//결제
	public void payment(int amount) {
		if(balance>=amount) {
		this.balance-=amount;
		savingPoint(amount);
		System.out.println("결제완료");
		}
		else {
			System.out.println("잔액이 부족합니다");
		}
	}
	//적립
	public void savingPoint(int amount) {
		if(amount<100000) {
		double plusPoint = amount * 0.1;
		this.point+=plusPoint;
		}
		else{
			double plusPoint = amount * 0.3;
			this.point+=plusPoint;
			}
	}
	//현재상태출력
	public void showState() {
		System.out.println("카드번호:"+this.cardNumber);
		System.out.println("소유자:"+this.owner);
		System.out.println("잔고:"+this.balance);
		System.out.println("포인트:"+this.point);
	}
}
