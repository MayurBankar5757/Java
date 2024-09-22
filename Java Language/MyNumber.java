public class MyNumber{

	private int num;

	public MyNumber(){

		num =0;
	}

	public MyNumber(int num){

		this.num = num;
	}

	public boolean isNegative(){

		if(num<0){

		 return true;
		}
		else{

		return false;

		}
	}

	public boolean isPositive(){

		if(num>0){

		 return true;
		}
		else{

		return false;

		}
	}

	public boolean isZero(){

		if(num==0){

			return true;
		}
		else{

		return false;

		}
	}

	public boolean isOdd(){

		if(num%2!=0){

		 return true;
		}
		else{

		return false;

		}
	}

	public boolean isEven(){

		if(num%2==0){

		 return true;
		}
		else{

		return false;

		}
	}
}