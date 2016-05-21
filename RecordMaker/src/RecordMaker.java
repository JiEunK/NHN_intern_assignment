import java.util.Random;

public class RecordMaker {

	public static void main(String args[]){
		
		String num = args[0];
		int count = Integer.parseInt(num);
		int id_num=0, score = 0;
		int[] id_nums = new int[count];;
		boolean check = false;
		
		Random random = new Random();
		
		for(int i=0; i<count; i++){
			
			id_num = 0+random.nextInt(100000);
			score = 0+random.nextInt(100);
			
			for(int j=0; j<i; j++){
				if(id_nums[j] == id_num){
					i--;
					check = true;
					break;
				}
			}
			
			if(check == true){
				check = false;
				continue;
			}
			
			id_nums[i] = id_num;
			System.out.println("NT"+String.format("%05d", id_num)+" "+score);
		}
	}
}
