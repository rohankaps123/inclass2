1. What fault did you identify in the Inventory class? Make sure that you provide and reference a fault-triggering test.

There are two faults in the Inventory class. The first fault is within the useIngredients() methods in Inventory class.
After we call useIngredients(), the amount of coffee should be decremented. However, the source code contains a logical
error and increments the amount of coffe instead.

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

The second fault is within addSugar() method in Inventory class. The addSugar method is only adding negative amount of sugar
instead of positive amount. Hence, RecipeException will be thrown when a positive amount of sugar is passed into the method.

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

2. Consider the faulty method that you identified, do the generated tests for this method pass or fail? Briefly explain why.

3. What parts of the Inventory class are not covered by the generated tests? Briefly explain why these parts are challenging.

4. How do the generated test suites differ from your manually written one, in particular w.r.t. the following:
  generation time
  number of test cases
  average test case length
  readability of test cases
  correctness and usefulness
  maintainability of test cases
