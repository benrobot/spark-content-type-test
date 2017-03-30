package com.random.test;

import static spark.Spark.*;

public class Main {
public static int beforeCounter = 0;
public static int getCounter = 0;
public static int afterCounter = 0;
public static int afterAfterCounter = 0;
	public static void main(String[] args) {
		
		before((req, res) -> {
			beforeCounter++;
			System.out.println("before: beforeCounter = " + beforeCounter);
			System.out.println("before: getCounter = " + getCounter);
			System.out.println("before: afterCounter = " + afterCounter);
			System.out.println("before: afterAfterCounter = " + afterAfterCounter);
		});
		
		get("/hello", (req, res) -> {
			getCounter++;
			System.out.println("get: beforeCounter = " + beforeCounter);
			System.out.println("get: getCounter = " + getCounter);
			System.out.println("get: afterCounter = " + afterCounter);
			System.out.println("get: afterAfterCounter = " + afterAfterCounter);
			res.type("application/pdf");
			return "Hello World";
		});
		
		after("/hello", (req, res) -> {
			afterCounter++;
			System.out.println("after: beforeCounter = " + beforeCounter);
			System.out.println("after: getCounter = " + getCounter);
			System.out.println("after: afterCounter = " + afterCounter);
			System.out.println("after: afterAfterCounter = " + afterAfterCounter);
		});
		
		afterAfter("/hello", (req, res) -> {
			afterAfterCounter++;
			System.out.println("afterAfter: beforeCounter = " + beforeCounter);
			System.out.println("afterAfter: getCounter = " + getCounter);
			System.out.println("afterAfter: afterCounter = " + afterCounter);
			System.out.println("afterAfter: afterAfterCounter = " + afterAfterCounter);
		});
	}

}
