package test;

import org.junit.Assert;
import org.junit.Test;

import piratas.Pirata;

public class TestPirata {

		private Pirata sparrow = new Pirata();
		private Pirata barbosa = new Pirata();
		private Pirata gangplank = new Pirata();
		
		@Test
		public void ataca(){
			sparrow.atacar(barbosa);
			Assert.assertEquals(3, sparrow.getPtos());
		}
		
		@Test
		public void generaEscorbuto(){
			gangplank.tomarGrog();
			gangplank.tomarGrog();
			gangplank.tomarGrog();
			
			Assert.assertEquals(-1, gangplank.getEstado());
		}
		
		@Test
		public void eliminarEscorbuto(){
			gangplank.tomarGrog();
			gangplank.tomarGrog();
			gangplank.tomarGrog();
			
			gangplank.tomarNaranja();
			Assert.assertEquals(0, gangplank.getEstado());
		}
		
		@Test
		public void sadismo(){
			barbosa.tomarNaranja();
			Assert.assertEquals(1, barbosa.getEstado());
		}
		
		@Test
		public void atacarConSadismo(){
			barbosa.tomarNaranja();
			barbosa.atacar(gangplank);
			Assert.assertEquals(8, barbosa.getPtos());
			
		}
}
