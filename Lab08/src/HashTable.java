public class HashTable {
	private int size = 0;
	private String[] fr;
	private String[] eng;

	public HashTable(int capacity) {//constructor method
		fr = new String[capacity];
		eng = new String[capacity];
	}

	public void put(String key, String value) {//add Data to the table
		//is hash table full?
		if(size == fr.length) {// no of data EQUAL to array'size,or not?
			System.out.println("Hash table is full.");
		return;
		}
		
		//use hash function to convert key to hash index
		int index = hashFunction(key);
		
		//add new value to the array at the computed position
		fr[index]=key;
		eng[index]=value;
		size++;
		System.out.println("Putting "+key+" is  successful.");
	}

	public int getSize() {//getter
		return size;
	}

	public int hashFunction(String key) {
		int hash = (key.hashCode() & 0x7FFFFFFF) % eng.length;
		return hash;
	}

	public void printHashTable() {
	System.out.println("--- Hash Table ---");
	for(int i = 0 ; i<fr.length;i++) {
		System.out.println(i+" "+fr[i]+" "+eng[i]);
	}
	}
}