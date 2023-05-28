import java.util.Random;

public class TestDemo {
	
	
	public int addPositive( int a, int b) {
		if(a > 0 && b > 0) {
			return a+b;
		}
		else {
			throw new IllegalArgumentException("Both parameters must be postive!");
		}
	}
	public int randomNumberSquared() {
		int randomNum = getRandomInt();
		return randomNum*randomNum;
	}
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) +1;
		
	}

}
