package com.ku.informationRetrieval.SearchEngine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class HTMLparser {
	public static void main(String []args){
		String directoryLocation="/Users/Anil/Downloads/docsnew/";
		/*
		 * read directory
		 */
		File file = new File(directoryLocation);

		/*
		 * read all files in the directory
		 */

		File []files = file.listFiles();

		/*
		 * loop through the files to read its contents
		 */
		//for(File indi: files){
		for(int i=0;i<1;i++){
			//	System.out.println(files[i]);


			/*
			 * read contents of file
			 */
			BufferedReader reader = null;
			try{
				reader = new BufferedReader(new FileReader(files[i]));
				String line = null;
				final String pattern = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
				final String scriptPattern = "(?s)<script.*?(/>|</script>)";
				StringBuilder sb = new StringBuilder();
				/*
				 * create pattern object
				 */
				//Pattern htmlTags = Pattern.compile(pattern);
				//Pattern scriptTag = Pattern.compile(scriptPattern);
				while(true){
					line = reader.readLine();
					sb.append(line);
					if(line ==null){
						//System.out.println("No contents in the file");
						break;
					}
				}
				line = sb.toString();
				System.out.println(line.replaceAll(scriptPattern, "").replaceAll(pattern, ""));
			}catch(Exception e){
				e.getStackTrace();
			}finally{
				if(reader !=null){
					try{
						reader.close();
					}catch(IOException io){
						io.printStackTrace();
					}
				}
			}
		}
	}

}
