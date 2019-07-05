package com.trainingbasket.list;

import java.awt.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) throws IOException {
		java.util.List<Example> examples = new ArrayList<Example>();
		java.util.List<String> lines = Files.readAllLines(Paths.get("E:\\data.csv"));
		for (String line : lines) {
			String columns[]=line.split(",");
			Example example = new Example();
			example.setName(columns[0]);
			example.setAge(Integer.parseInt(columns[1]));
			example.setMarks(Integer.parseInt(columns[2]));
			examples.add(example);
		}
		for (Example example : examples) {
			System.out.println(example);
			
		}
		
		System.out.println("UNSORTED");
		for(Example example : examples) {
			System.out.println(example);
		}
		
		Collections.sort(examples);
		System.out.println("SORTED");
		for(Example example : examples) {
			System.err.println(example);
		}
	}

}
