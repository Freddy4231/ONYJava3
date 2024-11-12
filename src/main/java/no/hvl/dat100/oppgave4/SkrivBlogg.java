package no.hvl.dat100.oppgave4;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import no.hvl.dat100.oppgave1.Innlegg;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

public static boolean skriv(Blogg samling, String mappe, String filnavn) {
	 File dir = new File(mappe);
     if (!dir.exists()) {
         dir.mkdirs();
     }
 
     try {
         File fil = new File(mappe, filnavn);
         PrintWriter writer = new PrintWriter(fil);
      
         writer.println(samling.getAntall());
        
         for (Innlegg innlegg : samling.getSamling()) {
             if (innlegg != null) {
                 writer.println(innlegg.toString());
             }
         }

         writer.close(); 
         return true; 

     } catch (FileNotFoundException e) {
         e.printStackTrace();
        return false; 
        
     	} 						//throw new UnsupportedOperationException(TODO.method());
	}
}
