package se.autenta.kata.potter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class KataPotter {

	@Test
	public void emptyCartPrize() {
		List<Integer> cart = new ArrayList<Integer>(); 
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals(0.0, amount, 0);
	}
	
	@Test
	public void oneBookPrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals(8.0, amount, 0);
	}

	@Test
	public void twoBooksWithSameTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 2), amount, 0);
	}

	@Test
	public void threeBooksWithSameTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(1);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 3), amount, 0);
	}

	@Test
	public void fourBooksWithSameTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(1);
		cart.add(1);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 4), amount, 0);
	}

	@Test
	public void fiveBooksWithSameTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(1);
		cart.add(1);
		cart.add(1);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 5), amount, 0);
	}

	@Test
	public void twoBooksWithDifferentTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(2);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 2 * .95), amount, 0);
	}

	@Test
	public void threeBooksWithDifferentTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(2);
		cart.add(3);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 3 * .90), amount, 0);
	}

	@Test
	public void fourBooksWithDifferentTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(2);
		cart.add(3);
		cart.add(4);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 4 * .80), amount, 0);
	}

	@Test
	public void fiveBooksWithDifferentTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(2);
		cart.add(3);
		cart.add(4);
		cart.add(5);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8.0 * 5 * .75), amount, 0);
	}

	@Test
	public void twoBooksWithSameTitleAndOneWithDifferentTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(2);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8 + (8 * 2 * 0.95)), amount, 0);
	}

	@Test
	public void twoSetOfBooksWithDifferentTitlePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(2);
		cart.add(2);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((2 * (8 * 2 * 0.95)), amount, 0);
	}

	@Test
	public void oneSetWithFourDifferentTitlesAndOneSetWithTwoDifferentTilesPrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(2);
		cart.add(3);
		cart.add(3);
		cart.add(4);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals(((8 * 4 * 0.8) + (8 * 2 * 0.95)), amount, 0);
	}

	@Test
	public void oneSetWithFiveDifferentTitlesAndOneSetWithOneTilePrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(2);
		cart.add(2);
		cart.add(3);
		cart.add(4);
		cart.add(5);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((8 + (8 * 5 * 0.75)), amount, 0);
	}

	@Test
	public void twoSetWithfourDifferentTitlesPrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(2);
		cart.add(2);
		cart.add(3);
		cart.add(3);
		cart.add(4);
		cart.add(5);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((2 * (8 * 4 * 0.8)), amount, 0);
	}

	@Test
	public void edgeCasesPrice() {
		List<Integer> cart = new ArrayList<Integer>(); 
		cart.add(1);
		cart.add(1);
		cart.add(1);
		cart.add(1);
		cart.add(1); 
		cart.add(2);
		cart.add(2);
		cart.add(2);
		cart.add(2);
		cart.add(2); 
		cart.add(3);
		cart.add(3);
		cart.add(3);
		cart.add(3); 
		cart.add(4);
		cart.add(4);
		cart.add(4);
		cart.add(4);
		cart.add(4); 
		cart.add(5);
		cart.add(5);
		cart.add(5);
		cart.add(5);
		CaclulatePrice calculatePrice = new CaclulatePrice();
		double amount = calculatePrice.calculate(cart);
		assertEquals((3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8)), amount, 0);
	}
}
