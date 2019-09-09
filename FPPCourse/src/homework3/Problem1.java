package homework3;

public class Problem1 {
	public static void main(String[] args) {
		System.out.println(sorted("ace", "bdf"));
	}
	
	static String sorted(String a, String b) {
		String fs = a+""+b;
		if(fs.length() <= 0)
			return "";
		else if(fs.length() == 1)
			return fs;
		String [] fsarr = fs.split("");
		String min = fsarr[0];
		for(String s : fsarr)
			if(s.compareTo(min) < 0)
				min = s;
		if(a.indexOf(min) == 0)
			//a = a.replace(min, "");
			a = a.substring(0,a.indexOf(min)) + a.substring(a.indexOf(min)+1);
		else if(b.indexOf(min) == 0)
			//b = b.replace(min, "");
			b = b.substring(0,b.indexOf(min)) + b.substring(b.indexOf(min)+1);
	
		return min+""+sorted(a,b);
	}
}
