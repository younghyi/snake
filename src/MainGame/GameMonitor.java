package MainGame;

import java.util.Arrays;

import GameProcess.FillMonitor;

public class GameMonitor {
	
	static char[][] gameMonitor = new char[10][10];
	
	public static void main(String[] args) {
		
		try {
			/*
			 * 화면 초기 설정
			 * 1. 초기 뱀의 몸 길이 설정
			 * 2. 랜덤 위치에 오브젝트 설정(먹으면 몸 길어짐)
			 */
			FillMonitor Monitoring = new FillMonitor();
			Monitoring.fillMonitor(gameMonitor);
			
			StringBuilder sb = new StringBuilder();
			
			//game Start
			while(true) {

				//현재 상태 출력
				for(int i=0; i<10; i++) {
					for(int j=0; j<10; j++) 
						sb.append(gameMonitor[i][j]);
					sb.append("\n");
				}
				
				System.out.println(sb);
				sb.setLength(0);
				
				/*
				 * 게임 진행 프로세스
				 * 1. 방향키 입력 시 방향 전환
				 * 2. 특정 오브젝트에 닿으면 길이 증가
				 * 3. 벽에 충돌하거나 자신의 몸에 닿으면 게임 종료
				 */
				//////////////////////////
				
				//////////////////////////
				
				Thread.sleep(3000);
				
				//화면 넘김
				for(int i=0; i<11; i++) {
					sb.append("\n");
				}
				System.out.println(sb);
				sb.setLength(0);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
