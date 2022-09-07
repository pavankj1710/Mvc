package springconstructor;

public class Person {
	private int pid;
	private String pname;
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	

}
