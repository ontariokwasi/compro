package homework6;

public class MyTable {
	
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");
		String s = t.get('b');
		System.out.println(s);
	}
	
	private Entry[] entries;
	
	 public MyTable() {
		entries = new Entry[26];
	}

	public String get(char c) {
		int index = c - 'a';
		return entries[index].getStr();
	}

	public void add(char c, String s) {
		int index = c - 'a';
		if (entries[index] != null && entries[index].getCh() == c) {
			entries[index].setStr(s);
		} else {
			entries[index] = new Entry(c, s);
		}
	}
	
	@Override
	public String toString() {
		String entries = "";
		for(Entry entry:this.entries)
			if(entry != null) {
				entries += entry+"\n";
			}
		return entries;
	}

	private class Entry {
		private char ch;
		private String str;

		public Entry(char ch, String str) {
			this.ch = ch;
			this.str = str;
		}

		public char getCh() {
			return ch;
		}

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}

		@Override
		public String toString() {
			return ch + "->" + str;
		}
	}
}
