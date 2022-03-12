class threads extends Thread
{
	String name;
	threads (String thread){
		name = thread; 
	}
    @Override
    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            try
            {
            	System.out.println("Thread: " + name + " Iteration: " + i);
				Thread.sleep(1000);
            }
  
            catch(InterruptedException e)
            {
            	System.out.println("Thread: " + name + "Interrupted");
            }
        }
    }
}

class MultiThread {
	public static void main(String args[]) {
		threads one = new threads("One");
		threads two = new threads("Two");
		threads three = new threads("Three");
		one.start();
		try{
            System.out.println("Thread One is alive? " + one.isAlive());
            one.join();
        }
        catch(Exception e){
            System.out.println("Thread One Interrupted");
        }
		two.start();
		try{
            System.out.println("Thread Two is alive? " + two.isAlive());
            two.join();
        }
        catch(Exception e){
            System.out.println("Thread Two Interrupted");
        }
		three.start();
		try{
            System.out.println("Thread Three is alive? " + three.isAlive());
            three.join();
        }
        catch(Exception e){
            System.out.println("Thread Three Interrupted");
        }
		try{
            System.out.println("Thread One is alive? " + one.isAlive());
            System.out.println("Thread Two is alive? " + two.isAlive());
            System.out.println("Thread Three is alive? " + three.isAlive());
        }
        catch(Exception e){
            System.out.println("Main Thread Interrupted");
        }
	}
}