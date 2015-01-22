/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Obeo - initial API and implementation
 *******************************************************************************/
package fr.esir.lsi.aspect;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import activity.Activity;
import activity.ActivityPackage;
import exploitation.Exploitation;
import exploitation.ExploitationPackage;
import fr.esir.lsi.aspect.ParserCSV.Donneejour;
/**
 * Entry point of the 'Generate' generation module.
 *
 * @generated
 */
public class Main {


	public static void main(String[] args) {
		try {

			XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();

			if (!EPackage.Registry.INSTANCE.containsKey(ExploitationPackage.eNS_URI)) {
				EPackage.Registry.INSTANCE.put(ExploitationPackage.eNS_URI, ExploitationPackage.eINSTANCE);
			}
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);
			ResourceSetImpl rs = new ResourceSetImpl();
			//TODO put chemin of exploitation
			String uri = "/home/jean/Documents/git/runtime-EclipseApplication/Test/src/test.exploitation";
			URI modelURI = URI.createFileURI(uri);
			File file = new File(System.getProperty("user.dir")+File.separator+"Test.txt");

			Resource res = rs.getResource(modelURI, true);
			Exploitation act = ((Exploitation) res.getContents().get(0)); 
			
			HashMap<Integer , ArrayList<String>> hm = new HashMap<Integer, ArrayList<String>>();
			ArrayList<Donneejour> donj = ParserCSV.parse();
//			for(Donneejour j : donj){
//				
//			}
			String result = act.parcours();	
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(result);
			bw.close();
			System.out.println(result);
			String[] nbjour = null;
			File file2 = new File("/home/jean/Documents/git/runtime-EclipseApplication/Test/src-gen/greetings.txt");
		    Scanner scanner = new Scanner(new FileReader(file2));
		    try {
		        //first use a Scanner to get each line
		        while (scanner.hasNextLine()){
		            String line = scanner.nextLine();
		            nbjour = line.split(" ");
		        }
		    }
		    finally {
		        //ensure the underlying stream is always closed
		        //this only has any effect if the item passed to the Scanner
		        //constructor implements Closeable (which it does in this case).
		        scanner.close();
		    }
		    
		    String[] nbjour2 = result.split(" ");
		    double nb = Double.parseDouble(nbjour[0]);
		    double nb2 = Double.parseDouble(nbjour2[0]);
		    int nb1 = Integer.parseInt(nbjour[1]);
		    int nb21 = Integer.parseInt(nbjour2[1]);
		    
		    
		    
		    
		    if(nb > nb2 && nb1 > nb21){
		    	System.out.println("Exploitation fail");
		    }else{
		    	System.out.println("Exploitation succes");
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

