public class MiGong{
	public static void main(String[] args){
		int[][] map = new int[8][7];
		//初始化map
		for(int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int i = 0; i < 8; i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][2] = 1;
		map[3][1] = 1;

		System.out.println("当前地图为：");
		for(int i =0; i < map.length; i++){
			for(int j=0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

