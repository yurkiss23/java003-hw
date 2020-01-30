/**
 * 
 */

/**
 * @author PoligoN
 *
 */
public class Counter implements Runnable {
	private int value;
	

	public Counter(int value) {
		super();
		this.value = value;
	}
	

	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread: " + Thread.currentThread().getName() + " is worked");
		while (this.getValue() != -1) {
			this.setValue(getValue() + 1);
			
		}

	}

}
