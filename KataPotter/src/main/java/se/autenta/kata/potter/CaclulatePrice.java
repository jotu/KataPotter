package se.autenta.kata.potter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CaclulatePrice {
	private static final double BOOK_PRICE = 8.0;
	private static final double[] DISCOUNTS = {1.0, 0.95, 0.90, 0.80, 0.75};

	public double calculate(List<Integer> cart) {
		double price = Double.MAX_VALUE;
		if (cart.size() > 0) {
			List<List<Set<Integer>>> bucketSetList = createBucketSetList(cart);
			for (List<Set<Integer>> bucketList : bucketSetList) {
				double bucketPrice = 0.0;
				for (Set<Integer> bucket : bucketList) {					
					bucketPrice += bucket.size() * BOOK_PRICE * DISCOUNTS[(bucket.size() - 1)];
				}
				if (price > bucketPrice) {
					price = bucketPrice;
				}
			}
		} else {
			price = 0.0;
		}
		return price;
	}

	private List<List<Set<Integer>>> createBucketSetList(List<Integer> cart) {
		List<List<Set<Integer>>> bucketSetList = new ArrayList<List<Set<Integer>>>();
		for (int i=2; i <= 5; i++) {
			bucketSetList.add(createBucketList(cart, i));
		}
		return bucketSetList;
	}

	private List<Set<Integer>> createBucketList(List<Integer> cart, final int maxSetSize) {
		List<Set<Integer>> bucketList = new ArrayList<Set<Integer>>();
		bucketList.add(new HashSet<Integer>());
		for (Integer book : cart) {
			boolean bookAdded = false;
			for (Set<Integer> bucket: bucketList) {
				if (!bucket.contains(book) && bucket.size() <= maxSetSize) {
					bookAdded = true;
					bucket.add(book);
					break;
				}
			}
			if (!bookAdded){
				Set<Integer> bucket = new HashSet<Integer>();
				bucket.add(book);
				bucketList.add(bucket);
			}
		}		
		return bucketList;
	}
}
