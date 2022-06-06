package practica.semanal5;


public class CollectionCustom<T> implements ManipularArray<T> {
	
	private  T[] arrayT;



	public CollectionCustom() {
		super();
		this.arrayT = arrayT;
	}



	public void addFirst(T element) {

	}



	public void addLast(T element) {

		arrayT[arrayT.length] = element;
	}



	public int size() {
		return arrayT.length;
	}



	public T removefirstElement() {
		T element = arrayT[0];
		for(int i = 0; i < arrayT.length; i++) {
			arrayT[i] = arrayT[i+1];
		}
		
		return element;
	}



	public void removeAll() {
		// TODO Auto-generated method stub
		
	}



	public boolean booleanEmpty() {
		return arrayT.length == 0;
	}
}
