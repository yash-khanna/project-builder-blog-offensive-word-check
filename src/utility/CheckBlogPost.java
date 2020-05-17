package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		boolean result=false;
		if(checkBlogTitle(blog)==true) {
			if(checkBlogDescription(blog)==true) {
				result=true;				
			}else {
				result=false;
			}
		}else {
			result=false;
		}
		return result;
	}
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String array[]={"2 girls 1 cup","2g1c","4r5e","5h1t","5hit","a$$","a$$hole","a_s_s","a2m","a54","a55",""
				+ "a55hole","acrotomophilia","aeolus","ahole","alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e","areola","areole","arian"};
		String desc=blog.getBlogTitle();
		String des[]=desc.trim().split("\\s+");
		boolean result=true;
		for(int i=0;i<des.length;i++) {
			System.out.println(des[i]);
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		for(int i=0;i<des.length;i++) {
			for(int j=0;j<array.length;j++) {
				String a=array[j];
				String b=des[i];
				System.out.println(a+"sfnjkdmfkd"+b);
				if(a.equals(b)==false) {
					result=true;
				}else {
					result=false;break;
				}
			}
			if(result==false) {
				break;
			}
		}
		return result;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String array[]={"2 girls 1 cup","2g1c","4r5e","5h1t","5hit","a$$","a$$hole","a_s_s","a2m","a54","a55",""
				+ "a55hole","acrotomophilia","aeolus","ahole","alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e","areola","areole","arian"};
		String desc=blog.getBlogDescription();
		String des[]=desc.trim().split("\\s+");
		boolean result=true;
		for(int i=0;i<des.length;i++) {
			for(int j=0;j<array.length;j++) {
				String a=array[j];
				String b=des[i];
				if(a.equals(b)==false) {
					result=true;
				}else {
					result=false;break;
				}
			}
			if(result==false) {
				break;
			}
		}
		return result;
	}
	
}