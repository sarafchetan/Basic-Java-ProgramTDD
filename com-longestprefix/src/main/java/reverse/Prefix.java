package reverse;

import java.util.Arrays;

public class Prefix {


	public String commonStringPrefix(String[] strArr) {

		if(strArr.length == 0) {
			return null;
		}else {
			String minStr=getMinString(strArr);
			int minPrefixStrLength=minStr.length();
			for(int i=0;i<strArr.length;i++){
				int j;
				for( j=0;j<minPrefixStrLength;j++){
					if(minStr.charAt(j)!=strArr[i].charAt(j))
						break;
				}
				if(j<minPrefixStrLength)
					minPrefixStrLength=j;
			}
			return minStr.substring(0,minPrefixStrLength);

		}


	}

	public String getMinString(String[] strArr)
	{
		String minStr=strArr[0];
		for(int i=1;i<strArr.length;i++){
			if(strArr[i].length()<minStr.length())
				minStr=strArr[i];
		}
		return minStr;
	}







}
