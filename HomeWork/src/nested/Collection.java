package nested;

public class Collection {
	
	Object[] array = new Object[10] ;

	public Collection() {
		array[0]=1;
		array[1]=3;
		array[2]=123;
		array[3]=234;
		array[4]=121;
		array[5]=15;
		array[6]=21;
		array[7]=61;
		array[8]=172;
		array[9]=213;
	}
	
	public class FirstClass implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	

}
