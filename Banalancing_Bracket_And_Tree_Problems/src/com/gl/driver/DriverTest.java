package com.gl.driver;

import com.gl.utils.FindSumOfPair;
import com.gl.utils.FindSumOfPair.Node;

public class DriverTest {

	public static void main(String[] args) {
		 Node root =null;
		 FindSumOfPair findSP = new FindSumOfPair();
		 root = findSP.insert(root, 40);
		 root = findSP.insert(root, 20);
		 root = findSP.insert(root, 60);
		 root = findSP.insert(root, 10);
		 root = findSP.insert(root, 30);
		 root = findSP.insert(root, 50);
		 root = findSP.insert(root, 70);
		   
		   int sum = 60;
		   findSP.findPairWithGivensum(root, sum);

	}

}
