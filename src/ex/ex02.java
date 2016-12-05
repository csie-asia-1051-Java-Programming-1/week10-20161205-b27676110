package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n = scn.nextFloat();
		if(n<=120){
			System.out.println(n*2.10);
			System.out.println(n*2.10);
		}else{
			if(n>120&&n<=330){
				System.out.println(120*2.10+(n-120)*3.02);
				System.out.println(120*2.10+(n-120)*2.68);
			}else{
				if(n>330&&n<=500){
					System.out.println(120*2.10+210*3.02+(n-330)*4.39);
					System.out.println(120*2.10+210*2.68+(n-330)*3.61);
				}else{
					if(n>500 && n<=700){
					System.out.println(120*2.10+210*3.02+170*4.39+(n-500)*4.97);
					System.out.println(120*2.10+210*2.68+170*3.61+(n-500)*4.01);
					}else{
						if(n>700){
							System.out.println(120*2.10+210*2.68+170*3.61+200*4.01+(n-700)*4.50);
						}
					}
				}
			}
		}

	}

}
