package GameProcess;

public class FillMonitor {
	
	public void fillMonitor(char[][] gameMonitor) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i==0 && j == 0)
					gameMonitor[i][j] = '*';
				else
					gameMonitor[i][j] = '0';
			}
		}
	}
}


