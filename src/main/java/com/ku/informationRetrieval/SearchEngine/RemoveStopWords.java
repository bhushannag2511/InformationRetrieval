package com.ku.informationRetrieval.SearchEngine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveStopWords {
	
	
	public void removeStopWords()
	{
		ArrayList<String> wordsList = new ArrayList<String>();
		String sCurrentLine;
		String[] stopwords = new String[2000];
		Set<String> stopWordsSet = new HashSet<String>();
		try{
		        FileReader fr=new FileReader("F:\\stopwordslist.txt");
		        BufferedReader br= new BufferedReader(fr);
		        while ((sCurrentLine = br.readLine()) != null){
		        	stopWordsSet.add(sCurrentLine);
		        }
		        br.close();
		       
		    }catch(Exception ex){
		        System.out.println(ex);
		    }
		finally
		{
			
		}
	}

}
