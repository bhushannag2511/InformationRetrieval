package com.ku.informationRetrieval.SearchEngine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveStopWords {
	
	
<<<<<<< HEAD
	public void removeStopWords(String [] words)
	{
		ArrayList<String> wordsList = new ArrayList<String>();
		String sCurrentLine;
=======
	public void removeStopWords()
	{
		ArrayList<String> wordsList = new ArrayList<String>();
		String sCurrentLine;
		String[] stopwords = new String[2000];
>>>>>>> 1430cf55f20ac350c2307a221c16fe77720909bd
		Set<String> stopWordsSet = new HashSet<String>();
		try{
		        FileReader fr=new FileReader("F:\\stopwordslist.txt");
		        BufferedReader br= new BufferedReader(fr);
		        while ((sCurrentLine = br.readLine()) != null){
		        	stopWordsSet.add(sCurrentLine);
		        }
		        br.close();
		       
<<<<<<< HEAD
		        for(String word : words)
		        {
		            String wordCompare = word.toUpperCase();
		            if(!stopWordsSet.contains(wordCompare))
		            {
		                wordsList.add(word);
		            }
		        }
		        
		        
=======
>>>>>>> 1430cf55f20ac350c2307a221c16fe77720909bd
		    }catch(Exception ex){
		        System.out.println(ex);
		    }
		finally
		{
			
		}
	}

}
