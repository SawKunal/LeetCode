class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(int i=0; i<strs.length; i++){
            if(prefix == ""){
                return "";
            }
            String tempString = "";
            int searchSize = Math.min(prefix.length(), strs[i].length());

            for(int j=0; j<searchSize; j++){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                tempString += prefix.charAt(j);
            }
            prefix = tempString;
        }
        return prefix;
    }
}