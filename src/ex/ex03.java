package ex;

/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Integer> dataList = new
		ArrayList <Integer> ();
		
		String str = "Y";
		int i = 0,val = 0;
		boolean flag = false;
		while(!(str.equals("N")||str.equals ("n"))){
			System.out.println("input a valve:");
			val = scn.nextInt();
			if(dataList .size ()==0){
				dataList .add(val);
			}else{
				dataList .add(0,val);
			}
		}else{
			flag = true ;i=0;
			while(flag&&i<data List .size()-1){
				
				                                                       
			}
		}
		
		

	}

}
