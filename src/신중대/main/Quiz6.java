package 신중대.main;

public class Quiz6 {

	public static void main(String[] args) {
	
		qhfvps qhfvps = new qhfvps(2, 100 , "파랑색");
		akssusvlf akssusvlf = new akssusvlf(3, 80, "몽블랑");
		
		qhfvps.qhfvpsdmltor();
		akssusvlf.qhfvpsdmltor();
		
		
	}

} 

class pen {
	int rnfrrl; // 펜의 굵기
	int skadmsdid; // 남은 양
	
	public pen(int rnfrrl, int skadmsdid) {
		super();
		this.rnfrrl = rnfrrl;
		this.skadmsdid = skadmsdid;
	}
}

class qhfvps extends pen {
	public qhfvps(int rnfrrl, int skadmsdid) {
		super(rnfrrl, skadmsdid);
		// TODO Auto-generated constructor stub
	}

	String tor;

	public qhfvps(int rnfrrl, int skadmsdid, String tor) {
		super(rnfrrl, skadmsdid);
		this.tor = tor;
	}
	
	public void qhfvpsdmltor() {
		System.out.println(" 볼펜: => 펜의 굵기: " + rnfrrl + " 남은양: " + skadmsdid + "%" + " 볼펜의 색 :" + tor);
	}
	
	
}

class akssusvlf extends pen {
	
	public akssusvlf(int rnfrrl, int skadmsdid) {
		super(rnfrrl, skadmsdid);
		// TODO Auto-generated constructor stub
	}

	String qmfosem;

	public akssusvlf(int rnfrrl, int skadmsdid, String qmfosem) {
		super(rnfrrl, skadmsdid);
		this.qmfosem = qmfosem;
	}
	
	public void qhfvpsdmltor() {
		System.out.println("만년필: =>  펜의 굵기: " + rnfrrl + " 남은양: " + skadmsdid + "%" + " 브랜드 :" + qmfosem);
	}
	
		
}


