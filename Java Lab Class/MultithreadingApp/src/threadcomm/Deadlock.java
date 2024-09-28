package threadcomm;


public class Deadlock {

	public static void main(String[] args) {
		String [] arr = {"hello","hi","object","world","java","inheritance"};
		int [] nums = {3,6,2,9,5,1};
		MyRead t1 = new MyRead(arr, nums);
		MyWrite t2 = new MyWrite(arr, nums);
		t1.t.start();		
		t2.t.start();
	}

}

class MyRead implements Runnable
{
	String [] arr;
	int [] nums;
	Thread t;
	
	public MyRead(String [] arr, int [] nums)
	{
		this.arr = arr;
		this.nums = nums;
		t = new Thread(this);
	}
	public void run()
	{
		synchronized(arr)
		{
			System.out.println("Holding lock for string array");
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized (nums) {
				for(int i=0;i<arr.length;i++)
				{
					if(i<nums.length)
						System.out.println(arr[i]+" : "+nums[i]);
					else
						System.out.println(arr[i]);
				}
			}
			
		}
	}
}

class MyWrite implements Runnable
{
	String [] arr;
	int [] nums;
	Thread t;
	
	public MyWrite(String [] arr, int [] nums)
	{
		this.arr = arr;
		this.nums = nums;
		t = new Thread(this);
	}
	public void run()
	{
		synchronized(nums)
		{
			System.out.println("Holding lock for num array");
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized (arr) {
				for(int i=0;i<nums.length;i++)
				{
					if(i<arr.length)
					{
						arr[i] = arr[i].toUpperCase();
						nums[i] = nums[i]*nums[i];
					}
					else
					{
						nums[i] = nums[i]*nums[i];
					}
						
				}
			}
			
		}
	}
}

