package com.Chilja.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.Chilja.game.Card;

class CardTest {
	
	String brand = "VW";
	String model = "Golf Plus";
	Double displacement = 1.6;
	Double zeroToHundred = 12.0;
	Integer maxSpeed = 180;
	Integer horsepower = 120;
	private Card card;
	
	@Test
	public void nullIsNotProcessed() {
		assertThrows(NullPointerException.class, () -> {
			Double zeroToHundred = null;
			card = new Card(brand, model, displacement, zeroToHundred, maxSpeed, horsepower);
		});
	}
	
	@Nested
	class cardIsSet {		
		@BeforeEach
		public void setUp() {
			card = new Card(brand, model, displacement, zeroToHundred, maxSpeed, horsepower);
		}
		
		@Test
		public void brandIsSet() {
			String actualBrand = card.getBrand();
			assertEquals(brand, actualBrand);
		}

		@Test
		public void modelIsSet() {
			String actualModel = card.getModel();
			assertEquals(model, actualModel);
		}
		
		@Test
		public void DisplacementIsSet() {
			Double actualDisplacement = card.getDisplacement();
			assertEquals(displacement, actualDisplacement);
		}
		
		@Test
		public void zeroToHundredIsSet() {
			Double actualZeroToHundred = card.getZeroToHundred();
			assertEquals(zeroToHundred, actualZeroToHundred);
		}
		
		@Test
		public void maxSpeedIsSet() {
			Integer actualMaxSpeed = card.getMaxSpeed();
			assertEquals(maxSpeed, actualMaxSpeed);
		}
		
		@Test
		public void horsepowerIsSet() {
			Integer actualHorsepower = card.getHorsepower();
			assertEquals(horsepower, actualHorsepower);
		}
	}
	
	@Nested
	class setterFunctionsChangeTheObject {		
		@BeforeEach
		public void setUp() {
			card = new Card(brand, model, displacement, zeroToHundred, maxSpeed, horsepower);
		}
		
		@Test
		public void brandIsChanged() {			
			String newBrand = "Mercedes";
			card.setBrand(newBrand);
			
			assertEquals(newBrand, card.getBrand());
		}

		@Test
		public void modelIsChanged() {
			String newModel = "A-Model";
			card.setModel(newModel);
			
			assertEquals(newModel, card.getModel());
		}
		
		@Test
		public void DisplacementIsChanged() {
			Double newDisplacement = 2.0;
			card.setDisplacement(newDisplacement);

			assertEquals(newDisplacement, card.getDisplacement());
		}
		
		@Test
		public void zeroToHundredIsChanged() {
			Double newZeroToHundred = 8.3;
			card.setZeroToHundred(newZeroToHundred);

			assertEquals(newZeroToHundred, card.getZeroToHundred());
		}
		
		@Test
		public void maxSpeedIsChanged() {
			Integer newMaxSpeed = 210;
			card.setMaxSpeed(newMaxSpeed);

			assertEquals(newMaxSpeed, card.getMaxSpeed());
		}
		
		@Test
		public void horsepowerIsChanged() {
			Integer newHorsepower = 156;
			card.setHorsepower(newHorsepower);

			assertEquals(newHorsepower, card.getHorsepower());
		}
	}
	
	@Test
	void idIsSet() {
		card = new Card(brand, model, displacement, zeroToHundred, maxSpeed, horsepower);
		card.setId(1);
		
		assertEquals(1, card.getId());
	}
}
