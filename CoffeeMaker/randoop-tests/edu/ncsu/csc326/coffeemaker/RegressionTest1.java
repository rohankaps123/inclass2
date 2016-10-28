package edu.ncsu.csc326.coffeemaker;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    int i10 = inventory0.getCoffee();
    int i11 = inventory0.getChocolate();
    inventory0.setCoffee((int)' ');
    int i14 = inventory0.getCoffee();
    inventory0.setChocolate(32);
    int i17 = inventory0.getMilk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 15);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array4 = recipeBook0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array4);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    boolean b10 = recipeBook0.addRecipe(recipe7);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker11 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str14 = coffeeMaker11.editRecipe(0, recipe13);
    edu.ncsu.csc326.coffeemaker.Inventory inventory15 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i16 = inventory15.getMilk();
    int i17 = inventory15.getCoffee();
    inventory15.setChocolate((int)(byte)-1);
    inventory15.setCoffee((int)(byte)10);
    int i22 = inventory15.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = inventory15.useIngredients(recipe23);
    boolean b25 = coffeeMaker11.addRecipe(recipe23);
    java.lang.String str26 = coffeeMaker11.checkInventory();
    java.lang.String str27 = coffeeMaker11.checkInventory();
    edu.ncsu.csc326.coffeemaker.Inventory inventory28 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i29 = inventory28.getMilk();
    int i30 = inventory28.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook31 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str33 = recipeBook31.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe34 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b35 = recipeBook31.addRecipe(recipe34);
    int i36 = recipe34.getAmtCoffee();
    boolean b37 = inventory28.useIngredients(recipe34);
    int i38 = recipe34.getPrice();
    boolean b39 = coffeeMaker11.addRecipe(recipe34);
    boolean b40 = recipe7.equals((java.lang.Object)recipe34);
    // The following exception was thrown during execution in test generation
    try {
    recipe7.setAmtCoffee("Coffee: 32\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str26.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str27.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException1 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("Coffee: 1\nMilk: 15\nSugar: 15\nChocolate: 15\n");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory5.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook8 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str10 = recipeBook8.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe11 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b12 = recipeBook8.addRecipe(recipe11);
    int i13 = recipe11.getAmtCoffee();
    int i14 = recipe11.getAmtCoffee();
    boolean b15 = inventory5.useIngredients(recipe11);
    java.lang.String str16 = recipe11.getName();
    java.lang.String str17 = recipeBook0.editRecipe((int)(short)0, recipe11);
    edu.ncsu.csc326.coffeemaker.Inventory inventory19 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i20 = inventory19.getMilk();
    int i21 = inventory19.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook22 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str24 = recipeBook22.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b26 = recipeBook22.addRecipe(recipe25);
    int i27 = recipe25.getAmtCoffee();
    boolean b28 = inventory19.useIngredients(recipe25);
    int i29 = inventory19.getChocolate();
    java.lang.String str30 = inventory19.toString();
    int i31 = inventory19.getSugar();
    edu.ncsu.csc326.coffeemaker.Inventory inventory32 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory32.setMilk((-1));
    int i35 = inventory32.getMilk();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker36 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe37 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i38 = recipe37.getPrice();
    int i39 = recipe37.getAmtChocolate();
    int i40 = recipe37.getAmtCoffee();
    boolean b41 = coffeeMaker36.addRecipe(recipe37);
    recipe37.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    boolean b44 = inventory32.useIngredients(recipe37);
    boolean b45 = inventory19.useIngredients(recipe37);
    java.lang.String str46 = recipe37.getName();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str47 = recipeBook0.editRecipe(100, recipe37);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str30.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str46.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook29 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory30 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory30.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook33 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str35 = recipeBook33.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b37 = recipeBook33.addRecipe(recipe36);
    int i38 = recipe36.getAmtCoffee();
    int i39 = recipe36.getAmtCoffee();
    boolean b40 = inventory30.useIngredients(recipe36);
    java.lang.String str41 = recipe36.getName();
    boolean b42 = recipeBook29.addRecipe(recipe36);
    int i43 = recipe36.getAmtSugar();
    boolean b44 = coffeeMaker0.addRecipe(recipe36);
    edu.ncsu.csc326.coffeemaker.Recipe recipe46 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i47 = recipe46.getPrice();
    int i48 = recipe46.getAmtChocolate();
    java.lang.String str49 = coffeeMaker0.editRecipe((int)(byte)0, recipe46);
    // The following exception was thrown during execution in test generation
    try {
    recipe46.setAmtCoffee("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe4 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i5 = recipe4.getPrice();
    int i6 = recipe4.getAmtChocolate();
    java.lang.String str7 = recipeBook0.editRecipe(0, recipe4);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array8 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array9 = recipeBook0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array9);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    int i10 = recipe7.getAmtCoffee();
    boolean b11 = recipeBook0.addRecipe(recipe7);
    recipe7.setName("hi!");
    recipe7.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    // The following exception was thrown during execution in test generation
    try {
    recipe7.setAmtSugar("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    int i10 = inventory0.getCoffee();
    int i11 = inventory0.getChocolate();
    int i12 = inventory0.getMilk();
    java.lang.String str13 = inventory0.toString();
    inventory0.setSugar(15);
    int i16 = inventory0.getCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str13.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    int i23 = recipe17.getAmtChocolate();
    int i24 = recipe17.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory25 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i26 = inventory25.getMilk();
    int i27 = inventory25.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook28 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str30 = recipeBook28.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b32 = recipeBook28.addRecipe(recipe31);
    int i33 = recipe31.getAmtCoffee();
    boolean b34 = inventory25.useIngredients(recipe31);
    int i35 = recipe31.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory36 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i37 = inventory36.getMilk();
    int i38 = inventory36.getCoffee();
    inventory36.setChocolate((int)(byte)-1);
    inventory36.setCoffee((int)(byte)10);
    int i43 = inventory36.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe44 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b45 = inventory36.useIngredients(recipe44);
    int i46 = inventory36.getCoffee();
    int i47 = inventory36.getChocolate();
    inventory36.setCoffee((int)' ');
    int i50 = inventory36.getCoffee();
    boolean b51 = recipe31.equals((java.lang.Object)inventory36);
    boolean b52 = recipe17.equals((java.lang.Object)b51);
    java.lang.String str53 = recipe17.getName();
    java.lang.String str54 = recipe17.toString();
    // The following exception was thrown during execution in test generation
    try {
    recipe17.setAmtSugar("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: ");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setCoffee((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker5 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str8 = coffeeMaker5.editRecipe(0, recipe7);
    edu.ncsu.csc326.coffeemaker.Inventory inventory9 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i10 = inventory9.getMilk();
    int i11 = inventory9.getCoffee();
    inventory9.setChocolate((int)(byte)-1);
    inventory9.setCoffee((int)(byte)10);
    int i16 = inventory9.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b18 = inventory9.useIngredients(recipe17);
    boolean b19 = coffeeMaker5.addRecipe(recipe17);
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i22 = recipe21.getPrice();
    int i23 = recipe21.getAmtChocolate();
    java.lang.String str24 = coffeeMaker5.editRecipe(0, recipe21);
    java.lang.String str25 = coffeeMaker5.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array26 = coffeeMaker5.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory27 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i28 = inventory27.getMilk();
    int i29 = inventory27.getCoffee();
    int i30 = inventory27.getMilk();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook31 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str33 = recipeBook31.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe34 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b35 = recipeBook31.addRecipe(recipe34);
    int i36 = recipe34.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory37 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i38 = inventory37.getMilk();
    int i39 = inventory37.getCoffee();
    inventory37.setChocolate((int)(byte)-1);
    int i42 = inventory37.getChocolate();
    boolean b43 = recipe34.equals((java.lang.Object)inventory37);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook44 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str46 = recipeBook44.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook47 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory48 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory48.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook51 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str53 = recipeBook51.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe54 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b55 = recipeBook51.addRecipe(recipe54);
    int i56 = recipe54.getAmtCoffee();
    int i57 = recipe54.getAmtCoffee();
    boolean b58 = inventory48.useIngredients(recipe54);
    java.lang.String str59 = recipe54.getName();
    boolean b60 = recipeBook47.addRecipe(recipe54);
    boolean b61 = recipeBook44.addRecipe(recipe54);
    boolean b62 = inventory37.useIngredients(recipe54);
    boolean b63 = inventory27.useIngredients(recipe54);
    boolean b64 = coffeeMaker5.addRecipe(recipe54);
    boolean b65 = inventory0.useIngredients(recipe54);
    inventory0.setSugar((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str25.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    int i35 = coffeeMaker0.makeCoffee((int)(byte)0, 0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array36 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array37 = coffeeMaker0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array37);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array20 = coffeeMaker0.getRecipes();
    java.lang.String str22 = coffeeMaker0.deleteRecipe((int)(short)1);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array23 = coffeeMaker0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array23);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array15 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory17.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = inventory17.useIngredients(recipe23);
    java.lang.String str28 = recipe23.getName();
    boolean b29 = recipeBook16.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker30 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker31 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe33 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str34 = coffeeMaker31.editRecipe(0, recipe33);
    edu.ncsu.csc326.coffeemaker.Inventory inventory35 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i36 = inventory35.getMilk();
    int i37 = inventory35.getCoffee();
    inventory35.setChocolate((int)(byte)-1);
    inventory35.setCoffee((int)(byte)10);
    int i42 = inventory35.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe43 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b44 = inventory35.useIngredients(recipe43);
    boolean b45 = coffeeMaker31.addRecipe(recipe43);
    edu.ncsu.csc326.coffeemaker.Recipe recipe47 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i48 = recipe47.getPrice();
    int i49 = recipe47.getAmtChocolate();
    java.lang.String str50 = coffeeMaker31.editRecipe(0, recipe47);
    boolean b51 = coffeeMaker30.addRecipe(recipe47);
    int i52 = recipe47.getAmtSugar();
    java.lang.String str53 = recipe47.toString();
    int i54 = recipe47.getAmtCoffee();
    boolean b55 = recipeBook16.addRecipe(recipe47);
    boolean b56 = coffeeMaker0.addRecipe(recipe47);
    edu.ncsu.csc326.coffeemaker.Recipe recipe58 = null;
    java.lang.String str59 = coffeeMaker0.editRecipe((int)(byte)1, recipe58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str59);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe1 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i2 = recipe1.getPrice();
    int i3 = recipe1.getAmtChocolate();
    int i4 = recipe1.getAmtCoffee();
    boolean b5 = coffeeMaker0.addRecipe(recipe1);
    recipe1.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    // The following exception was thrown during execution in test generation
    try {
    recipe1.setAmtSugar("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    int i35 = coffeeMaker0.makeCoffee((int)(byte)0, 0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook36 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str38 = recipeBook36.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe39 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b40 = recipeBook36.addRecipe(recipe39);
    recipe39.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    boolean b43 = coffeeMaker0.addRecipe(recipe39);
    // The following exception was thrown during execution in test generation
    try {
    int i46 = coffeeMaker0.makeCoffee((int)'#', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook29 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory30 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory30.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook33 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str35 = recipeBook33.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b37 = recipeBook33.addRecipe(recipe36);
    int i38 = recipe36.getAmtCoffee();
    int i39 = recipe36.getAmtCoffee();
    boolean b40 = inventory30.useIngredients(recipe36);
    java.lang.String str41 = recipe36.getName();
    boolean b42 = recipeBook29.addRecipe(recipe36);
    int i43 = recipe36.getAmtSugar();
    boolean b44 = coffeeMaker0.addRecipe(recipe36);
    java.lang.String str45 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook46 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str48 = recipeBook46.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array49 = recipeBook46.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe recipe50 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b51 = recipeBook46.addRecipe(recipe50);
    int i52 = recipe50.getAmtChocolate();
    boolean b53 = coffeeMaker0.addRecipe(recipe50);
    // The following exception was thrown during execution in test generation
    try {
    int i56 = coffeeMaker0.makeCoffee(10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str45.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory1 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory1.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    int i10 = recipe7.getAmtCoffee();
    boolean b11 = inventory1.useIngredients(recipe7);
    java.lang.String str12 = recipe7.getName();
    boolean b13 = recipeBook0.addRecipe(recipe7);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker14 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker15 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str18 = coffeeMaker15.editRecipe(0, recipe17);
    edu.ncsu.csc326.coffeemaker.Inventory inventory19 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i20 = inventory19.getMilk();
    int i21 = inventory19.getCoffee();
    inventory19.setChocolate((int)(byte)-1);
    inventory19.setCoffee((int)(byte)10);
    int i26 = inventory19.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe27 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b28 = inventory19.useIngredients(recipe27);
    boolean b29 = coffeeMaker15.addRecipe(recipe27);
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i32 = recipe31.getPrice();
    int i33 = recipe31.getAmtChocolate();
    java.lang.String str34 = coffeeMaker15.editRecipe(0, recipe31);
    boolean b35 = coffeeMaker14.addRecipe(recipe31);
    int i36 = recipe31.getAmtSugar();
    java.lang.String str37 = recipe31.toString();
    int i38 = recipe31.getAmtCoffee();
    boolean b39 = recipeBook0.addRecipe(recipe31);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker40 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe42 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str43 = coffeeMaker40.editRecipe(0, recipe42);
    edu.ncsu.csc326.coffeemaker.Inventory inventory44 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i45 = inventory44.getMilk();
    int i46 = inventory44.getCoffee();
    inventory44.setChocolate((int)(byte)-1);
    inventory44.setCoffee((int)(byte)10);
    int i51 = inventory44.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe52 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b53 = inventory44.useIngredients(recipe52);
    boolean b54 = coffeeMaker40.addRecipe(recipe52);
    edu.ncsu.csc326.coffeemaker.Recipe recipe56 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i57 = recipe56.getPrice();
    int i58 = recipe56.getAmtChocolate();
    java.lang.String str59 = coffeeMaker40.editRecipe(0, recipe56);
    java.lang.String str60 = coffeeMaker40.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array61 = coffeeMaker40.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array62 = coffeeMaker40.getRecipes();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker63 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe65 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str66 = coffeeMaker63.editRecipe(0, recipe65);
    boolean b67 = coffeeMaker40.addRecipe(recipe65);
    boolean b68 = recipeBook0.addRecipe(recipe65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str60.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    recipe17.setName("");
    boolean b26 = recipe17.equals((java.lang.Object)(-1));
    int i27 = recipe17.getAmtChocolate();
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException29 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    java.lang.Throwable[] throwable_array30 = inventoryException29.getSuppressed();
    boolean b31 = recipe17.equals((java.lang.Object)inventoryException29);
    java.lang.String str32 = inventoryException29.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: "+ "'", str32.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: "));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    java.lang.String str22 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i24 = recipe23.getPrice();
    java.lang.String str25 = recipe23.toString();
    int i26 = recipe23.getPrice();
    int i27 = recipe23.getAmtChocolate();
    java.lang.String str28 = recipe23.toString();
    boolean b29 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array30 = coffeeMaker0.getRecipes();
    java.lang.String str31 = coffeeMaker0.checkInventory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str22.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str31.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getSugar();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker3 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe5 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str6 = coffeeMaker3.editRecipe(0, recipe5);
    edu.ncsu.csc326.coffeemaker.Inventory inventory7 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i8 = inventory7.getMilk();
    int i9 = inventory7.getCoffee();
    inventory7.setChocolate((int)(byte)-1);
    inventory7.setCoffee((int)(byte)10);
    int i14 = inventory7.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b16 = inventory7.useIngredients(recipe15);
    boolean b17 = coffeeMaker3.addRecipe(recipe15);
    java.lang.String str18 = coffeeMaker3.checkInventory();
    java.lang.String str19 = coffeeMaker3.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory21 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory21.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook24 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str26 = recipeBook24.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe27 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b28 = recipeBook24.addRecipe(recipe27);
    int i29 = recipe27.getAmtCoffee();
    int i30 = recipe27.getAmtCoffee();
    boolean b31 = inventory21.useIngredients(recipe27);
    java.lang.String str32 = recipe27.getName();
    boolean b33 = recipeBook20.addRecipe(recipe27);
    boolean b34 = coffeeMaker3.addRecipe(recipe27);
    recipe27.setName("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
    boolean b37 = inventory0.useIngredients(recipe27);
    inventory0.setChocolate((int)(short)100);
    inventory0.setSugar(15);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str18.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str19.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addCoffee("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    inventory0.setMilk(10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker12 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker13 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str16 = coffeeMaker13.editRecipe(0, recipe15);
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i18 = inventory17.getMilk();
    int i19 = inventory17.getCoffee();
    inventory17.setChocolate((int)(byte)-1);
    inventory17.setCoffee((int)(byte)10);
    int i24 = inventory17.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b26 = inventory17.useIngredients(recipe25);
    boolean b27 = coffeeMaker13.addRecipe(recipe25);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i30 = recipe29.getPrice();
    int i31 = recipe29.getAmtChocolate();
    java.lang.String str32 = coffeeMaker13.editRecipe(0, recipe29);
    boolean b33 = coffeeMaker12.addRecipe(recipe29);
    int i34 = recipe29.getAmtSugar();
    int i35 = recipe29.getAmtSugar();
    boolean b36 = inventory0.useIngredients(recipe29);
    int i37 = inventory0.getSugar();
    java.lang.String str38 = inventory0.toString();
    edu.ncsu.csc326.coffeemaker.Inventory inventory39 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i40 = inventory39.getMilk();
    int i41 = inventory39.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook42 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str44 = recipeBook42.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe45 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b46 = recipeBook42.addRecipe(recipe45);
    int i47 = recipe45.getAmtCoffee();
    boolean b48 = inventory39.useIngredients(recipe45);
    int i49 = inventory39.getChocolate();
    java.lang.String str50 = inventory39.toString();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook51 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str53 = recipeBook51.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe54 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b55 = recipeBook51.addRecipe(recipe54);
    int i56 = recipe54.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory57 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i58 = inventory57.getMilk();
    int i59 = inventory57.getCoffee();
    inventory57.setChocolate((int)(byte)-1);
    int i62 = inventory57.getChocolate();
    boolean b63 = recipe54.equals((java.lang.Object)inventory57);
    boolean b64 = inventory39.useIngredients(recipe54);
    boolean b65 = inventory0.useIngredients(recipe54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str38.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str50.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setChocolate(100);
    inventory0.setMilk((int)(byte)1);
    inventory0.setChocolate((-1));
    inventory0.setCoffee((int)(short)1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = inventory0.getChocolate();
    java.lang.String str11 = inventory0.toString();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook12 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str14 = recipeBook12.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b16 = recipeBook12.addRecipe(recipe15);
    int i17 = recipe15.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory18 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i19 = inventory18.getMilk();
    int i20 = inventory18.getCoffee();
    inventory18.setChocolate((int)(byte)-1);
    int i23 = inventory18.getChocolate();
    boolean b24 = recipe15.equals((java.lang.Object)inventory18);
    boolean b25 = inventory0.useIngredients(recipe15);
    int i26 = recipe15.getAmtChocolate();
    // The following exception was thrown during execution in test generation
    try {
    recipe15.setPrice("Coffee: 32\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = inventory0.getChocolate();
    java.lang.String str11 = inventory0.toString();
    int i12 = inventory0.getCoffee();
    inventory0.setCoffee((int)'4');
    inventory0.setMilk(10);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException1 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException3 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("hi!");
    java.lang.Throwable[] throwable_array4 = recipeException3.getSuppressed();
    inventoryException1.addSuppressed((java.lang.Throwable)recipeException3);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException7 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.Throwable[] throwable_array8 = inventoryException7.getSuppressed();
    recipeException3.addSuppressed((java.lang.Throwable)inventoryException7);
    java.lang.String str10 = inventoryException7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str10.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setMilk((-1));
    inventory0.setSugar((-1));
    inventory0.setChocolate((int)(byte)0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = inventory0.getChocolate();
    java.lang.String str11 = inventory0.toString();
    int i12 = inventory0.getCoffee();
    java.lang.String str13 = inventory0.toString();
    int i14 = inventory0.getChocolate();
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("Coffee: 1\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str13.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 15);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory4.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook7 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str9 = recipeBook7.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe10 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b11 = recipeBook7.addRecipe(recipe10);
    int i12 = recipe10.getAmtCoffee();
    int i13 = recipe10.getAmtCoffee();
    boolean b14 = inventory4.useIngredients(recipe10);
    java.lang.String str15 = recipe10.getName();
    boolean b16 = recipeBook3.addRecipe(recipe10);
    boolean b17 = recipeBook0.addRecipe(recipe10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker18 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker19 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str22 = coffeeMaker19.editRecipe(0, recipe21);
    edu.ncsu.csc326.coffeemaker.Inventory inventory23 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i24 = inventory23.getMilk();
    int i25 = inventory23.getCoffee();
    inventory23.setChocolate((int)(byte)-1);
    inventory23.setCoffee((int)(byte)10);
    int i30 = inventory23.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b32 = inventory23.useIngredients(recipe31);
    boolean b33 = coffeeMaker19.addRecipe(recipe31);
    edu.ncsu.csc326.coffeemaker.Recipe recipe35 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i36 = recipe35.getPrice();
    int i37 = recipe35.getAmtChocolate();
    java.lang.String str38 = coffeeMaker19.editRecipe(0, recipe35);
    boolean b39 = coffeeMaker18.addRecipe(recipe35);
    int i40 = recipe35.getAmtSugar();
    recipe35.setName("");
    boolean b44 = recipe35.equals((java.lang.Object)(-1));
    boolean b45 = recipeBook0.addRecipe(recipe35);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook46 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str48 = recipeBook46.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe49 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b50 = recipeBook46.addRecipe(recipe49);
    recipe49.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    boolean b53 = recipeBook0.addRecipe(recipe49);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook54 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str56 = recipeBook54.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe57 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b58 = recipeBook54.addRecipe(recipe57);
    java.lang.String str59 = recipe57.getName();
    boolean b60 = recipeBook0.addRecipe(recipe57);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array61 = recipeBook0.getRecipes();
    java.lang.String str63 = recipeBook0.deleteRecipe((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str63.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe recipe4 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b5 = recipeBook0.addRecipe(recipe4);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array6 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array7 = recipeBook0.getRecipes();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = recipeBook0.deleteRecipe((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array7);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe1 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i2 = recipe1.getPrice();
    int i3 = recipe1.getAmtChocolate();
    int i4 = recipe1.getAmtCoffee();
    boolean b5 = coffeeMaker0.addRecipe(recipe1);
    // The following exception was thrown during execution in test generation
    try {
    coffeeMaker0.addInventory("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n", "edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!", "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", "edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    int i5 = inventory0.getChocolate();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker6 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker7 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe9 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str10 = coffeeMaker7.editRecipe(0, recipe9);
    edu.ncsu.csc326.coffeemaker.Inventory inventory11 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i12 = inventory11.getMilk();
    int i13 = inventory11.getCoffee();
    inventory11.setChocolate((int)(byte)-1);
    inventory11.setCoffee((int)(byte)10);
    int i18 = inventory11.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe19 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b20 = inventory11.useIngredients(recipe19);
    boolean b21 = coffeeMaker7.addRecipe(recipe19);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i24 = recipe23.getPrice();
    int i25 = recipe23.getAmtChocolate();
    java.lang.String str26 = coffeeMaker7.editRecipe(0, recipe23);
    boolean b27 = coffeeMaker6.addRecipe(recipe23);
    int i28 = recipe23.getAmtSugar();
    boolean b29 = inventory0.useIngredients(recipe23);
    int i30 = recipe23.getAmtSugar();
    int i31 = recipe23.getAmtSugar();
    recipe23.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    java.lang.String str20 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array21 = coffeeMaker0.getRecipes();
    // The following exception was thrown during execution in test generation
    try {
    int i24 = coffeeMaker0.makeCoffee((int)(byte)100, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array21);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    recipe3.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    int i7 = recipe3.getPrice();
    int i8 = recipe3.getAmtChocolate();
    java.lang.String str9 = recipe3.getName();
    java.lang.String str10 = recipe3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str9.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str10.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setMilk((-1));
    inventory0.setSugar(100);
    inventory0.setCoffee(0);
    int i7 = inventory0.getChocolate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory1 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory1.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    int i10 = recipe7.getAmtCoffee();
    boolean b11 = inventory1.useIngredients(recipe7);
    java.lang.String str12 = recipe7.getName();
    boolean b13 = recipeBook0.addRecipe(recipe7);
    int i14 = recipe7.getAmtChocolate();
    java.lang.String str15 = recipe7.toString();
    java.lang.String str16 = recipe7.getName();
    int i17 = recipe7.getAmtMilk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory4.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook7 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str9 = recipeBook7.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe10 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b11 = recipeBook7.addRecipe(recipe10);
    int i12 = recipe10.getAmtCoffee();
    int i13 = recipe10.getAmtCoffee();
    boolean b14 = inventory4.useIngredients(recipe10);
    java.lang.String str15 = recipe10.getName();
    boolean b16 = recipeBook3.addRecipe(recipe10);
    boolean b17 = recipeBook0.addRecipe(recipe10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker18 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker19 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str22 = coffeeMaker19.editRecipe(0, recipe21);
    edu.ncsu.csc326.coffeemaker.Inventory inventory23 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i24 = inventory23.getMilk();
    int i25 = inventory23.getCoffee();
    inventory23.setChocolate((int)(byte)-1);
    inventory23.setCoffee((int)(byte)10);
    int i30 = inventory23.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b32 = inventory23.useIngredients(recipe31);
    boolean b33 = coffeeMaker19.addRecipe(recipe31);
    edu.ncsu.csc326.coffeemaker.Recipe recipe35 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i36 = recipe35.getPrice();
    int i37 = recipe35.getAmtChocolate();
    java.lang.String str38 = coffeeMaker19.editRecipe(0, recipe35);
    boolean b39 = coffeeMaker18.addRecipe(recipe35);
    int i40 = recipe35.getAmtSugar();
    recipe35.setName("");
    boolean b44 = recipe35.equals((java.lang.Object)(-1));
    boolean b45 = recipeBook0.addRecipe(recipe35);
    int i46 = recipe35.getAmtCoffee();
    int i47 = recipe35.getAmtMilk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    java.lang.String str22 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i24 = recipe23.getPrice();
    java.lang.String str25 = recipe23.toString();
    int i26 = recipe23.getPrice();
    int i27 = recipe23.getAmtChocolate();
    java.lang.String str28 = recipe23.toString();
    boolean b29 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array30 = coffeeMaker0.getRecipes();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = coffeeMaker0.deleteRecipe(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str22.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array30);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setMilk((-1));
    int i3 = inventory0.getMilk();
    int i4 = inventory0.getChocolate();
    int i5 = inventory0.getMilk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    int i3 = inventory0.getMilk();
    int i4 = inventory0.getCoffee();
    java.lang.String str5 = inventory0.toString();
    int i6 = inventory0.getChocolate();
    inventory0.setChocolate((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str5.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    inventory0.setMilk(10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker12 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker13 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str16 = coffeeMaker13.editRecipe(0, recipe15);
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i18 = inventory17.getMilk();
    int i19 = inventory17.getCoffee();
    inventory17.setChocolate((int)(byte)-1);
    inventory17.setCoffee((int)(byte)10);
    int i24 = inventory17.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b26 = inventory17.useIngredients(recipe25);
    boolean b27 = coffeeMaker13.addRecipe(recipe25);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i30 = recipe29.getPrice();
    int i31 = recipe29.getAmtChocolate();
    java.lang.String str32 = coffeeMaker13.editRecipe(0, recipe29);
    boolean b33 = coffeeMaker12.addRecipe(recipe29);
    int i34 = recipe29.getAmtSugar();
    int i35 = recipe29.getAmtSugar();
    boolean b36 = inventory0.useIngredients(recipe29);
    recipe29.setName("");
    int i39 = recipe29.getPrice();
    // The following exception was thrown during execution in test generation
    try {
    recipe29.setAmtChocolate("Coffee: 1\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    int i10 = recipe7.getAmtCoffee();
    boolean b11 = recipeBook0.addRecipe(recipe7);
    recipe7.setName("hi!");
    java.lang.String str14 = recipe7.getName();
    // The following exception was thrown during execution in test generation
    try {
    recipe7.setAmtCoffee("");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    inventory0.setCoffee(1);
    inventory0.setCoffee((int)(byte)10);
    int i15 = inventory0.getMilk();
    inventory0.setChocolate((int)(short)10);
    inventory0.setChocolate((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addCoffee("Coffee: 32\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 15);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory4.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook7 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str9 = recipeBook7.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe10 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b11 = recipeBook7.addRecipe(recipe10);
    int i12 = recipe10.getAmtCoffee();
    int i13 = recipe10.getAmtCoffee();
    boolean b14 = inventory4.useIngredients(recipe10);
    java.lang.String str15 = recipe10.getName();
    boolean b16 = recipeBook3.addRecipe(recipe10);
    boolean b17 = recipeBook0.addRecipe(recipe10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker18 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker19 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str22 = coffeeMaker19.editRecipe(0, recipe21);
    edu.ncsu.csc326.coffeemaker.Inventory inventory23 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i24 = inventory23.getMilk();
    int i25 = inventory23.getCoffee();
    inventory23.setChocolate((int)(byte)-1);
    inventory23.setCoffee((int)(byte)10);
    int i30 = inventory23.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b32 = inventory23.useIngredients(recipe31);
    boolean b33 = coffeeMaker19.addRecipe(recipe31);
    edu.ncsu.csc326.coffeemaker.Recipe recipe35 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i36 = recipe35.getPrice();
    int i37 = recipe35.getAmtChocolate();
    java.lang.String str38 = coffeeMaker19.editRecipe(0, recipe35);
    boolean b39 = coffeeMaker18.addRecipe(recipe35);
    int i40 = recipe35.getAmtSugar();
    recipe35.setName("");
    boolean b44 = recipe35.equals((java.lang.Object)(-1));
    boolean b45 = recipeBook0.addRecipe(recipe35);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook46 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str48 = recipeBook46.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe49 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b50 = recipeBook46.addRecipe(recipe49);
    recipe49.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    boolean b53 = recipeBook0.addRecipe(recipe49);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook54 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str56 = recipeBook54.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe57 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b58 = recipeBook54.addRecipe(recipe57);
    java.lang.String str59 = recipe57.getName();
    boolean b60 = recipeBook0.addRecipe(recipe57);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array61 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook62 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str64 = recipeBook62.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array65 = recipeBook62.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory67 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory67.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook70 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str72 = recipeBook70.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe73 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b74 = recipeBook70.addRecipe(recipe73);
    int i75 = recipe73.getAmtCoffee();
    int i76 = recipe73.getAmtCoffee();
    boolean b77 = inventory67.useIngredients(recipe73);
    java.lang.String str78 = recipe73.getName();
    java.lang.String str79 = recipeBook62.editRecipe((int)(short)0, recipe73);
    int i80 = recipe73.getAmtMilk();
    boolean b81 = recipeBook0.addRecipe(recipe73);
    edu.ncsu.csc326.coffeemaker.Inventory inventory82 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i83 = inventory82.getMilk();
    int i84 = inventory82.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook85 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str87 = recipeBook85.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe88 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b89 = recipeBook85.addRecipe(recipe88);
    int i90 = recipe88.getAmtCoffee();
    boolean b91 = inventory82.useIngredients(recipe88);
    int i92 = recipe88.getAmtCoffee();
    java.lang.String str93 = recipe88.toString();
    boolean b94 = recipeBook0.addRecipe(recipe88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + ""+ "'", str78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + ""+ "'", str93.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    java.lang.String str20 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array21 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory22 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i23 = inventory22.getMilk();
    int i24 = inventory22.getCoffee();
    int i25 = inventory22.getMilk();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook26 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str28 = recipeBook26.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b30 = recipeBook26.addRecipe(recipe29);
    int i31 = recipe29.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory32 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i33 = inventory32.getMilk();
    int i34 = inventory32.getCoffee();
    inventory32.setChocolate((int)(byte)-1);
    int i37 = inventory32.getChocolate();
    boolean b38 = recipe29.equals((java.lang.Object)inventory32);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook39 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str41 = recipeBook39.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook42 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory43 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory43.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook46 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str48 = recipeBook46.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe49 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b50 = recipeBook46.addRecipe(recipe49);
    int i51 = recipe49.getAmtCoffee();
    int i52 = recipe49.getAmtCoffee();
    boolean b53 = inventory43.useIngredients(recipe49);
    java.lang.String str54 = recipe49.getName();
    boolean b55 = recipeBook42.addRecipe(recipe49);
    boolean b56 = recipeBook39.addRecipe(recipe49);
    boolean b57 = inventory32.useIngredients(recipe49);
    boolean b58 = inventory22.useIngredients(recipe49);
    boolean b59 = coffeeMaker0.addRecipe(recipe49);
    recipe49.setName("");
    // The following exception was thrown during execution in test generation
    try {
    recipe49.setPrice("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    inventory0.setMilk(10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker12 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker13 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str16 = coffeeMaker13.editRecipe(0, recipe15);
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i18 = inventory17.getMilk();
    int i19 = inventory17.getCoffee();
    inventory17.setChocolate((int)(byte)-1);
    inventory17.setCoffee((int)(byte)10);
    int i24 = inventory17.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b26 = inventory17.useIngredients(recipe25);
    boolean b27 = coffeeMaker13.addRecipe(recipe25);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i30 = recipe29.getPrice();
    int i31 = recipe29.getAmtChocolate();
    java.lang.String str32 = coffeeMaker13.editRecipe(0, recipe29);
    boolean b33 = coffeeMaker12.addRecipe(recipe29);
    int i34 = recipe29.getAmtSugar();
    int i35 = recipe29.getAmtSugar();
    boolean b36 = inventory0.useIngredients(recipe29);
    int i37 = inventory0.getSugar();
    java.lang.String str38 = inventory0.toString();
    java.lang.String str39 = inventory0.toString();
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: ");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str38.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str39.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setChocolate(100);
    inventory0.setMilk((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addCoffee("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    int i5 = inventory0.getChocolate();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker6 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker7 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe9 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str10 = coffeeMaker7.editRecipe(0, recipe9);
    edu.ncsu.csc326.coffeemaker.Inventory inventory11 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i12 = inventory11.getMilk();
    int i13 = inventory11.getCoffee();
    inventory11.setChocolate((int)(byte)-1);
    inventory11.setCoffee((int)(byte)10);
    int i18 = inventory11.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe19 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b20 = inventory11.useIngredients(recipe19);
    boolean b21 = coffeeMaker7.addRecipe(recipe19);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i24 = recipe23.getPrice();
    int i25 = recipe23.getAmtChocolate();
    java.lang.String str26 = coffeeMaker7.editRecipe(0, recipe23);
    boolean b27 = coffeeMaker6.addRecipe(recipe23);
    int i28 = recipe23.getAmtSugar();
    boolean b29 = inventory0.useIngredients(recipe23);
    int i30 = recipe23.getAmtMilk();
    // The following exception was thrown during execution in test generation
    try {
    recipe23.setPrice("hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    edu.ncsu.csc326.coffeemaker.Recipe recipe0 = new edu.ncsu.csc326.coffeemaker.Recipe();
    // The following exception was thrown during execution in test generation
    try {
    recipe0.setPrice("");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    int i13 = recipe3.getAmtCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array5 = recipeBook0.getRecipes();
    java.lang.String str7 = recipeBook0.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.Inventory inventory8 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i9 = inventory8.getMilk();
    int i10 = inventory8.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook11 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str13 = recipeBook11.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe14 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b15 = recipeBook11.addRecipe(recipe14);
    int i16 = recipe14.getAmtCoffee();
    boolean b17 = inventory8.useIngredients(recipe14);
    int i18 = recipe14.getAmtCoffee();
    boolean b19 = recipeBook0.addRecipe(recipe14);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array20 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker21 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker22 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe24 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str25 = coffeeMaker22.editRecipe(0, recipe24);
    edu.ncsu.csc326.coffeemaker.Inventory inventory26 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i27 = inventory26.getMilk();
    int i28 = inventory26.getCoffee();
    inventory26.setChocolate((int)(byte)-1);
    inventory26.setCoffee((int)(byte)10);
    int i33 = inventory26.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe34 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b35 = inventory26.useIngredients(recipe34);
    boolean b36 = coffeeMaker22.addRecipe(recipe34);
    edu.ncsu.csc326.coffeemaker.Recipe recipe38 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i39 = recipe38.getPrice();
    int i40 = recipe38.getAmtChocolate();
    java.lang.String str41 = coffeeMaker22.editRecipe(0, recipe38);
    boolean b42 = coffeeMaker21.addRecipe(recipe38);
    int i43 = recipe38.getAmtSugar();
    int i44 = recipe38.getAmtChocolate();
    int i45 = recipe38.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory46 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i47 = inventory46.getMilk();
    int i48 = inventory46.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook49 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str51 = recipeBook49.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe52 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b53 = recipeBook49.addRecipe(recipe52);
    int i54 = recipe52.getAmtCoffee();
    boolean b55 = inventory46.useIngredients(recipe52);
    int i56 = recipe52.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory57 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i58 = inventory57.getMilk();
    int i59 = inventory57.getCoffee();
    inventory57.setChocolate((int)(byte)-1);
    inventory57.setCoffee((int)(byte)10);
    int i64 = inventory57.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe65 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b66 = inventory57.useIngredients(recipe65);
    int i67 = inventory57.getCoffee();
    int i68 = inventory57.getChocolate();
    inventory57.setCoffee((int)' ');
    int i71 = inventory57.getCoffee();
    boolean b72 = recipe52.equals((java.lang.Object)inventory57);
    boolean b73 = recipe38.equals((java.lang.Object)b72);
    java.lang.String str74 = recipe38.getName();
    java.lang.String str75 = recipe38.toString();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook76 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str78 = recipeBook76.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe79 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b80 = recipeBook76.addRecipe(recipe79);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array81 = recipeBook76.getRecipes();
    java.lang.String str83 = recipeBook76.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook84 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str86 = recipeBook84.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe88 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i89 = recipe88.getPrice();
    int i90 = recipe88.getAmtChocolate();
    java.lang.String str91 = recipeBook84.editRecipe(0, recipe88);
    boolean b92 = recipeBook76.addRecipe(recipe88);
    boolean b93 = recipe38.equals((java.lang.Object)recipe88);
    boolean b94 = recipeBook0.addRecipe(recipe38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + ""+ "'", str74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + ""+ "'", str75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + ""+ "'", str83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    java.lang.String str20 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array21 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array22 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker23 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str26 = coffeeMaker23.editRecipe(0, recipe25);
    boolean b27 = coffeeMaker0.addRecipe(recipe25);
    java.lang.String str28 = recipe25.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook13 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str15 = recipeBook13.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory17.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = inventory17.useIngredients(recipe23);
    java.lang.String str28 = recipe23.getName();
    boolean b29 = recipeBook16.addRecipe(recipe23);
    boolean b30 = recipeBook13.addRecipe(recipe23);
    boolean b31 = inventory6.useIngredients(recipe23);
    int i32 = recipe23.getAmtCoffee();
    int i33 = recipe23.getAmtSugar();
    int i34 = recipe23.getAmtSugar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array33 = coffeeMaker0.getRecipes();
    java.lang.String str34 = coffeeMaker0.checkInventory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str34.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    edu.ncsu.csc326.coffeemaker.Recipe recipe0 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i1 = recipe0.getPrice();
    java.lang.String str2 = recipe0.toString();
    int i3 = recipe0.getPrice();
    int i4 = recipe0.getAmtChocolate();
    int i5 = recipe0.getAmtCoffee();
    // The following exception was thrown during execution in test generation
    try {
    recipe0.setAmtCoffee("");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    java.lang.String str3 = inventory0.toString();
    inventory0.setChocolate((-1));
    int i6 = inventory0.getCoffee();
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str3.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    java.lang.String str20 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array21 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory22 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i23 = inventory22.getMilk();
    int i24 = inventory22.getCoffee();
    int i25 = inventory22.getMilk();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook26 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str28 = recipeBook26.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b30 = recipeBook26.addRecipe(recipe29);
    int i31 = recipe29.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory32 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i33 = inventory32.getMilk();
    int i34 = inventory32.getCoffee();
    inventory32.setChocolate((int)(byte)-1);
    int i37 = inventory32.getChocolate();
    boolean b38 = recipe29.equals((java.lang.Object)inventory32);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook39 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str41 = recipeBook39.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook42 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory43 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory43.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook46 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str48 = recipeBook46.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe49 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b50 = recipeBook46.addRecipe(recipe49);
    int i51 = recipe49.getAmtCoffee();
    int i52 = recipe49.getAmtCoffee();
    boolean b53 = inventory43.useIngredients(recipe49);
    java.lang.String str54 = recipe49.getName();
    boolean b55 = recipeBook42.addRecipe(recipe49);
    boolean b56 = recipeBook39.addRecipe(recipe49);
    boolean b57 = inventory32.useIngredients(recipe49);
    boolean b58 = inventory22.useIngredients(recipe49);
    boolean b59 = coffeeMaker0.addRecipe(recipe49);
    edu.ncsu.csc326.coffeemaker.Inventory inventory60 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i61 = inventory60.getMilk();
    int i62 = inventory60.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook63 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str65 = recipeBook63.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe66 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b67 = recipeBook63.addRecipe(recipe66);
    int i68 = recipe66.getAmtCoffee();
    boolean b69 = inventory60.useIngredients(recipe66);
    int i70 = recipe66.getAmtCoffee();
    java.lang.String str71 = recipe66.toString();
    int i72 = recipe66.getPrice();
    boolean b73 = coffeeMaker0.addRecipe(recipe66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + ""+ "'", str71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i4 = recipe3.getPrice();
    int i5 = recipe3.getAmtChocolate();
    int i6 = recipe3.getAmtCoffee();
    int i7 = recipe3.getPrice();
    boolean b8 = inventory0.useIngredients(recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory9 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i10 = inventory9.getMilk();
    int i11 = inventory9.getCoffee();
    inventory9.setChocolate((int)(byte)-1);
    int i14 = inventory9.getChocolate();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker15 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker16 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe18 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str19 = coffeeMaker16.editRecipe(0, recipe18);
    edu.ncsu.csc326.coffeemaker.Inventory inventory20 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i21 = inventory20.getMilk();
    int i22 = inventory20.getCoffee();
    inventory20.setChocolate((int)(byte)-1);
    inventory20.setCoffee((int)(byte)10);
    int i27 = inventory20.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe28 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b29 = inventory20.useIngredients(recipe28);
    boolean b30 = coffeeMaker16.addRecipe(recipe28);
    edu.ncsu.csc326.coffeemaker.Recipe recipe32 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i33 = recipe32.getPrice();
    int i34 = recipe32.getAmtChocolate();
    java.lang.String str35 = coffeeMaker16.editRecipe(0, recipe32);
    boolean b36 = coffeeMaker15.addRecipe(recipe32);
    int i37 = recipe32.getAmtSugar();
    boolean b38 = inventory9.useIngredients(recipe32);
    int i39 = recipe32.getAmtSugar();
    boolean b40 = inventory0.useIngredients(recipe32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i4 = recipe3.getPrice();
    int i5 = recipe3.getAmtChocolate();
    int i6 = recipe3.getAmtCoffee();
    int i7 = recipe3.getPrice();
    boolean b8 = inventory0.useIngredients(recipe3);
    // The following exception was thrown during execution in test generation
    try {
    recipe3.setAmtCoffee("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    java.lang.String str33 = coffeeMaker0.checkInventory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str33.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    java.lang.String str10 = inventory0.toString();
    inventory0.setMilk((int)(short)0);
    inventory0.setCoffee((int)(short)10);
    int i15 = inventory0.getMilk();
    int i16 = inventory0.getSugar();
    int i17 = inventory0.getMilk();
    inventory0.setSugar((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    java.lang.String str10 = inventory0.toString();
    inventory0.setMilk((int)(short)0);
    inventory0.setMilk(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    java.lang.String str17 = coffeeMaker0.deleteRecipe((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    int i20 = coffeeMaker0.makeCoffee((-1), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Recipe recipe33 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i34 = recipe33.getPrice();
    java.lang.String str35 = recipe33.toString();
    boolean b36 = coffeeMaker0.addRecipe(recipe33);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array37 = coffeeMaker0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array37);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    int i23 = recipe17.getAmtChocolate();
    int i24 = recipe17.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory25 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i26 = inventory25.getMilk();
    int i27 = inventory25.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook28 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str30 = recipeBook28.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b32 = recipeBook28.addRecipe(recipe31);
    int i33 = recipe31.getAmtCoffee();
    boolean b34 = inventory25.useIngredients(recipe31);
    int i35 = recipe31.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory36 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i37 = inventory36.getMilk();
    int i38 = inventory36.getCoffee();
    inventory36.setChocolate((int)(byte)-1);
    inventory36.setCoffee((int)(byte)10);
    int i43 = inventory36.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe44 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b45 = inventory36.useIngredients(recipe44);
    int i46 = inventory36.getCoffee();
    int i47 = inventory36.getChocolate();
    inventory36.setCoffee((int)' ');
    int i50 = inventory36.getCoffee();
    boolean b51 = recipe31.equals((java.lang.Object)inventory36);
    boolean b52 = recipe17.equals((java.lang.Object)b51);
    int i53 = recipe17.getAmtSugar();
    // The following exception was thrown during execution in test generation
    try {
    recipe17.setAmtMilk("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException1 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException3 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.Throwable[] throwable_array4 = inventoryException3.getSuppressed();
    inventoryException1.addSuppressed((java.lang.Throwable)inventoryException3);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException7 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException9 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.String str10 = inventoryException9.toString();
    inventoryException7.addSuppressed((java.lang.Throwable)inventoryException9);
    inventoryException1.addSuppressed((java.lang.Throwable)inventoryException7);
    java.lang.String str13 = inventoryException7.toString();
    java.lang.Throwable[] throwable_array14 = inventoryException7.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str10.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: "+ "'", str13.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array14);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(short)1);
    int i5 = inventory0.getCoffee();
    int i6 = inventory0.getCoffee();
    int i7 = inventory0.getMilk();
    inventory0.setSugar(52);
    int i10 = inventory0.getCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getSugar();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker3 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe5 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str6 = coffeeMaker3.editRecipe(0, recipe5);
    edu.ncsu.csc326.coffeemaker.Inventory inventory7 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i8 = inventory7.getMilk();
    int i9 = inventory7.getCoffee();
    inventory7.setChocolate((int)(byte)-1);
    inventory7.setCoffee((int)(byte)10);
    int i14 = inventory7.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b16 = inventory7.useIngredients(recipe15);
    boolean b17 = coffeeMaker3.addRecipe(recipe15);
    java.lang.String str18 = coffeeMaker3.checkInventory();
    java.lang.String str19 = coffeeMaker3.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory21 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory21.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook24 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str26 = recipeBook24.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe27 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b28 = recipeBook24.addRecipe(recipe27);
    int i29 = recipe27.getAmtCoffee();
    int i30 = recipe27.getAmtCoffee();
    boolean b31 = inventory21.useIngredients(recipe27);
    java.lang.String str32 = recipe27.getName();
    boolean b33 = recipeBook20.addRecipe(recipe27);
    boolean b34 = coffeeMaker3.addRecipe(recipe27);
    recipe27.setName("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
    boolean b37 = inventory0.useIngredients(recipe27);
    inventory0.setChocolate((-1));
    int i40 = inventory0.getCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str18.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str19.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 15);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    boolean b10 = recipeBook0.addRecipe(recipe7);
    int i11 = recipe7.getAmtChocolate();
    int i12 = recipe7.getAmtCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    recipe3.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    // The following exception was thrown during execution in test generation
    try {
    recipe3.setAmtCoffee("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    int i11 = recipe6.getAmtChocolate();
    int i12 = recipe6.getAmtChocolate();
    // The following exception was thrown during execution in test generation
    try {
    recipe6.setAmtChocolate("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    java.lang.String str17 = coffeeMaker0.deleteRecipe((int)(byte)0);
    int i20 = coffeeMaker0.makeCoffee(0, (int)(byte)-1);
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = coffeeMaker0.addRecipe(recipe21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getSugar();
    int i8 = inventory0.getMilk();
    inventory0.setMilk(0);
    int i11 = inventory0.getSugar();
    inventory0.setChocolate((int)(byte)0);
    inventory0.setCoffee(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    java.lang.String str16 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook17 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory18 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory18.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook21 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str23 = recipeBook21.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe24 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b25 = recipeBook21.addRecipe(recipe24);
    int i26 = recipe24.getAmtCoffee();
    int i27 = recipe24.getAmtCoffee();
    boolean b28 = inventory18.useIngredients(recipe24);
    java.lang.String str29 = recipe24.getName();
    boolean b30 = recipeBook17.addRecipe(recipe24);
    boolean b31 = coffeeMaker0.addRecipe(recipe24);
    java.lang.String str32 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker33 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe35 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str36 = coffeeMaker33.editRecipe(0, recipe35);
    edu.ncsu.csc326.coffeemaker.Inventory inventory37 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i38 = inventory37.getMilk();
    int i39 = inventory37.getCoffee();
    inventory37.setChocolate((int)(byte)-1);
    inventory37.setCoffee((int)(byte)10);
    int i44 = inventory37.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe45 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b46 = inventory37.useIngredients(recipe45);
    boolean b47 = coffeeMaker33.addRecipe(recipe45);
    java.lang.String str48 = coffeeMaker33.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook49 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str51 = recipeBook49.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array52 = recipeBook49.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook53 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str55 = recipeBook53.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe56 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b57 = recipeBook53.addRecipe(recipe56);
    int i58 = recipe56.getAmtCoffee();
    int i59 = recipe56.getAmtCoffee();
    boolean b60 = recipeBook49.addRecipe(recipe56);
    recipe56.setName("hi!");
    recipe56.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b65 = coffeeMaker33.addRecipe(recipe56);
    edu.ncsu.csc326.coffeemaker.Recipe recipe66 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i67 = recipe66.getPrice();
    java.lang.String str68 = recipe66.toString();
    boolean b69 = coffeeMaker33.addRecipe(recipe66);
    boolean b70 = coffeeMaker0.addRecipe(recipe66);
    edu.ncsu.csc326.coffeemaker.Inventory inventory71 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i72 = inventory71.getMilk();
    int i73 = inventory71.getCoffee();
    int i74 = inventory71.getMilk();
    edu.ncsu.csc326.coffeemaker.Recipe recipe75 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i76 = recipe75.getPrice();
    java.lang.String str77 = recipe75.toString();
    boolean b78 = inventory71.useIngredients(recipe75);
    java.lang.String str79 = recipe75.getName();
    java.lang.String str80 = recipe75.toString();
    boolean b81 = coffeeMaker0.addRecipe(recipe75);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook83 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory84 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory84.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook87 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str89 = recipeBook87.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe90 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b91 = recipeBook87.addRecipe(recipe90);
    int i92 = recipe90.getAmtCoffee();
    int i93 = recipe90.getAmtCoffee();
    boolean b94 = inventory84.useIngredients(recipe90);
    java.lang.String str95 = recipe90.getName();
    boolean b96 = recipeBook83.addRecipe(recipe90);
    int i97 = recipe90.getAmtChocolate();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str98 = coffeeMaker0.editRecipe(52, recipe90);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str16.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str32.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str48.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + ""+ "'", str68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + ""+ "'", str77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + ""+ "'", str79.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str95 + "' != '" + ""+ "'", str95.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    int i3 = inventory0.getMilk();
    int i4 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker5 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str8 = coffeeMaker5.editRecipe(0, recipe7);
    edu.ncsu.csc326.coffeemaker.Inventory inventory9 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i10 = inventory9.getMilk();
    int i11 = inventory9.getCoffee();
    inventory9.setChocolate((int)(byte)-1);
    inventory9.setCoffee((int)(byte)10);
    int i16 = inventory9.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b18 = inventory9.useIngredients(recipe17);
    boolean b19 = coffeeMaker5.addRecipe(recipe17);
    java.lang.String str20 = coffeeMaker5.checkInventory();
    java.lang.String str21 = coffeeMaker5.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook22 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory23 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory23.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook26 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str28 = recipeBook26.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b30 = recipeBook26.addRecipe(recipe29);
    int i31 = recipe29.getAmtCoffee();
    int i32 = recipe29.getAmtCoffee();
    boolean b33 = inventory23.useIngredients(recipe29);
    java.lang.String str34 = recipe29.getName();
    boolean b35 = recipeBook22.addRecipe(recipe29);
    boolean b36 = coffeeMaker5.addRecipe(recipe29);
    recipe29.setName("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
    int i39 = recipe29.getAmtChocolate();
    boolean b40 = inventory0.useIngredients(recipe29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str21.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array29 = coffeeMaker0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array29);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    boolean b10 = recipeBook0.addRecipe(recipe7);
    int i11 = recipe7.getAmtCoffee();
    recipe7.setName("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = recipe6.getPrice();
    int i11 = recipe6.getAmtSugar();
    int i12 = recipe6.getAmtMilk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    inventory0.setCoffee(1);
    inventory0.setCoffee((int)(byte)10);
    int i15 = inventory0.getMilk();
    int i16 = inventory0.getChocolate();
    int i17 = inventory0.getChocolate();
    int i18 = inventory0.getChocolate();
    int i19 = inventory0.getSugar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    int i5 = inventory0.getChocolate();
    int i6 = inventory0.getSugar();
    int i7 = inventory0.getSugar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook29 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory30 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory30.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook33 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str35 = recipeBook33.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b37 = recipeBook33.addRecipe(recipe36);
    int i38 = recipe36.getAmtCoffee();
    int i39 = recipe36.getAmtCoffee();
    boolean b40 = inventory30.useIngredients(recipe36);
    java.lang.String str41 = recipe36.getName();
    boolean b42 = recipeBook29.addRecipe(recipe36);
    int i43 = recipe36.getAmtSugar();
    boolean b44 = coffeeMaker0.addRecipe(recipe36);
    edu.ncsu.csc326.coffeemaker.Recipe recipe46 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i47 = recipe46.getPrice();
    java.lang.String str48 = recipe46.toString();
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException50 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b51 = recipe46.equals((java.lang.Object)"Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str52 = coffeeMaker0.editRecipe((int)'#', recipe46);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + ""+ "'", str48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    int i23 = recipe17.getAmtSugar();
    boolean b25 = recipe17.equals((java.lang.Object)15);
    int i26 = recipe17.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    int i35 = coffeeMaker0.makeCoffee((int)(byte)0, 0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array36 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory37 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i38 = inventory37.getMilk();
    int i39 = inventory37.getCoffee();
    inventory37.setChocolate((int)(byte)-1);
    inventory37.setCoffee((int)(byte)10);
    int i44 = inventory37.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe45 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b46 = inventory37.useIngredients(recipe45);
    inventory37.setMilk(10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker49 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker50 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe52 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str53 = coffeeMaker50.editRecipe(0, recipe52);
    edu.ncsu.csc326.coffeemaker.Inventory inventory54 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i55 = inventory54.getMilk();
    int i56 = inventory54.getCoffee();
    inventory54.setChocolate((int)(byte)-1);
    inventory54.setCoffee((int)(byte)10);
    int i61 = inventory54.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe62 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b63 = inventory54.useIngredients(recipe62);
    boolean b64 = coffeeMaker50.addRecipe(recipe62);
    edu.ncsu.csc326.coffeemaker.Recipe recipe66 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i67 = recipe66.getPrice();
    int i68 = recipe66.getAmtChocolate();
    java.lang.String str69 = coffeeMaker50.editRecipe(0, recipe66);
    boolean b70 = coffeeMaker49.addRecipe(recipe66);
    int i71 = recipe66.getAmtSugar();
    int i72 = recipe66.getAmtSugar();
    boolean b73 = inventory37.useIngredients(recipe66);
    boolean b74 = coffeeMaker0.addRecipe(recipe66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + ""+ "'", str69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    inventory0.setMilk(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = recipe6.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory11 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i12 = inventory11.getMilk();
    int i13 = inventory11.getCoffee();
    inventory11.setChocolate((int)(byte)-1);
    inventory11.setCoffee((int)(byte)10);
    int i18 = inventory11.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe19 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b20 = inventory11.useIngredients(recipe19);
    int i21 = inventory11.getCoffee();
    int i22 = inventory11.getChocolate();
    inventory11.setCoffee((int)' ');
    int i25 = inventory11.getCoffee();
    boolean b26 = recipe6.equals((java.lang.Object)inventory11);
    java.lang.String str27 = inventory11.toString();
    int i28 = inventory11.getSugar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Coffee: 32\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str27.equals("Coffee: 32\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 15);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    int i10 = recipe7.getAmtCoffee();
    boolean b11 = recipeBook0.addRecipe(recipe7);
    recipe7.setName("hi!");
    java.lang.String str14 = recipe7.toString();
    // The following exception was thrown during execution in test generation
    try {
    recipe7.setAmtSugar("hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException1 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: ");
    java.lang.Throwable[] throwable_array2 = recipeException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array5 = recipeBook0.getRecipes();
    java.lang.String str7 = recipeBook0.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.Inventory inventory8 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i9 = inventory8.getMilk();
    int i10 = inventory8.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook11 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str13 = recipeBook11.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe14 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b15 = recipeBook11.addRecipe(recipe14);
    int i16 = recipe14.getAmtCoffee();
    boolean b17 = inventory8.useIngredients(recipe14);
    int i18 = recipe14.getAmtCoffee();
    boolean b19 = recipeBook0.addRecipe(recipe14);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array20 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook21 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory22 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory22.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook25 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str27 = recipeBook25.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe28 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b29 = recipeBook25.addRecipe(recipe28);
    int i30 = recipe28.getAmtCoffee();
    int i31 = recipe28.getAmtCoffee();
    boolean b32 = inventory22.useIngredients(recipe28);
    java.lang.String str33 = recipe28.getName();
    boolean b34 = recipeBook21.addRecipe(recipe28);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker35 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker36 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe38 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str39 = coffeeMaker36.editRecipe(0, recipe38);
    edu.ncsu.csc326.coffeemaker.Inventory inventory40 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i41 = inventory40.getMilk();
    int i42 = inventory40.getCoffee();
    inventory40.setChocolate((int)(byte)-1);
    inventory40.setCoffee((int)(byte)10);
    int i47 = inventory40.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe48 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b49 = inventory40.useIngredients(recipe48);
    boolean b50 = coffeeMaker36.addRecipe(recipe48);
    edu.ncsu.csc326.coffeemaker.Recipe recipe52 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i53 = recipe52.getPrice();
    int i54 = recipe52.getAmtChocolate();
    java.lang.String str55 = coffeeMaker36.editRecipe(0, recipe52);
    boolean b56 = coffeeMaker35.addRecipe(recipe52);
    int i57 = recipe52.getAmtSugar();
    java.lang.String str58 = recipe52.toString();
    int i59 = recipe52.getAmtCoffee();
    boolean b60 = recipeBook21.addRecipe(recipe52);
    boolean b61 = recipeBook0.addRecipe(recipe52);
    edu.ncsu.csc326.coffeemaker.Inventory inventory62 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i63 = inventory62.getMilk();
    int i64 = inventory62.getCoffee();
    inventory62.setChocolate((int)(byte)-1);
    inventory62.setCoffee((int)(byte)10);
    int i69 = inventory62.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe70 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b71 = inventory62.useIngredients(recipe70);
    inventory62.setMilk(10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker74 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker75 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe77 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str78 = coffeeMaker75.editRecipe(0, recipe77);
    edu.ncsu.csc326.coffeemaker.Inventory inventory79 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i80 = inventory79.getMilk();
    int i81 = inventory79.getCoffee();
    inventory79.setChocolate((int)(byte)-1);
    inventory79.setCoffee((int)(byte)10);
    int i86 = inventory79.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe87 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b88 = inventory79.useIngredients(recipe87);
    boolean b89 = coffeeMaker75.addRecipe(recipe87);
    edu.ncsu.csc326.coffeemaker.Recipe recipe91 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i92 = recipe91.getPrice();
    int i93 = recipe91.getAmtChocolate();
    java.lang.String str94 = coffeeMaker75.editRecipe(0, recipe91);
    boolean b95 = coffeeMaker74.addRecipe(recipe91);
    int i96 = recipe91.getAmtSugar();
    int i97 = recipe91.getAmtSugar();
    boolean b98 = inventory62.useIngredients(recipe91);
    boolean b99 = recipeBook0.addRecipe(recipe91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str94 + "' != '" + ""+ "'", str94.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    recipe17.setName("");
    boolean b26 = recipe17.equals((java.lang.Object)(-1));
    int i27 = recipe17.getAmtChocolate();
    // The following exception was thrown during execution in test generation
    try {
    recipe17.setAmtCoffee("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    int i23 = recipe17.getAmtChocolate();
    int i24 = recipe17.getAmtCoffee();
    int i25 = recipe17.getAmtCoffee();
    int i26 = recipe17.getPrice();
    java.lang.String str27 = recipe17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    inventory0.setCoffee(1);
    inventory0.setCoffee((int)(byte)10);
    int i15 = inventory0.getMilk();
    inventory0.setChocolate((int)(short)10);
    inventory0.setChocolate((int)(short)1);
    inventory0.setCoffee((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 15);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    edu.ncsu.csc326.coffeemaker.Recipe recipe0 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i1 = recipe0.getPrice();
    int i2 = recipe0.getAmtChocolate();
    int i3 = recipe0.getAmtCoffee();
    int i4 = recipe0.getPrice();
    int i5 = recipe0.getAmtChocolate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setMilk((-1));
    inventory0.setSugar(100);
    inventory0.setCoffee(100);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook13 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str15 = recipeBook13.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory17.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = inventory17.useIngredients(recipe23);
    java.lang.String str28 = recipe23.getName();
    boolean b29 = recipeBook16.addRecipe(recipe23);
    boolean b30 = recipeBook13.addRecipe(recipe23);
    boolean b31 = inventory6.useIngredients(recipe23);
    inventory6.setChocolate((int)'4');
    inventory6.setCoffee((int)(short)-1);
    inventory6.setChocolate((int)(byte)1);
    int i38 = inventory6.getMilk();
    int i39 = inventory6.getChocolate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array20 = coffeeMaker0.getRecipes();
    java.lang.String str21 = coffeeMaker0.checkInventory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str21.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    inventory0.setCoffee(1);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addSugar("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    int i35 = coffeeMaker0.makeCoffee(0, 0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i37 = recipe36.getPrice();
    java.lang.String str38 = recipe36.toString();
    recipe36.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b41 = coffeeMaker0.addRecipe(recipe36);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook42 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str44 = recipeBook42.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook45 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory46 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory46.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook49 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str51 = recipeBook49.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe52 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b53 = recipeBook49.addRecipe(recipe52);
    int i54 = recipe52.getAmtCoffee();
    int i55 = recipe52.getAmtCoffee();
    boolean b56 = inventory46.useIngredients(recipe52);
    java.lang.String str57 = recipe52.getName();
    boolean b58 = recipeBook45.addRecipe(recipe52);
    boolean b59 = recipeBook42.addRecipe(recipe52);
    boolean b60 = coffeeMaker0.addRecipe(recipe52);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook62 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str64 = recipeBook62.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array65 = recipeBook62.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook66 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str68 = recipeBook66.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe69 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b70 = recipeBook66.addRecipe(recipe69);
    int i71 = recipe69.getAmtCoffee();
    boolean b72 = recipeBook62.addRecipe(recipe69);
    java.lang.String str73 = recipe69.getName();
    java.lang.String str74 = coffeeMaker0.editRecipe(1, recipe69);
    // The following exception was thrown during execution in test generation
    try {
    int i77 = coffeeMaker0.makeCoffee((int)(short)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + ""+ "'", str57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + ""+ "'", str73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str74.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getSugar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    java.lang.String str16 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i18 = inventory17.getMilk();
    int i19 = inventory17.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    boolean b26 = inventory17.useIngredients(recipe23);
    int i27 = recipe23.getPrice();
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i30 = recipe29.getPrice();
    int i31 = recipe29.getAmtChocolate();
    int i32 = recipe29.getAmtCoffee();
    boolean b33 = coffeeMaker0.addRecipe(recipe29);
    java.lang.String str34 = coffeeMaker0.checkInventory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str16.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str34.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array5 = recipeBook0.getRecipes();
    java.lang.String str7 = recipeBook0.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array8 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe recipe9 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i10 = recipe9.getPrice();
    java.lang.String str11 = recipe9.toString();
    int i12 = recipe9.getPrice();
    int i13 = recipe9.getAmtChocolate();
    java.lang.String str14 = recipe9.toString();
    boolean b15 = recipeBook0.addRecipe(recipe9);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array16 = recipeBook0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array16);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i4 = recipe3.getPrice();
    int i5 = recipe3.getAmtChocolate();
    int i6 = recipe3.getAmtCoffee();
    int i7 = recipe3.getPrice();
    boolean b8 = inventory0.useIngredients(recipe3);
    int i9 = inventory0.getSugar();
    java.lang.String str10 = inventory0.toString();
    int i11 = inventory0.getMilk();
    int i12 = inventory0.getCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str10.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setChocolate(100);
    inventory0.setChocolate(15);
    inventory0.setCoffee((int)'a');
    int i9 = inventory0.getChocolate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setChocolate(100);
    inventory0.setMilk((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    int i11 = recipe6.getAmtChocolate();
    int i12 = recipe6.getAmtCoffee();
    // The following exception was thrown during execution in test generation
    try {
    recipe6.setAmtChocolate("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: ");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook13 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str15 = recipeBook13.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory17.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = inventory17.useIngredients(recipe23);
    java.lang.String str28 = recipe23.getName();
    boolean b29 = recipeBook16.addRecipe(recipe23);
    boolean b30 = recipeBook13.addRecipe(recipe23);
    boolean b31 = inventory6.useIngredients(recipe23);
    inventory6.setChocolate((int)'4');
    inventory6.setCoffee((int)(short)-1);
    inventory6.setChocolate((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException1 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException3 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.String str4 = inventoryException3.toString();
    inventoryException1.addSuppressed((java.lang.Throwable)inventoryException3);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException7 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: ");
    inventoryException3.addSuppressed((java.lang.Throwable)inventoryException7);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException10 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException12 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.Throwable[] throwable_array13 = inventoryException12.getSuppressed();
    inventoryException10.addSuppressed((java.lang.Throwable)inventoryException12);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException16 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException18 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.String str19 = inventoryException18.toString();
    inventoryException16.addSuppressed((java.lang.Throwable)inventoryException18);
    inventoryException10.addSuppressed((java.lang.Throwable)inventoryException16);
    inventoryException7.addSuppressed((java.lang.Throwable)inventoryException16);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException24 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException26 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.String str27 = inventoryException26.toString();
    inventoryException24.addSuppressed((java.lang.Throwable)inventoryException26);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException30 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: ");
    inventoryException26.addSuppressed((java.lang.Throwable)inventoryException30);
    inventoryException16.addSuppressed((java.lang.Throwable)inventoryException26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str4.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str19.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str27.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook29 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory30 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory30.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook33 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str35 = recipeBook33.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b37 = recipeBook33.addRecipe(recipe36);
    int i38 = recipe36.getAmtCoffee();
    int i39 = recipe36.getAmtCoffee();
    boolean b40 = inventory30.useIngredients(recipe36);
    java.lang.String str41 = recipe36.getName();
    boolean b42 = recipeBook29.addRecipe(recipe36);
    int i43 = recipe36.getAmtSugar();
    boolean b44 = coffeeMaker0.addRecipe(recipe36);
    java.lang.String str45 = coffeeMaker0.checkInventory();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str47 = coffeeMaker0.deleteRecipe((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str45.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    // The following exception was thrown during execution in test generation
    try {
    inventory6.addCoffee("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    inventory0.setMilk(10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker12 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker13 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str16 = coffeeMaker13.editRecipe(0, recipe15);
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i18 = inventory17.getMilk();
    int i19 = inventory17.getCoffee();
    inventory17.setChocolate((int)(byte)-1);
    inventory17.setCoffee((int)(byte)10);
    int i24 = inventory17.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b26 = inventory17.useIngredients(recipe25);
    boolean b27 = coffeeMaker13.addRecipe(recipe25);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i30 = recipe29.getPrice();
    int i31 = recipe29.getAmtChocolate();
    java.lang.String str32 = coffeeMaker13.editRecipe(0, recipe29);
    boolean b33 = coffeeMaker12.addRecipe(recipe29);
    int i34 = recipe29.getAmtSugar();
    int i35 = recipe29.getAmtSugar();
    boolean b36 = inventory0.useIngredients(recipe29);
    int i37 = inventory0.getSugar();
    java.lang.String str38 = inventory0.toString();
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str38.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    int i3 = inventory0.getMilk();
    edu.ncsu.csc326.coffeemaker.Recipe recipe4 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i5 = recipe4.getPrice();
    java.lang.String str6 = recipe4.toString();
    boolean b7 = inventory0.useIngredients(recipe4);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook8 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str10 = recipeBook8.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array11 = recipeBook8.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook12 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str14 = recipeBook12.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b16 = recipeBook12.addRecipe(recipe15);
    int i17 = recipe15.getAmtCoffee();
    int i18 = recipe15.getAmtCoffee();
    boolean b19 = recipeBook8.addRecipe(recipe15);
    recipe15.setName("hi!");
    java.lang.String str22 = recipe15.getName();
    int i23 = recipe15.getAmtCoffee();
    boolean b24 = inventory0.useIngredients(recipe15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory4.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook7 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str9 = recipeBook7.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe10 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b11 = recipeBook7.addRecipe(recipe10);
    int i12 = recipe10.getAmtCoffee();
    int i13 = recipe10.getAmtCoffee();
    boolean b14 = inventory4.useIngredients(recipe10);
    java.lang.String str15 = recipe10.getName();
    boolean b16 = recipeBook3.addRecipe(recipe10);
    boolean b17 = recipeBook0.addRecipe(recipe10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker18 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker19 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str22 = coffeeMaker19.editRecipe(0, recipe21);
    edu.ncsu.csc326.coffeemaker.Inventory inventory23 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i24 = inventory23.getMilk();
    int i25 = inventory23.getCoffee();
    inventory23.setChocolate((int)(byte)-1);
    inventory23.setCoffee((int)(byte)10);
    int i30 = inventory23.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b32 = inventory23.useIngredients(recipe31);
    boolean b33 = coffeeMaker19.addRecipe(recipe31);
    edu.ncsu.csc326.coffeemaker.Recipe recipe35 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i36 = recipe35.getPrice();
    int i37 = recipe35.getAmtChocolate();
    java.lang.String str38 = coffeeMaker19.editRecipe(0, recipe35);
    boolean b39 = coffeeMaker18.addRecipe(recipe35);
    int i40 = recipe35.getAmtSugar();
    recipe35.setName("");
    boolean b44 = recipe35.equals((java.lang.Object)(-1));
    boolean b45 = recipeBook0.addRecipe(recipe35);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook46 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str48 = recipeBook46.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe49 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b50 = recipeBook46.addRecipe(recipe49);
    recipe49.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    boolean b53 = recipeBook0.addRecipe(recipe49);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook55 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str57 = recipeBook55.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array58 = recipeBook55.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe recipe59 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b60 = recipeBook55.addRecipe(recipe59);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array61 = recipeBook55.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe recipe63 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i64 = recipe63.getPrice();
    java.lang.String str65 = recipe63.toString();
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException67 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b68 = recipe63.equals((java.lang.Object)"Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    java.lang.String str69 = recipeBook55.editRecipe((int)(byte)0, recipe63);
    java.lang.String str70 = recipeBook0.editRecipe((int)(short)0, recipe63);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker71 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe73 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str74 = coffeeMaker71.editRecipe(0, recipe73);
    edu.ncsu.csc326.coffeemaker.Inventory inventory75 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i76 = inventory75.getMilk();
    int i77 = inventory75.getCoffee();
    inventory75.setChocolate((int)(byte)-1);
    inventory75.setCoffee((int)(byte)10);
    int i82 = inventory75.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe83 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b84 = inventory75.useIngredients(recipe83);
    boolean b85 = coffeeMaker71.addRecipe(recipe83);
    edu.ncsu.csc326.coffeemaker.Recipe recipe87 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i88 = recipe87.getPrice();
    int i89 = recipe87.getAmtChocolate();
    java.lang.String str90 = coffeeMaker71.editRecipe(0, recipe87);
    boolean b91 = recipeBook0.addRecipe(recipe87);
    // The following exception was thrown during execution in test generation
    try {
    recipe87.setPrice("");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + ""+ "'", str65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + ""+ "'", str69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + ""+ "'", str70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + ""+ "'", str90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    int i23 = recipe17.getAmtChocolate();
    int i24 = recipe17.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory25 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i26 = inventory25.getMilk();
    int i27 = inventory25.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook28 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str30 = recipeBook28.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe31 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b32 = recipeBook28.addRecipe(recipe31);
    int i33 = recipe31.getAmtCoffee();
    boolean b34 = inventory25.useIngredients(recipe31);
    int i35 = recipe31.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory36 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i37 = inventory36.getMilk();
    int i38 = inventory36.getCoffee();
    inventory36.setChocolate((int)(byte)-1);
    inventory36.setCoffee((int)(byte)10);
    int i43 = inventory36.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe44 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b45 = inventory36.useIngredients(recipe44);
    int i46 = inventory36.getCoffee();
    int i47 = inventory36.getChocolate();
    inventory36.setCoffee((int)' ');
    int i50 = inventory36.getCoffee();
    boolean b51 = recipe31.equals((java.lang.Object)inventory36);
    boolean b52 = recipe17.equals((java.lang.Object)b51);
    java.lang.String str53 = recipe17.getName();
    java.lang.String str54 = recipe17.toString();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook55 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str57 = recipeBook55.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe58 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b59 = recipeBook55.addRecipe(recipe58);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array60 = recipeBook55.getRecipes();
    java.lang.String str62 = recipeBook55.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook63 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str65 = recipeBook63.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe67 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i68 = recipe67.getPrice();
    int i69 = recipe67.getAmtChocolate();
    java.lang.String str70 = recipeBook63.editRecipe(0, recipe67);
    boolean b71 = recipeBook55.addRecipe(recipe67);
    boolean b72 = recipe17.equals((java.lang.Object)recipe67);
    int i73 = recipe67.getAmtMilk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + ""+ "'", str62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getSugar();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker3 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe5 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str6 = coffeeMaker3.editRecipe(0, recipe5);
    edu.ncsu.csc326.coffeemaker.Inventory inventory7 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i8 = inventory7.getMilk();
    int i9 = inventory7.getCoffee();
    inventory7.setChocolate((int)(byte)-1);
    inventory7.setCoffee((int)(byte)10);
    int i14 = inventory7.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b16 = inventory7.useIngredients(recipe15);
    boolean b17 = coffeeMaker3.addRecipe(recipe15);
    java.lang.String str18 = coffeeMaker3.checkInventory();
    java.lang.String str19 = coffeeMaker3.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory21 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory21.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook24 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str26 = recipeBook24.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe27 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b28 = recipeBook24.addRecipe(recipe27);
    int i29 = recipe27.getAmtCoffee();
    int i30 = recipe27.getAmtCoffee();
    boolean b31 = inventory21.useIngredients(recipe27);
    java.lang.String str32 = recipe27.getName();
    boolean b33 = recipeBook20.addRecipe(recipe27);
    boolean b34 = coffeeMaker3.addRecipe(recipe27);
    recipe27.setName("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
    boolean b37 = inventory0.useIngredients(recipe27);
    inventory0.setMilk((-1));
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str18.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str19.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    recipe3.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    java.lang.String str7 = recipe3.toString();
    int i8 = recipe3.getAmtMilk();
    recipe3.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker11 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker12 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe14 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str15 = coffeeMaker12.editRecipe(0, recipe14);
    edu.ncsu.csc326.coffeemaker.Inventory inventory16 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i17 = inventory16.getMilk();
    int i18 = inventory16.getCoffee();
    inventory16.setChocolate((int)(byte)-1);
    inventory16.setCoffee((int)(byte)10);
    int i23 = inventory16.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe24 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b25 = inventory16.useIngredients(recipe24);
    boolean b26 = coffeeMaker12.addRecipe(recipe24);
    edu.ncsu.csc326.coffeemaker.Recipe recipe28 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i29 = recipe28.getPrice();
    int i30 = recipe28.getAmtChocolate();
    java.lang.String str31 = coffeeMaker12.editRecipe(0, recipe28);
    boolean b32 = coffeeMaker11.addRecipe(recipe28);
    int i33 = recipe28.getAmtSugar();
    recipe28.setName("");
    boolean b37 = recipe28.equals((java.lang.Object)(-1));
    int i38 = recipe28.getAmtChocolate();
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException40 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    java.lang.Throwable[] throwable_array41 = inventoryException40.getSuppressed();
    boolean b42 = recipe28.equals((java.lang.Object)inventoryException40);
    boolean b43 = recipe3.equals((java.lang.Object)b42);
    recipe3.setName("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str7.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException1 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException3 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("hi!");
    java.lang.Throwable[] throwable_array4 = recipeException3.getSuppressed();
    inventoryException1.addSuppressed((java.lang.Throwable)recipeException3);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException7 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.Throwable[] throwable_array8 = inventoryException7.getSuppressed();
    recipeException3.addSuppressed((java.lang.Throwable)inventoryException7);
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException11 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    java.lang.Throwable[] throwable_array12 = recipeException11.getSuppressed();
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException14 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("hi!");
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException16 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException18 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    java.lang.Throwable[] throwable_array19 = recipeException18.getSuppressed();
    recipeException16.addSuppressed((java.lang.Throwable)recipeException18);
    recipeException14.addSuppressed((java.lang.Throwable)recipeException18);
    recipeException11.addSuppressed((java.lang.Throwable)recipeException18);
    recipeException3.addSuppressed((java.lang.Throwable)recipeException11);
    java.lang.Throwable[] throwable_array24 = recipeException11.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array24);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    java.lang.String str20 = coffeeMaker0.checkInventory();
    java.lang.String str22 = coffeeMaker0.deleteRecipe((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook29 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory30 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory30.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook33 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str35 = recipeBook33.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b37 = recipeBook33.addRecipe(recipe36);
    int i38 = recipe36.getAmtCoffee();
    int i39 = recipe36.getAmtCoffee();
    boolean b40 = inventory30.useIngredients(recipe36);
    java.lang.String str41 = recipe36.getName();
    boolean b42 = recipeBook29.addRecipe(recipe36);
    int i43 = recipe36.getAmtSugar();
    boolean b44 = coffeeMaker0.addRecipe(recipe36);
    java.lang.String str45 = coffeeMaker0.checkInventory();
    java.lang.String str47 = coffeeMaker0.deleteRecipe(1);
    edu.ncsu.csc326.coffeemaker.Recipe recipe49 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str50 = coffeeMaker0.editRecipe(10, recipe49);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str45.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    boolean b10 = recipeBook0.addRecipe(recipe7);
    // The following exception was thrown during execution in test generation
    try {
    recipe7.setPrice("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setChocolate(100);
    inventory0.setChocolate(15);
    int i7 = inventory0.getMilk();
    int i8 = inventory0.getChocolate();
    int i9 = inventory0.getCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe1 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i2 = recipe1.getPrice();
    int i3 = recipe1.getAmtChocolate();
    int i4 = recipe1.getAmtCoffee();
    boolean b5 = coffeeMaker0.addRecipe(recipe1);
    recipe1.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    // The following exception was thrown during execution in test generation
    try {
    recipe1.setAmtMilk("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i4 = recipe3.getPrice();
    int i5 = recipe3.getAmtChocolate();
    int i6 = recipe3.getAmtCoffee();
    int i7 = recipe3.getPrice();
    boolean b8 = inventory0.useIngredients(recipe3);
    int i9 = recipe3.getPrice();
    java.lang.String str10 = recipe3.getName();
    recipe3.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setCoffee((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker5 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str8 = coffeeMaker5.editRecipe(0, recipe7);
    edu.ncsu.csc326.coffeemaker.Inventory inventory9 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i10 = inventory9.getMilk();
    int i11 = inventory9.getCoffee();
    inventory9.setChocolate((int)(byte)-1);
    inventory9.setCoffee((int)(byte)10);
    int i16 = inventory9.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b18 = inventory9.useIngredients(recipe17);
    boolean b19 = coffeeMaker5.addRecipe(recipe17);
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i22 = recipe21.getPrice();
    int i23 = recipe21.getAmtChocolate();
    java.lang.String str24 = coffeeMaker5.editRecipe(0, recipe21);
    java.lang.String str25 = coffeeMaker5.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array26 = coffeeMaker5.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory27 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i28 = inventory27.getMilk();
    int i29 = inventory27.getCoffee();
    int i30 = inventory27.getMilk();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook31 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str33 = recipeBook31.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe34 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b35 = recipeBook31.addRecipe(recipe34);
    int i36 = recipe34.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory37 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i38 = inventory37.getMilk();
    int i39 = inventory37.getCoffee();
    inventory37.setChocolate((int)(byte)-1);
    int i42 = inventory37.getChocolate();
    boolean b43 = recipe34.equals((java.lang.Object)inventory37);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook44 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str46 = recipeBook44.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook47 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory48 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory48.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook51 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str53 = recipeBook51.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe54 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b55 = recipeBook51.addRecipe(recipe54);
    int i56 = recipe54.getAmtCoffee();
    int i57 = recipe54.getAmtCoffee();
    boolean b58 = inventory48.useIngredients(recipe54);
    java.lang.String str59 = recipe54.getName();
    boolean b60 = recipeBook47.addRecipe(recipe54);
    boolean b61 = recipeBook44.addRecipe(recipe54);
    boolean b62 = inventory37.useIngredients(recipe54);
    boolean b63 = inventory27.useIngredients(recipe54);
    boolean b64 = coffeeMaker5.addRecipe(recipe54);
    boolean b65 = inventory0.useIngredients(recipe54);
    java.lang.String str66 = recipe54.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str25.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + ""+ "'", str66.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(short)1);
    int i5 = inventory0.getCoffee();
    int i6 = inventory0.getCoffee();
    inventory0.setCoffee((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addMilk("hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = inventory0.getChocolate();
    inventory0.setSugar(0);
    inventory0.setChocolate((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getSugar();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker3 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe5 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str6 = coffeeMaker3.editRecipe(0, recipe5);
    edu.ncsu.csc326.coffeemaker.Inventory inventory7 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i8 = inventory7.getMilk();
    int i9 = inventory7.getCoffee();
    inventory7.setChocolate((int)(byte)-1);
    inventory7.setCoffee((int)(byte)10);
    int i14 = inventory7.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b16 = inventory7.useIngredients(recipe15);
    boolean b17 = coffeeMaker3.addRecipe(recipe15);
    java.lang.String str18 = coffeeMaker3.checkInventory();
    java.lang.String str19 = coffeeMaker3.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory21 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory21.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook24 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str26 = recipeBook24.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe27 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b28 = recipeBook24.addRecipe(recipe27);
    int i29 = recipe27.getAmtCoffee();
    int i30 = recipe27.getAmtCoffee();
    boolean b31 = inventory21.useIngredients(recipe27);
    java.lang.String str32 = recipe27.getName();
    boolean b33 = recipeBook20.addRecipe(recipe27);
    boolean b34 = coffeeMaker3.addRecipe(recipe27);
    recipe27.setName("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!");
    boolean b37 = inventory0.useIngredients(recipe27);
    int i38 = inventory0.getCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str18.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str19.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setMilk((-1));
    int i3 = inventory0.getMilk();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker4 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe5 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i6 = recipe5.getPrice();
    int i7 = recipe5.getAmtChocolate();
    int i8 = recipe5.getAmtCoffee();
    boolean b9 = coffeeMaker4.addRecipe(recipe5);
    recipe5.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    boolean b12 = inventory0.useIngredients(recipe5);
    int i13 = inventory0.getChocolate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 15);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    java.lang.String str20 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array21 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Inventory inventory22 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i23 = inventory22.getMilk();
    int i24 = inventory22.getCoffee();
    int i25 = inventory22.getMilk();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook26 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str28 = recipeBook26.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b30 = recipeBook26.addRecipe(recipe29);
    int i31 = recipe29.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory32 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i33 = inventory32.getMilk();
    int i34 = inventory32.getCoffee();
    inventory32.setChocolate((int)(byte)-1);
    int i37 = inventory32.getChocolate();
    boolean b38 = recipe29.equals((java.lang.Object)inventory32);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook39 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str41 = recipeBook39.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook42 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory43 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory43.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook46 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str48 = recipeBook46.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe49 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b50 = recipeBook46.addRecipe(recipe49);
    int i51 = recipe49.getAmtCoffee();
    int i52 = recipe49.getAmtCoffee();
    boolean b53 = inventory43.useIngredients(recipe49);
    java.lang.String str54 = recipe49.getName();
    boolean b55 = recipeBook42.addRecipe(recipe49);
    boolean b56 = recipeBook39.addRecipe(recipe49);
    boolean b57 = inventory32.useIngredients(recipe49);
    boolean b58 = inventory22.useIngredients(recipe49);
    boolean b59 = coffeeMaker0.addRecipe(recipe49);
    // The following exception was thrown during execution in test generation
    try {
    int i62 = coffeeMaker0.makeCoffee(100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    recipe17.setName("");
    java.lang.String str25 = recipe17.getName();
    java.lang.String str26 = recipe17.getName();
    // The following exception was thrown during execution in test generation
    try {
    recipe17.setAmtChocolate("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = inventory0.getChocolate();
    java.lang.String str11 = inventory0.toString();
    int i12 = inventory0.getSugar();
    edu.ncsu.csc326.coffeemaker.Inventory inventory13 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory13.setMilk((-1));
    int i16 = inventory13.getMilk();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker17 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe18 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i19 = recipe18.getPrice();
    int i20 = recipe18.getAmtChocolate();
    int i21 = recipe18.getAmtCoffee();
    boolean b22 = coffeeMaker17.addRecipe(recipe18);
    recipe18.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    boolean b25 = inventory13.useIngredients(recipe18);
    boolean b26 = inventory0.useIngredients(recipe18);
    // The following exception was thrown during execution in test generation
    try {
    recipe18.setAmtSugar("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str11.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook29 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory30 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory30.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook33 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str35 = recipeBook33.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b37 = recipeBook33.addRecipe(recipe36);
    int i38 = recipe36.getAmtCoffee();
    int i39 = recipe36.getAmtCoffee();
    boolean b40 = inventory30.useIngredients(recipe36);
    java.lang.String str41 = recipe36.getName();
    boolean b42 = recipeBook29.addRecipe(recipe36);
    int i43 = recipe36.getAmtSugar();
    boolean b44 = coffeeMaker0.addRecipe(recipe36);
    recipe36.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    int i10 = inventory0.getCoffee();
    int i11 = inventory0.getChocolate();
    inventory0.setCoffee((int)' ');
    inventory0.setChocolate((int)(short)100);
    inventory0.setMilk(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook13 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str15 = recipeBook13.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory17.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = inventory17.useIngredients(recipe23);
    java.lang.String str28 = recipe23.getName();
    boolean b29 = recipeBook16.addRecipe(recipe23);
    boolean b30 = recipeBook13.addRecipe(recipe23);
    boolean b31 = inventory6.useIngredients(recipe23);
    inventory6.setChocolate((int)'4');
    inventory6.setChocolate((int)(short)10);
    edu.ncsu.csc326.coffeemaker.Inventory inventory36 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i37 = inventory36.getMilk();
    int i38 = inventory36.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook39 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str41 = recipeBook39.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe42 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b43 = recipeBook39.addRecipe(recipe42);
    int i44 = recipe42.getAmtCoffee();
    boolean b45 = inventory36.useIngredients(recipe42);
    int i46 = recipe42.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory47 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i48 = inventory47.getMilk();
    int i49 = inventory47.getCoffee();
    inventory47.setChocolate((int)(byte)-1);
    inventory47.setCoffee((int)(byte)10);
    int i54 = inventory47.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe55 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b56 = inventory47.useIngredients(recipe55);
    int i57 = inventory47.getCoffee();
    int i58 = inventory47.getChocolate();
    inventory47.setCoffee((int)' ');
    int i61 = inventory47.getCoffee();
    boolean b62 = recipe42.equals((java.lang.Object)inventory47);
    boolean b63 = inventory6.useIngredients(recipe42);
    int i64 = recipe42.getAmtChocolate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    inventory0.setChocolate(100);
    inventory0.setMilk((int)(byte)1);
    inventory0.setChocolate(0);
    int i9 = inventory0.getCoffee();
    inventory0.setMilk(100);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addChocolate("Coffee: 32\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    java.lang.String str6 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i8 = recipe7.getPrice();
    java.lang.String str9 = recipe7.toString();
    int i10 = recipe7.getPrice();
    int i11 = recipe7.getAmtChocolate();
    int i12 = recipe7.getAmtSugar();
    int i13 = recipe7.getAmtChocolate();
    boolean b14 = recipeBook0.addRecipe(recipe7);
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException16 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("hi!");
    java.lang.String str17 = inventoryException16.toString();
    java.lang.Throwable[] throwable_array18 = inventoryException16.getSuppressed();
    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException20 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    java.lang.Throwable[] throwable_array21 = inventoryException20.getSuppressed();
    inventoryException16.addSuppressed((java.lang.Throwable)inventoryException20);
    java.lang.String str23 = inventoryException16.toString();
    boolean b24 = recipe7.equals((java.lang.Object)str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str17.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"+ "'", str23.equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    edu.ncsu.csc326.coffeemaker.exceptions.InventoryException inventoryException1 = new edu.ncsu.csc326.coffeemaker.exceptions.InventoryException("");
    edu.ncsu.csc326.coffeemaker.exceptions.RecipeException recipeException3 = new edu.ncsu.csc326.coffeemaker.exceptions.RecipeException("hi!");
    java.lang.Throwable[] throwable_array4 = recipeException3.getSuppressed();
    inventoryException1.addSuppressed((java.lang.Throwable)recipeException3);
    java.lang.String str6 = recipeException3.toString();
    java.lang.Throwable[] throwable_array7 = recipeException3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!"+ "'", str6.equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array7);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array5 = recipeBook0.getRecipes();
    java.lang.String str7 = recipeBook0.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.Inventory inventory8 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i9 = inventory8.getMilk();
    int i10 = inventory8.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook11 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str13 = recipeBook11.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe14 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b15 = recipeBook11.addRecipe(recipe14);
    int i16 = recipe14.getAmtCoffee();
    boolean b17 = inventory8.useIngredients(recipe14);
    int i18 = recipe14.getAmtCoffee();
    boolean b19 = recipeBook0.addRecipe(recipe14);
    java.lang.String str20 = recipe14.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Recipe recipe33 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i34 = recipe33.getPrice();
    java.lang.String str35 = recipe33.toString();
    boolean b36 = coffeeMaker0.addRecipe(recipe33);
    edu.ncsu.csc326.coffeemaker.Inventory inventory37 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i38 = inventory37.getMilk();
    int i39 = inventory37.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook40 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str42 = recipeBook40.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe43 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b44 = recipeBook40.addRecipe(recipe43);
    int i45 = recipe43.getAmtCoffee();
    boolean b46 = inventory37.useIngredients(recipe43);
    int i47 = recipe43.getAmtCoffee();
    boolean b48 = coffeeMaker0.addRecipe(recipe43);
    java.lang.String str50 = coffeeMaker0.deleteRecipe((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker8 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker9 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe11 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str12 = coffeeMaker9.editRecipe(0, recipe11);
    edu.ncsu.csc326.coffeemaker.Inventory inventory13 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i14 = inventory13.getMilk();
    int i15 = inventory13.getCoffee();
    inventory13.setChocolate((int)(byte)-1);
    inventory13.setCoffee((int)(byte)10);
    int i20 = inventory13.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe21 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b22 = inventory13.useIngredients(recipe21);
    boolean b23 = coffeeMaker9.addRecipe(recipe21);
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i26 = recipe25.getPrice();
    int i27 = recipe25.getAmtChocolate();
    java.lang.String str28 = coffeeMaker9.editRecipe(0, recipe25);
    boolean b29 = coffeeMaker8.addRecipe(recipe25);
    int i30 = recipe25.getAmtSugar();
    int i31 = recipe25.getAmtChocolate();
    int i32 = recipe25.getAmtCoffee();
    int i33 = recipe25.getAmtCoffee();
    int i34 = recipe25.getPrice();
    boolean b35 = inventory0.useIngredients(recipe25);
    recipe25.setName("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    edu.ncsu.csc326.coffeemaker.Recipe recipe0 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i1 = recipe0.getPrice();
    java.lang.String str2 = recipe0.toString();
    int i3 = recipe0.getPrice();
    int i4 = recipe0.getAmtChocolate();
    java.lang.String str5 = recipe0.toString();
    java.lang.String str6 = recipe0.getName();
    int i7 = recipe0.getAmtSugar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    boolean b9 = inventory0.useIngredients(recipe6);
    int i10 = inventory0.getChocolate();
    inventory0.setSugar(0);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addCoffee("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 15);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    java.lang.String str20 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array21 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array22 = coffeeMaker0.getRecipes();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker23 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str26 = coffeeMaker23.editRecipe(0, recipe25);
    boolean b27 = coffeeMaker0.addRecipe(recipe25);
    // The following exception was thrown during execution in test generation
    try {
    recipe25.setAmtCoffee("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str20.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook13 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str15 = recipeBook13.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory17.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = inventory17.useIngredients(recipe23);
    java.lang.String str28 = recipe23.getName();
    boolean b29 = recipeBook16.addRecipe(recipe23);
    boolean b30 = recipeBook13.addRecipe(recipe23);
    boolean b31 = inventory6.useIngredients(recipe23);
    inventory6.setChocolate((int)'4');
    inventory6.setChocolate((int)(short)10);
    java.lang.String str36 = inventory6.toString();
    inventory6.setCoffee((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    inventory6.addSugar("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 1\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n"+ "'", str36.equals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 10\n"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory0.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook3 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str5 = recipeBook3.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe6 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b7 = recipeBook3.addRecipe(recipe6);
    int i8 = recipe6.getAmtCoffee();
    int i9 = recipe6.getAmtCoffee();
    boolean b10 = inventory0.useIngredients(recipe6);
    int i11 = recipe6.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    int i23 = recipe17.getAmtSugar();
    java.lang.String str24 = recipe17.getName();
    // The following exception was thrown during execution in test generation
    try {
    recipe17.setAmtChocolate("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    java.lang.String str5 = recipeBook0.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array6 = recipeBook0.getRecipes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array6);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    edu.ncsu.csc326.coffeemaker.Inventory inventory13 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i14 = inventory13.getMilk();
    int i15 = inventory13.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe19 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b20 = recipeBook16.addRecipe(recipe19);
    int i21 = recipe19.getAmtCoffee();
    boolean b22 = inventory13.useIngredients(recipe19);
    int i23 = inventory13.getChocolate();
    boolean b24 = recipe3.equals((java.lang.Object)inventory13);
    // The following exception was thrown during execution in test generation
    try {
    recipe3.setPrice("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException: hi!");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    recipe23.setName("hi!");
    recipe23.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b32 = coffeeMaker0.addRecipe(recipe23);
    int i35 = coffeeMaker0.makeCoffee(0, 0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe36 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i37 = recipe36.getPrice();
    java.lang.String str38 = recipe36.toString();
    recipe36.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    boolean b41 = coffeeMaker0.addRecipe(recipe36);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook42 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str44 = recipeBook42.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook45 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory46 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory46.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook49 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str51 = recipeBook49.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe52 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b53 = recipeBook49.addRecipe(recipe52);
    int i54 = recipe52.getAmtCoffee();
    int i55 = recipe52.getAmtCoffee();
    boolean b56 = inventory46.useIngredients(recipe52);
    java.lang.String str57 = recipe52.getName();
    boolean b58 = recipeBook45.addRecipe(recipe52);
    boolean b59 = recipeBook42.addRecipe(recipe52);
    boolean b60 = coffeeMaker0.addRecipe(recipe52);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook62 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str64 = recipeBook62.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array65 = recipeBook62.getRecipes();
    edu.ncsu.csc326.coffeemaker.Recipe recipe66 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i67 = recipe66.getPrice();
    java.lang.String str68 = recipe66.toString();
    boolean b69 = recipeBook62.addRecipe(recipe66);
    int i70 = recipe66.getAmtMilk();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str71 = coffeeMaker0.editRecipe(52, recipe66);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + ""+ "'", str57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + ""+ "'", str68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker1 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str4 = coffeeMaker1.editRecipe(0, recipe3);
    edu.ncsu.csc326.coffeemaker.Inventory inventory5 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i6 = inventory5.getMilk();
    int i7 = inventory5.getCoffee();
    inventory5.setChocolate((int)(byte)-1);
    inventory5.setCoffee((int)(byte)10);
    int i12 = inventory5.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe13 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b14 = inventory5.useIngredients(recipe13);
    boolean b15 = coffeeMaker1.addRecipe(recipe13);
    edu.ncsu.csc326.coffeemaker.Recipe recipe17 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i18 = recipe17.getPrice();
    int i19 = recipe17.getAmtChocolate();
    java.lang.String str20 = coffeeMaker1.editRecipe(0, recipe17);
    boolean b21 = coffeeMaker0.addRecipe(recipe17);
    int i22 = recipe17.getAmtSugar();
    int i23 = recipe17.getAmtChocolate();
    int i24 = recipe17.getAmtCoffee();
    int i25 = recipe17.getAmtCoffee();
    int i26 = recipe17.getAmtCoffee();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe4 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i5 = recipe4.getPrice();
    int i6 = recipe4.getAmtChocolate();
    java.lang.String str7 = recipeBook0.editRecipe(0, recipe4);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array8 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook9 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str11 = recipeBook9.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook12 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory13 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory13.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe19 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b20 = recipeBook16.addRecipe(recipe19);
    int i21 = recipe19.getAmtCoffee();
    int i22 = recipe19.getAmtCoffee();
    boolean b23 = inventory13.useIngredients(recipe19);
    java.lang.String str24 = recipe19.getName();
    boolean b25 = recipeBook12.addRecipe(recipe19);
    boolean b26 = recipeBook9.addRecipe(recipe19);
    boolean b27 = recipeBook0.addRecipe(recipe19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getSugar();
    int i8 = inventory0.getMilk();
    inventory0.setMilk(0);
    // The following exception was thrown during execution in test generation
    try {
    inventory0.addChocolate("Coffee: 1\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.InventoryException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.InventoryException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.InventoryException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = coffeeMaker0.addRecipe(recipe16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    edu.ncsu.csc326.coffeemaker.Recipe recipe16 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i17 = recipe16.getPrice();
    int i18 = recipe16.getAmtChocolate();
    java.lang.String str19 = coffeeMaker0.editRecipe(0, recipe16);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array20 = coffeeMaker0.getRecipes();
    java.lang.String str22 = coffeeMaker0.deleteRecipe((int)(short)1);
    java.lang.String str24 = coffeeMaker0.deleteRecipe(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker0 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe2 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str3 = coffeeMaker0.editRecipe(0, recipe2);
    edu.ncsu.csc326.coffeemaker.Inventory inventory4 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i5 = inventory4.getMilk();
    int i6 = inventory4.getCoffee();
    inventory4.setChocolate((int)(byte)-1);
    inventory4.setCoffee((int)(byte)10);
    int i11 = inventory4.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe12 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b13 = inventory4.useIngredients(recipe12);
    boolean b14 = coffeeMaker0.addRecipe(recipe12);
    java.lang.String str15 = coffeeMaker0.checkInventory();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str18 = recipeBook16.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array19 = recipeBook16.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = recipeBook16.addRecipe(recipe23);
    boolean b28 = coffeeMaker0.addRecipe(recipe23);
    edu.ncsu.csc326.coffeemaker.Inventory inventory29 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i30 = inventory29.getMilk();
    int i31 = inventory29.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook32 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str34 = recipeBook32.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe35 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b36 = recipeBook32.addRecipe(recipe35);
    int i37 = recipe35.getAmtCoffee();
    boolean b38 = inventory29.useIngredients(recipe35);
    boolean b39 = coffeeMaker0.addRecipe(recipe35);
    // The following exception was thrown during execution in test generation
    try {
    recipe35.setAmtSugar("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str15.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    edu.ncsu.csc326.coffeemaker.Recipe[] recipe_array3 = recipeBook0.getRecipes();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook4 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str6 = recipeBook4.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe7 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b8 = recipeBook4.addRecipe(recipe7);
    int i9 = recipe7.getAmtCoffee();
    int i10 = recipe7.getAmtCoffee();
    boolean b11 = recipeBook0.addRecipe(recipe7);
    recipe7.setName("hi!");
    recipe7.setName("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
    int i16 = recipe7.getAmtCoffee();
    int i17 = recipe7.getAmtSugar();
    // The following exception was thrown during execution in test generation
    try {
    recipe7.setAmtChocolate("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n");
      org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException");
    } catch (edu.ncsu.csc326.coffeemaker.exceptions.RecipeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("edu.ncsu.csc326.coffeemaker.exceptions.RecipeException")) {
        org.junit.Assert.fail("Expected exception of type edu.ncsu.csc326.coffeemaker.exceptions.RecipeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(recipe_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    int i5 = inventory0.getChocolate();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker6 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker7 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe9 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str10 = coffeeMaker7.editRecipe(0, recipe9);
    edu.ncsu.csc326.coffeemaker.Inventory inventory11 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i12 = inventory11.getMilk();
    int i13 = inventory11.getCoffee();
    inventory11.setChocolate((int)(byte)-1);
    inventory11.setCoffee((int)(byte)10);
    int i18 = inventory11.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe19 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b20 = inventory11.useIngredients(recipe19);
    boolean b21 = coffeeMaker7.addRecipe(recipe19);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i24 = recipe23.getPrice();
    int i25 = recipe23.getAmtChocolate();
    java.lang.String str26 = coffeeMaker7.editRecipe(0, recipe23);
    boolean b27 = coffeeMaker6.addRecipe(recipe23);
    int i28 = recipe23.getAmtSugar();
    boolean b29 = inventory0.useIngredients(recipe23);
    int i30 = recipe23.getAmtChocolate();
    java.lang.String str31 = recipe23.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe3 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b4 = recipeBook0.addRecipe(recipe3);
    int i5 = recipe3.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory6 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i7 = inventory6.getMilk();
    int i8 = inventory6.getCoffee();
    inventory6.setChocolate((int)(byte)-1);
    int i11 = inventory6.getChocolate();
    boolean b12 = recipe3.equals((java.lang.Object)inventory6);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook13 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str15 = recipeBook13.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook16 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    inventory17.setSugar((int)(short)-1);
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook20 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str22 = recipeBook20.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe23 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b24 = recipeBook20.addRecipe(recipe23);
    int i25 = recipe23.getAmtCoffee();
    int i26 = recipe23.getAmtCoffee();
    boolean b27 = inventory17.useIngredients(recipe23);
    java.lang.String str28 = recipe23.getName();
    boolean b29 = recipeBook16.addRecipe(recipe23);
    boolean b30 = recipeBook13.addRecipe(recipe23);
    boolean b31 = inventory6.useIngredients(recipe23);
    inventory6.setChocolate((int)'4');
    inventory6.setCoffee((int)(short)-1);
    inventory6.setChocolate((int)(byte)1);
    int i38 = inventory6.getMilk();
    int i39 = inventory6.getMilk();
    int i40 = inventory6.getChocolate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    edu.ncsu.csc326.coffeemaker.Inventory inventory0 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i1 = inventory0.getMilk();
    int i2 = inventory0.getCoffee();
    inventory0.setChocolate((int)(byte)-1);
    inventory0.setCoffee((int)(byte)10);
    int i7 = inventory0.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe8 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b9 = inventory0.useIngredients(recipe8);
    inventory0.setMilk(10);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker12 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker13 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe15 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str16 = coffeeMaker13.editRecipe(0, recipe15);
    edu.ncsu.csc326.coffeemaker.Inventory inventory17 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i18 = inventory17.getMilk();
    int i19 = inventory17.getCoffee();
    inventory17.setChocolate((int)(byte)-1);
    inventory17.setCoffee((int)(byte)10);
    int i24 = inventory17.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe25 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b26 = inventory17.useIngredients(recipe25);
    boolean b27 = coffeeMaker13.addRecipe(recipe25);
    edu.ncsu.csc326.coffeemaker.Recipe recipe29 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i30 = recipe29.getPrice();
    int i31 = recipe29.getAmtChocolate();
    java.lang.String str32 = coffeeMaker13.editRecipe(0, recipe29);
    boolean b33 = coffeeMaker12.addRecipe(recipe29);
    int i34 = recipe29.getAmtSugar();
    int i35 = recipe29.getAmtSugar();
    boolean b36 = inventory0.useIngredients(recipe29);
    int i37 = inventory0.getSugar();
    java.lang.String str38 = inventory0.toString();
    edu.ncsu.csc326.coffeemaker.Inventory inventory39 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i40 = inventory39.getMilk();
    int i41 = inventory39.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe42 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i43 = recipe42.getPrice();
    int i44 = recipe42.getAmtChocolate();
    int i45 = recipe42.getAmtCoffee();
    int i46 = recipe42.getPrice();
    boolean b47 = inventory39.useIngredients(recipe42);
    boolean b48 = inventory0.useIngredients(recipe42);
    int i49 = inventory0.getMilk();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"+ "'", str38.equals("Coffee: 10\nMilk: 15\nSugar: 15\nChocolate: 15\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 15);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook0 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str2 = recipeBook0.deleteRecipe((int)(byte)0);
    java.lang.String str4 = recipeBook0.deleteRecipe((int)(short)1);
    java.lang.String str6 = recipeBook0.deleteRecipe((int)(short)0);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker7 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe9 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str10 = coffeeMaker7.editRecipe(0, recipe9);
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker11 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.CoffeeMaker coffeeMaker12 = new edu.ncsu.csc326.coffeemaker.CoffeeMaker();
    edu.ncsu.csc326.coffeemaker.Recipe recipe14 = new edu.ncsu.csc326.coffeemaker.Recipe();
    java.lang.String str15 = coffeeMaker12.editRecipe(0, recipe14);
    edu.ncsu.csc326.coffeemaker.Inventory inventory16 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i17 = inventory16.getMilk();
    int i18 = inventory16.getCoffee();
    inventory16.setChocolate((int)(byte)-1);
    inventory16.setCoffee((int)(byte)10);
    int i23 = inventory16.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe24 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b25 = inventory16.useIngredients(recipe24);
    boolean b26 = coffeeMaker12.addRecipe(recipe24);
    edu.ncsu.csc326.coffeemaker.Recipe recipe28 = new edu.ncsu.csc326.coffeemaker.Recipe();
    int i29 = recipe28.getPrice();
    int i30 = recipe28.getAmtChocolate();
    java.lang.String str31 = coffeeMaker12.editRecipe(0, recipe28);
    boolean b32 = coffeeMaker11.addRecipe(recipe28);
    int i33 = recipe28.getAmtSugar();
    int i34 = recipe28.getAmtChocolate();
    int i35 = recipe28.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory36 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i37 = inventory36.getMilk();
    int i38 = inventory36.getCoffee();
    edu.ncsu.csc326.coffeemaker.RecipeBook recipeBook39 = new edu.ncsu.csc326.coffeemaker.RecipeBook();
    java.lang.String str41 = recipeBook39.deleteRecipe(0);
    edu.ncsu.csc326.coffeemaker.Recipe recipe42 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b43 = recipeBook39.addRecipe(recipe42);
    int i44 = recipe42.getAmtCoffee();
    boolean b45 = inventory36.useIngredients(recipe42);
    int i46 = recipe42.getAmtCoffee();
    edu.ncsu.csc326.coffeemaker.Inventory inventory47 = new edu.ncsu.csc326.coffeemaker.Inventory();
    int i48 = inventory47.getMilk();
    int i49 = inventory47.getCoffee();
    inventory47.setChocolate((int)(byte)-1);
    inventory47.setCoffee((int)(byte)10);
    int i54 = inventory47.getCoffee();
    edu.ncsu.csc326.coffeemaker.Recipe recipe55 = new edu.ncsu.csc326.coffeemaker.Recipe();
    boolean b56 = inventory47.useIngredients(recipe55);
    int i57 = inventory47.getCoffee();
    int i58 = inventory47.getChocolate();
    inventory47.setCoffee((int)' ');
    int i61 = inventory47.getCoffee();
    boolean b62 = recipe42.equals((java.lang.Object)inventory47);
    boolean b63 = recipe28.equals((java.lang.Object)b62);
    boolean b64 = coffeeMaker7.addRecipe(recipe28);
    boolean b65 = recipeBook0.addRecipe(recipe28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

}
