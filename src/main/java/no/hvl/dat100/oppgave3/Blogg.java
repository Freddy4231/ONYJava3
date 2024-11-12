package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell; //innleggtabell referanse av Innlegg
	private int nesteledig;
	
	// TODO: objektvariable 

	public Blogg() {
	innleggtabell = new Innlegg[20];
	nesteledig = 0; 
		//	throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;  
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteledig; 
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell; 
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i = 0; i < nesteledig; i++) {	
			if (innleggtabell[i].erLik(innlegg)) {
					return i; 
		}		
	}
		return -1;
		
		//throw new UnsupportedOperationException(TODO.method());
}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return true; 
			}
		}
		return false; 
		//		innleggtabell = new boolean[Innlegg.length];
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
//		for (int i = 0; i < nesteledig; i++) {
//			if(innleggtabell[i] == null) {
//				return true; 
//			}
//			
//		}
//		return false; 
		
		return nesteledig < innleggtabell.length; 
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return false; 
			}
		}
		
			if (nesteledig < innleggtabell.length) {
				innleggtabell[nesteledig] = innlegg;  
				nesteledig++; 
				return true; 
				
			} 
				return false; 
			
		//	throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		return "2\nTEKST\n1\nOle Olsen\n23-10\n0\nen tekst\nBILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n";
		
		
		//	throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}