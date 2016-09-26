package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class ex03_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int d = 0;
int ih = scn.nextInt();
int im = scn.nextInt();
int oh = scn.nextInt();
int om = scn.nextInt();
double t = ((oh*60)+om) - ((ih*60)+im);
int t1 = (int)(t/30);
	if(t<=120){
		System.out.println(t1*30);	
}
	else  if(t>=120 && t<=240){
    	System.out.println(((t1-4)*40)+120);
}
	else if( t>=240){
	    System.out.println(((t1-8)*60)+280);	
}
	else if(t<=60){
		System.out.println("free");
	}
	}
	

}
