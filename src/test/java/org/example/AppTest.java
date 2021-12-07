package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void isLeapYearsYearDivisibleBy400ShouldReturnTrue() {
    int year = 2000; //Arrange -> Année divisible par 400
    LeapYears leapYears = new LeapYears(); //Constructeur de la classe LeapYears
    //Nous avons besoin d'une instance de la classe LeapYears afin de pouvoir appeler la fonction isLeapYears
    boolean isLeapYears = leapYears.isLeapYears(year); //Act -> On regarde le résultat avec l'année que nous avons renseignée durant l'étape Arrange.
    Assert.assertTrue(isLeapYears); //Assert -> Le test est bon si isLeapYears est vrai.
    }

    @Test
    public void isLeapYearsYearDivisibleBy100ButNotBy400ShouldReturnFalse() {
    //Arrange
    int year = 1900;
    LeapYears leapYears = new LeapYears();
    //Act
    boolean isLeapYears = leapYears.isLeapYears(year);
    //Assert
    Assert.assertFalse(isLeapYears);
    }
    @Test
    public void isLeapYearsYearDivisibleBy4ButNotBy100ShouldReturnTrue() {
    //Arrange
    int year = 1960;
    LeapYears leapYears = new LeapYears();
    //Act
    boolean isLeapYears = leapYears.isLeapYears(year);
    //Assert
    Assert.assertTrue(isLeapYears);
    }


    @Test
    public void isLeapYearsYearNotDivisibleBy4ShouldReturnFalse(){
    //Arrange
    int year = 2019;
    LeapYears leapYears = new LeapYears();
    //Act
    boolean isLeapYears = leapYears.isLeapYears(year);
    //Assert
    Assert.assertFalse(isLeapYears);
    }

    @Test
    public void isTataYoyoDivisibleBy3ShouldReturnTata()
    {
        //Arrange
        int nb = 3;
        TataYoyo tataYoyo = new TataYoyo();
        //Act
        String  isTataYoyo = tataYoyo.isTataYoyo(nb);
        //Assert
        Assert.assertEquals("Tata",isTataYoyo);
    }

    @Test
    public void isTataYoyoDivisibleBy5ShouldReturnYoyo()
    {
        //Arrange
        int nb = 20;
        TataYoyo tataYoyo = new TataYoyo();
        //Act
        String  isTataYoyo = tataYoyo.isTataYoyo(nb);
        //Assert
        Assert.assertEquals("Yoyo",isTataYoyo);
    }

    @Test
    public void isTataYoyoDivisibleBy5And3ShouldReturnTataYoyo()
    {
        //Arrange
        int nb = 15;
        TataYoyo tataYoyo = new TataYoyo();
        //Act
        String  isTataYoyo = tataYoyo.isTataYoyo(nb);
        //Assert
        Assert.assertEquals("TataYoyo",isTataYoyo);
    }

    @Test
    public void isBonjourHaveNameReturnBonjourName()
    {
        //Arrange
        String nom="Cloud";
        Bonjour bonjour= new Bonjour();
        String isSaluer= bonjour.saluer(nom);
        //Assert
        Assert.assertEquals("Bonjour, Cloud.",isSaluer);
    }


    @Test
    public void isBonjourHaveNULLNameReturnBonjourAmi()
    {
        //Arrange
        String nom=null;
        Bonjour bonjour= new Bonjour();
        String isSaluer= bonjour.saluer(nom);
        //Assert
        Assert.assertEquals("Bonjour, Cloud.",isSaluer);
    }
}
