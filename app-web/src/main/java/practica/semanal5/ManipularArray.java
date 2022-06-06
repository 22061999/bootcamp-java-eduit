package practica.semanal5;


public interface ManipularArray<T>{

	void addFirst(T element);
	void addLast(T element);
	int size();
	T removefirstElement();
	void removeAll();
	boolean booleanEmpty();
}
