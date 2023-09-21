package pack06.game;

import java.util.TimerTask;

public class Timer {
	public static void main(String[] args) {
		Timer timer1 = new Timer();
		TimerTask task1 = new TimerTask() {
			@Override
			public void run() {
				System.out.println(2);
				timer1.cancel();
			}
		};
	}

	protected void cancel() {
		// TODO Auto-generated method stub
		
	}

}
