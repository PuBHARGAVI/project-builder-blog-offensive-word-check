package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String[] badwordsarray= {"2 girls 1 cup","2g1c","4r5e","5h1t" ,"5hit","a$$","a$$hle","a_s_","a2m","a54","a55","a55hle","acroomophilia","aeols","ahol","alabma hot pocket","alasan pipeline","anal","analimpaler","analleakage","analrobe","anilngus","anus","apesit","ar5e"};
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		for(String badwords:badwordsarray) {
			if(blog.getBlogTitle().contains(badwords)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		for(String badwords:badwordsarray) {
			if(blog.getBlogDescription().contains(badwords)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		return checkBlogTitle(blog) && checkBlogDescription(blog);
		
	}
	
}