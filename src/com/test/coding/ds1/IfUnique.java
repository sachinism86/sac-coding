package com.test.coding.ds1;

/**
 * Created by ssachin on 6/22/18.
 */
public class IfUnique {

    public static boolean ifUnique(String s) {
                /*
                for(int i=0;i< s.length()-1; i++) {
                        for(int j=i+1;j<s.length();j++) {
                                if(s.charAt(i) == s.charAt(j)) {
                                        return false;
                                }
                        }

                }*/
        int startPointer;
        int endPointer;
        String longestSubstring = null;
        startPointer = endPointer = 0;
        for(int i=1;i<s.length();i++) {
            endPointer = i;
            for(int j=startPointer;j<endPointer;j++) {
                if(s.charAt(j) == s.charAt(endPointer)) {
                    if(longestSubstring == null || (longestSubstring != null &&
                            s.substring(startPointer, endPointer).length() > longestSubstring.length())) {
                        longestSubstring = s.substring(startPointer, endPointer);
                    }
                    startPointer = endPointer;
                    break;
                }
            }
        }
        if(endPointer == s.length()-1 ) {
            longestSubstring = s.substring(startPointer);
        }
        //return longestSubstring;
        System.out.print("LONGEST SUBSTRING IS :: "+longestSubstring);


        return true;
    }

}

