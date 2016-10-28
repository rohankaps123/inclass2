package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ncsu.csc326.coffeemaker.Inventory;
import edu.ncsu.csc326.coffeemaker.exceptions.*;

public class InventoryTest {

	@Test
	public void testChocolate() {
		Inventory inventory = new Inventory();
		int units = inventory.getChocolate();
		assertEquals(15, units);
	}

	@Test
	public void testAddChocolate() {
		Inventory inventory = new Inventory();
		try{
			inventory.addChocolate("2");
		}catch(InventoryException e){
			e.printStackTrace();
		}
		int units = inventory.getChocolate();
		assertEquals(17, units);
	}

	@Test
	public void testMilk() {
		Inventory inventory = new Inventory();
		int units = inventory.getMilk();
		assertEquals(15, units);
	}

	@Test
	public void testAddMilk() {
		Inventory inventory = new Inventory();
		try{
			inventory.addMilk("2");
		}catch(InventoryException e){
			e.printStackTrace();
		}
		int units = inventory.getMilk();
		assertEquals(17, units);
	}

	@Test
	public void testSugar() {
		Inventory inventory = new Inventory();
		int units = inventory.getSugar();
		assertEquals(15, units);
	}

	@Test
	public void testAddSugar() {
		Inventory inventory = new Inventory();
		try{
			inventory.addSugar("2");
		}catch(InventoryException e){
			// e.printStackTrace();
			fail("InventoryException should not occur when adding positive sugar!");
		}
		int units = inventory.getSugar();
		assertEquals(17, units);
	}

	@Test(expected=InventoryException.class)
	public void testAddNegativeSugar(){
		Inventory inventory = new Inventory();
		try{
			inventory.addSugar("-2");
		}catch(InventoryException e){
			e.printStackTrace();
		}
	}

	@Test
	public void testCoffee() {
		Inventory inventory = new Inventory();
		int units = inventory.getCoffee();
		assertEquals(15, units);
	}

	@Test
	public void testAddCoffee() {
		Inventory inventory = new Inventory();
		try{
			inventory.addCoffee("2");
		}catch(InventoryException e){
			e.printStackTrace();
		}
		int units = inventory.getCoffee();
		assertEquals(17, units);
	}

	@Test
	public void testEnoughIngredients() {
		Inventory inventory = new Inventory();
		Recipe recipe = new Recipe();
		try{
			recipe.setAmtChocolate("2");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("2");
		}catch(RecipeException e){
			e.printStackTrace();
		}
		assertEquals(true, inventory.enoughIngredients(recipe));
	}

	@Test
	public void testUseIngredients() {
		Inventory inventory = new Inventory();
		Recipe recipe = new Recipe();
		try{
			recipe.setAmtChocolate("2");
			recipe.setAmtCoffee("2");
			recipe.setAmtMilk("2");
			recipe.setAmtSugar("2");
		}catch(RecipeException e){
			e.printStackTrace();
		}

		assertTrue(inventory.useIngredients(recipe));
		assertEquals(13, inventory.getCoffee());
		assertEquals(13, inventory.getSugar());
		assertEquals(13, inventory.getMilk());
		assertEquals(13, inventory.getChocolate());
	}

}
