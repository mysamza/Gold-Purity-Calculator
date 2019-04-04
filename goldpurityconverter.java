import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class goldpurityconverter {
	public static void main(String[] args) {
		
		
		int i1 = 1;
		int temp = 1;
		int i2 = 0;
		int i3 = 0;
		
		int i4 = 0;
		int i5 = 0;
		int i6 = 0;
		int temp2 = 1;
		int temp3 = 1;
		int temp4 = 1;
		double a[] = {29.8, 22};
		
		int looper = a.length/2;
		
		double as[] = new double[10];
		double ass[] = new double[10];
		double asss[] = new double[10];
		double assss[] = new double [10];
		double asssss[] = new double [10];
		
		for(int i =0; i<looper; i++){
			if(a[i1]==18)
				as[i2]=a[i1-1];
			i2++;
			i1=i1+2;
		}
		
		for(int i =0; i<looper; i++){
			if(a[temp]==21){
				ass[i3]=a[temp-1];
			i3++;}
			temp=temp+2;
		}
		
		for(int i =0; i<looper; i++){
			if(a[temp2]==22){
				asss[i4]=a[temp2-1];
			i4++;}
			temp2=temp2+2;
		}
		
		for(int i =0; i<looper; i++){
			if(a[temp3]==24){
				assss[i5]=a[temp3-1];
			i5++;}
			temp3=temp3+2;
		}
		
		for(int i =0; i<looper; i++){
			if(a[temp4]==244){
				asssss[i6]=a[temp4-1];
			i6++;}
			temp4=temp4+2;
		}
		
		double sume = DoubleStream.of(as).sum();
		double sumTone =  DoubleStream.of(ass).sum();
		double sumTtwo =  DoubleStream.of(asss).sum();
		double sumTfour =  DoubleStream.of(assss).sum();
		double sumTfourp =  DoubleStream.of(asssss).sum();
		
		System.out.println("The sum of 18K gold is "+ sume);
		System.out.println("The sum of 21K gold is " + sumTone);
		System.out.println("The sum of 22K gold is " + sumTtwo);
		System.out.println("The sum of 24K gold is " + sumTfour);
		System.out.println("The sum of 24Kp gold is " + sumTfourp);
		
		double pureofeighteen = sume*0.750;
		double pureofTone = sumTone*0.875;
		double pureofTwo = sumTtwo*0.916;
		double pureofTfour = sumTfour*0.999;
		
		double allpure = pureofeighteen + pureofTone + pureofTwo + pureofTfour;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("What do you want to convert to?" + allpure);
		
		int converterVar = sc.nextInt();
		
		if(converterVar==18){
			double eighteen = allpure/0.750;
			System.out.println("Your eqvi of 18k is "+ eighteen + " grams");
		}
		else if (converterVar==21){
			double twnone = allpure/0.875;
			System.out.println("Your eqvi of 21k is "+ twnone + " grams");
		}
		
		else if (converterVar==22){
			double twntwo = allpure/0.916;
			System.out.println("Your eqvi of 22k is "+ twntwo + " grams");
		}
		
		else if (converterVar==24){
			double twnfr = allpure/0.999;
			System.out.println("Your eqvi of 24k is "+ twnfr + " grams");
		}
		
		
		
		
		
		
		
		

 /*    double arrayItem[] = {50.0, 18.0, 10.0, 21.0, 50.0, 18.0, 26.0, 18.0, 68.0, 24.0, 87.0, 22.0, 63.0, 22.0, 544.0, 24.0};
       double arrayEighteen[] = new double[10];
       double arrayTone[]= new double[10];
       double arrayTtwo[]= new double[10];
       double arrayPure[]= new double[10];
       double arrayNinetyFive[]= new double[10];
       
       int index = 1;
       int indexOfArrayEighteen = 0;
       int ioftone =0;
       int iofttwo=0;
       int iofpure=0;
       int iofninetyfive= 0;
       
       
       for(int i = 0; i<=3;i++)
       {
    	   
    	   if(arrayItem[index]==18)
    	   {
    		   arrayEighteen[indexOfArrayEighteen]=arrayItem[index-1];
    		   indexOfArrayEighteen++;
    		  
    	   }
    	   else if(arrayItem[index]==21){
    		   arrayTone[ioftone]=arrayItem[index-1];
    		   ioftone++;
    		   
    	   }
    	   else if(arrayItem[index]==22){
    		   arrayTtwo[iofttwo]=arrayItem[index-1];
    		   iofttwo++;
    	   }
    	   else if(arrayItem[index]==24){
    		   arrayPure[iofpure]=arrayItem[index-1];
    		   iofpure++;
    	   }
    	   index=index+2;
       }
       System.out.println(Arrays.toString(arrayEighteen));
       System.out.println(Arrays.toString(arrayTone));
       System.out.println(Arrays.toString(arrayTtwo));
       System.out.println(Arrays.toString(arrayPure));
    } */

	}
}
