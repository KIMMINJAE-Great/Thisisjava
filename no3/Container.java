package no3;

public class Container<T, V> {
	private T name;
	private V job;

	public T getKey() {return name;}
	
	public V getValue() {return job;}
	
	public void setT(T name) {this.name = name;}
	
	public void setV(V job) {this.job = job;}
}
