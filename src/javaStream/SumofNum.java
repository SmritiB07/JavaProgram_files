package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumofNum {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,4,5,6,8,89,120,77);
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println("sum of numbers:"+sum.get());

	}

}
