
public class findPrime(int check, int divisor){
	
	int divisor = 2;
	
	while(divisor < check){
		if((check % divisor) == 0){
			check++;
		}else{
			divisor++;
		}
		System.out.println(check);
	}
}
}
