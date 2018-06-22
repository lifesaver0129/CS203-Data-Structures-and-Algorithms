package class6_KMP;

public class MaxSubStr {
	/*
	 * 寻找str1和str2最长子串：
	 * 若str1长度 > str2长度，设len = str2.length(),依次取str2的中长度
	 * 为len,len-1,len-2...的所有子串，判断是否包含在str1中,首次得到的包含
	 * 在str1中的子串即为最长子串。
	 *
	 * 若str1长度 <= str2长度，设len = str1.length(),依次取str1的中长度
	 * 为len,len-1,len-2...的所有子串，判断是否包含在str2中，首次得到的包含
	 * 在str2中的子串即为最长子串。
	 */
	public static String  MaxSubStr1(String str1, String str2){
		String str = "";
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if (len1 > len2){
			for(int i = len2;  i > 0; i--)
				for(int j = 0; j <= len2-i; j++){
					str = str2.substring(j,j+i);
					KMP kmp = new KMP(str1, str);
					kmp.findNext();
					if(kmp.KMPStrMatch() >= 0){
						return str;
					}
				}
		}else{
			for(int i = len1;  i > 0; i--)
				for(int j = 0; j < len1-i; j++){
					str = str1.substring(j,j+i);
					KMP kmp = new KMP(str2, str);
					kmp.findNext();
					if(kmp.KMPStrMatch() >= 0)
						return str;
				}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String s = MaxSubStr1("errorcorrectingcodedistance","linearcodes");
		System.out.println(s);
	}

}
