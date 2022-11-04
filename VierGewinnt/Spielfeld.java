package VierGewinnt;

public class Spielfeld {
	private int[][] array;
	private Spieler spieler;
	
	public Spielfeld() {
		this.array = new int[6][7];
		
		
	}

	public void initialisiereSpielfeld() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}
	}

	public void druckeSpielfeld() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public void setzeSpielstein(int sp, Spieler p) {
		if(p.getNumber()==1) {
		if ((sp >= 0 && sp <= 6) && array[0][sp] == 0) {
			for (int i = array.length-1; i >=0 ; i--) {
				if (array[i][sp] == 0) {
					array[i][sp] = 1;
					break;
				}

			}
		}
		}else {
			if ((sp >= 0 && sp <= 6) && array[0][sp] == 0) {
				for (int i = array.length-1; i >= 0; i--) {
					if (array[i][sp] == 0) {
						array[i][sp] = 2;
						break;
					}

				}
			
			}
		}
		druckeSpielfeld();
	}

	public boolean testeSieg() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				check horizontal
				if(array[i][j]==1 && j+3<array[0].length) {
					int counter =1;
					for(int f=j+1;f<=j+3;f++) {
						if(array [i][f]==1) {
							counter++;
							if (counter==4) return true;
						}
					}
				}
//				check vertical
				if(array[i][j]==1 && i+3<array.length ) {
					int counter1 =1;
					for(int f=i+1;f<=i+3;f++) {
						if(array [f][j]==1) {
							counter1++;
							if (counter1==4) return true;
						}
					}
				}
//				check diagonally
				if(array[i][j]==1 && i+3<array.length&& j+3 <array[0].length) {
					int counter2 =1;
					int pos = j+1;
					for(int f=i+1;f<=i+3&&pos<=j+3;f++) {
						if(array [f][pos]==1) {
							pos++;
							counter2++;
							if (counter2==4) return true;
						}
					}
				}
//				check diagonally re
				if(array[i][j]==1 && i+3<array.length&& j-3>=0) {
					int counter3 =1;
					int pos1 = j-1;
					for(int f=i+1;f<=i+3&&pos1>=j-3;f++) {
						if(array [f][pos1]==1) {
							pos1--;
							counter3++;
							if (counter3==4) return true;
						}
					}
				}
			}
			
		}
			
	
		
		
		
	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				check horizental
				if(array[i][j]==2 && j+3<array[0].length) {
					int counter =1;
					for(int f=j+1;f<=j+3;f++) {
						if(array [i][f]==2) {
							counter++;
							if (counter==4) return true;
						}
					}
				}
//				check vertical
				if(array[i][j]==1 && i+3<array.length ) {
					int counter1 =2;
					for(int f=i+1;f<=i+3;f++) {
						if(array [f][j]==2) {
							counter1++;
							if (counter1==4) return true;
						}
					}
				}
//				check diagonally
				if(array[i][j]==2 && i+3<array.length&& j+3 <array[0].length) {
					int counter2 =1;
					int pos = j+1;
					for(int f=i+1;f<=i+3&&pos<=j+3;f++) {
						if(array [f][pos]==2) {
							pos++;
							counter2++;
							if (counter2==4) return true;
						}
					}
				}
//				check diagonally re
				if(array[i][j]==2 && i+3<array.length&& j-3>=0) {
					int counter3 =1;
					int pos1 = j-1;
					for(int f=i+1;f<=i+3&&pos1>=j-3;f++) {
						if(array [f][pos1]==2) {
							pos1--;
							counter3++;
							if (counter3==4) return true;
						}
					}
				}
			}
			
		}
		

	
	
	return false;
}
}
