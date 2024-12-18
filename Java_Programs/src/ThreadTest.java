class MyThread extends Thread {

 MyThread(String name) {

this.setName(name);

start();

System.out.println("constructor" + getName()); }


@Override public void start() {



System.out.println("start" + getName()); }

public void run() { System.out.println("run" + getName()); }

}

 public class ThreadTest {

public static void main(String[] args) 
{ new MyThread("oops;"); } }