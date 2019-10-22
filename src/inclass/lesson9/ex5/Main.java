package inclass.lesson9.ex5;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	//Use IntSummaryStatistics to output the top test score,
	//the lowest test score, and the average of all test scores
	public static void main(String[] args) {
		List<ExamData> data = new ArrayList<ExamData>() {
			{
				add(new ExamData("George", 91.3));
				add(new ExamData("Tom", 88.9));
				add(new ExamData("Rick", 80));
				add(new ExamData("Harold", 90.8));
				add(new ExamData("Ignatius", 60.9));
				add(new ExamData("Anna", 77));
				add(new ExamData("Susan", 87.3));
				add(new ExamData("Phil", 99.1));
				add(new ExamData("Alex", 84));
			}
		};
		
		//int max = data.stream().max(Comparator.comparing(ExamData::getTestScore))
		System.out.println(data.stream().collect(Collectors.summarizingDouble(ExamData::getTestScore)).toString());
		
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = new ArrayList<Number>();
		List<Integer> int2 = new ArrayList<Integer>(Arrays.asList(4));
		nums = ints;
		nums.add(null);
		//nums.add(3.14);
		System.out.print(ints); 
		
		int [] arr = {1,2,4,3,0};
		Arrays.sort(arr);
		System.out.println(arr );
		
		//
		List<Number> intd = new ArrayList<>();
		intd.add(3f);
	}
	

}
