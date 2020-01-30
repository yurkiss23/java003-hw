
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3000;

		Counter c1 = new Counter(0);
		Counter c2 = new Counter(0);
		Counter c3 = new Counter(0);
		Counter c4 = new Counter(0);
		Counter c5 = new Counter(0);

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(c4);
		Thread t5 = new Thread(c5);

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);
		t5.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join(3000);
			t2.join(3000);
			t3.join(3000);
			t4.join(3000);
			t5.join(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

		System.out.println("results:\nc1 - " + c1.getValue() + "\nc2 - " + c2.getValue() + "\nc3 - " + c3.getValue()
				+ "\nc4 - " + c4.getValue() + "\nc5 - " + c5.getValue());
	}

}
