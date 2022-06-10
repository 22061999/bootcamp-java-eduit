package practica.semanal5;

@SuppressWarnings("unchecked")
public class CollectionCustom<T> implements ManipularArray<T> {
	
	private Object[] arrayT;
	private int count = 0;

	public CollectionCustom(int tamañoArray) {
		super();
		this.arrayT = (T[]) new Object[tamañoArray];
	}

	public void addFirst(T element) {
		for(int i = 0; i <= count; i++) {
			arrayT[count - i + 1] = arrayT[count - i];
		}
		arrayT[0] = element;
	}

	public void addLast(T element) {
		arrayT[count] = element;
		count += 1;
	}


	public int size() {
		return count;
	}

	public T removefirstElement() {
		T element = null;
		for(int i = 0; i < arrayT.length; i++) {
			element = (T) arrayT[0];
		}
		return (T) element;
	}

	public Object removeAll() {
		T element = null;
		for(int i = 0; i < arrayT.length; i++) {
		if(arrayT[i] != null) {
			arrayT[i]= element;
			}else {
				break;
			}
		}
		
	return element;
	}

	public boolean booleanEmpty() {
		return arrayT.length != 0;
	}

	

	
}
