package co.ude.udea.romancoverter.test;

import co.edu.udea.romanconverter.program.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestConverter {

	@Test
	public void ConverterZero() {
		Converter converter = new Converter();
		 String numberConverted = converter.toRoman(0);
		 assertEquals(null,numberConverted);
	}

	@Test
	public void ConverterOne() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(1);
		assertEquals("I",numberConverted);
	}

	@Test
	public void ConverterTwo() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(2);
		assertEquals("II",numberConverted);
	}
	
	@Test
	public void ConverterTree() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(3);
		assertEquals("III",numberConverted);
	}
	
	@Test
	public void ConverterFive() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(5);
		assertEquals("V",numberConverted);
	}
	
	@Test
	public void ConverterSeven() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(7);
		assertEquals("VII",numberConverted);
	}
	
	@Test
	public void ConverterNine() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(9);
		assertEquals("IX",numberConverted);
	}
	
	@Test
	public void ConverterTen() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(10);
		assertEquals("X",numberConverted);
	}
	
	@Test
	public void ConverterNineteen() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(19);
		assertEquals("XIX",numberConverted);
	}
	
	@Test
	public void ConverterTwenty() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(20);
		assertEquals("XX",numberConverted);
	}
	
	@Test
	public void ConverterTwentySeven() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(27);
		assertEquals("XXVII",numberConverted);
	}
	
	@Test
	public void ConverterThirty() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(30);
		assertEquals("XXX",numberConverted);
	}
	
	@Test
	public void ConverterThirtyFive() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(35);
		assertEquals("XXXV",numberConverted);
	}
	
	@Test
	public void ConverterForty() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(40);
		assertEquals("XL",numberConverted);
	}
	
	@Test
	public void ConverterFortyEight() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(48);
		assertEquals("XLVIII",numberConverted);
	}
	
	@Test
	public void ConverterFortyNine() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(49);
		assertEquals("XLIX",numberConverted);
	}
	
	@Test
	public void ConverterFyfty() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(50);
		assertEquals("L",numberConverted);
	}
	
	@Test
	public void ConverterNinety() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(90);
		assertEquals("XC",numberConverted);
	}
	
	@Test
	public void ConverterHundred() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(100);
		assertEquals("C",numberConverted);
	}
	
	@Test
	public void ConverterHundredNinety() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(190);
		assertEquals("CXC",numberConverted);
	}
	
	@Test
	public void ConverterTwoHundredEigthy() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(280);
		assertEquals("CCLXXX",numberConverted);
	}
	
	@Test
	public void ConverterfiveHundred() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(500);
		assertEquals("D",numberConverted);
	}
	
	@Test
	public void ConverterSixHundred() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(600);
		assertEquals("DC",numberConverted);
	}
	
	@Test
	public void ConverterEigthHundred() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(800);
		assertEquals("DCCC",numberConverted);
	}
	
	@Test
	public void ConverterNineHundredNinetyNine() {
		Converter converter = new Converter();
		String numberConverted = converter.toRoman(999);
		assertEquals("CMXCIX",numberConverted);
	}
	
}