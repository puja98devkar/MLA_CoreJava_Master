package com.learning.core.day2session1;
import java.util.*;
public class D02P0505 {
		 
	    private static Map<Character, List<Character>> graph = new HashMap<>();
	    private static Map<Character, Integer> outDegree = new HashMap<>();
	    private static Map<Character, Integer> inDegree = new HashMap<>();
	    
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
	        System.out.println("Enter number of strings:");
	        int n = Integer.parseInt(scanner.nextLine()); 
	 
	        System.out.println("Enter the strings:");
	        String[] strings = new String[n];
	        for (int i = 0; i < n; i++) {
	            strings[i] = scanner.nextLine(); 
	        
	        if (canFormCircle(strings)) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }   
	        scanner.close();}
	    }
	 
	    private static boolean canFormCircle(String[] strings) {
	        buildGraph(strings);

	        for (char key : graph.keySet()) {
	            if (!outDegree.get(key).equals(inDegree.get(key))) {
	                return false;
	            }
	        }

	        return isStronglyConnected();
	    }
	 
	    private static void buildGraph(String[] strings) {
	        for (String s : strings) {
	            char start = s.charAt(0);
	            char end = s.charAt(s.length() - 1);
	            graph.putIfAbsent(start, new ArrayList<>());
	            graph.get(start).add(end);
	            
	            outDegree.merge(start, 1, Integer::sum);
	            inDegree.merge(end, 1, Integer::sum);
	            inDegree.putIfAbsent(start, 0);
	            outDegree.putIfAbsent(end, 0);
	        }
	    }
	 
	    private static boolean isStronglyConnected() {
	        Set<Character> visited = new HashSet<>();
	        char startNode = graph.keySet().iterator().next();
	        dfs(startNode, visited);

	        for (char key : graph.keySet()) {
	            if (!visited.contains(key) && !graph.get(key).isEmpty()) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	    private static void dfs(char start, Set<Character> visited) {
	        visited.add(start);
	        if (graph.get(start) != null) {
	            for (char neighbor : graph.get(start)) {
	                if (!visited.contains(neighbor)) {
	                    dfs(neighbor, visited);
	                }
	            }
	        }
	    }
	}
