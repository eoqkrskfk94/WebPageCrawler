package edu.handong.csee.java.bonus;
import java.net.*;
import java.io.*;

public class URLReader {
	public void urlRead(String site, String path) throws Exception {

		URL website = new URL(site);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(website.openStream()));
        
        
        
        
        if(path.startsWith("/")) {
        	path = path.concat("/index.html");
        	//System.out.println(path);
        }
        if(path.startsWith("c:")) {
        	//path = path.replaceAll("\", "d");
        	path = path.concat("\\index.html");
        	//System.out.println(path);
        }
        
        //System.out.println(path);
        
        
        File saveFile = new File(path);
		BufferedWriter out = new BufferedWriter(new FileWriter(saveFile));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	//System.out.println(inputLine);
        	out.write(inputLine);
        }
          
        in.close();
        out.close();
    }
} 
