package com.ku.informationRetrieval.SearchEngine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveStopWords {
	
	
	public void removeStopWords(String [] words)
	{
		ArrayList<String> wordsList = new ArrayList<String>();
		String sCurrentLine;
		Set<String> stopWordsSet = new HashSet<String>();
		try{
		        FileReader fr=new FileReader("F:\\stopwordslist.txt");
		        BufferedReader br= new BufferedReader(fr);
		        while ((sCurrentLine = br.readLine()) != null){
		        	stopWordsSet.add(sCurrentLine);
		        }
		        br.close();
		       
		        for(String word : words)
		        {
		            String wordCompare = word.toUpperCase();
		            if(!stopWordsSet.contains(wordCompare))
		            {
		                wordsList.add(word);
		            }
		        }
		        
		        
		    }catch(Exception ex){
		        System.out.println(ex);
		    }
		finally
		{
			
		}
	}

}
