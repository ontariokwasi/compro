package homework7.problem2;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private Person[] personArr;
	private int size;

	public MyStringList() {
		personArr = new Person[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Person person) {
		if (size == personArr.length)
			resize();
		personArr[size++] = person;
	}

	public Person get(int i) {
		if (i < 0 || i > size)
			return null;
		return personArr[i];
	}

	public boolean find(String lastName) {
		for (Person p : personArr) {
			if(p != null)
				if (p.getLast().equals(lastName))
					return true;
		}
		return false;
	}

	public void insert(Person p, int pos) {
		if (pos > size)
			return;
		if (pos >= personArr.length || size + 1 > personArr.length) {
			resize();
		}
		Person[] temp = new Person[personArr.length + 1];

		System.arraycopy(personArr, 0, temp, 0, pos);
		temp[pos] = p;

		System.arraycopy(personArr, pos, temp, pos + 1, personArr.length - pos);
		personArr = temp;
		++size;

	}

	public void resize() {
		System.out.println("Resizing...");
		Person[] newPersonArr = new Person[personArr.length * 2];
		System.arraycopy(personArr, 0, newPersonArr, 0, personArr.length);
		personArr = newPersonArr;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(personArr[i] + ", ");
		}
		sb.append(personArr[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean remove(String lastName) {
		if (size == 0)
			return false;
		int tempIndex = -1;
		for (int i = 0; i < personArr.length; i++) {
			if (personArr[i] != null) {
				if (personArr[i].getLast().equals(lastName)) {
					tempIndex = i;
					break;
				}
			}
		}

		if (tempIndex == -1) {
			return false;
		} else {
			Person[] newPersonArr = new Person[personArr.length];
			if (tempIndex == personArr.length - 1) {
				// Last Index
				System.arraycopy(personArr, 0, newPersonArr, 0, personArr.length - 1);
				--size;
				return true;
			} else {
				// Middle Index
				for (int i = tempIndex; i < personArr.length - 1; i++) {
					personArr[tempIndex] = personArr[tempIndex + 1];
				}
				//System.arraycopy(personArr, 0, newPersonArr, 0, personArr.length - 1);
				--size;
				return true;
			}
		}

	}

	public static void main(String[] args) {
		MyStringList myStringList = new MyStringList();
		myStringList.add(new Person("Akomeng", "Gideon", 26));
		myStringList.add(new Person("Adesina", "Adeoye", 27));
		myStringList.add(new Person("Sarfo", "Philip", 25));
		myStringList.add(new Person("Prince", "Dawson", 19));
		myStringList.add(new Person("Michael", "Ams", 31));
		
		System.out.println(myStringList.find("Akomeng"));
		System.out.println(myStringList.remove("Akomeng"));
		System.out.println(myStringList.find("Akomeng"));
		System.out.println(myStringList.size());
		//System.out.println(mList);
	}

}
