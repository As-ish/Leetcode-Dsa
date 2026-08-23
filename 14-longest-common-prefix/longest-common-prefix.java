class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Pehli string ko initially prefix maan lo
        String prefix = strs[0];

        // Baaki sab strings ke saath compare karo
        for (int i = 1; i < strs.length; i++) {

            // Jab tak current string prefix se start nahi hoti,
            // prefix ka last character remove karte raho
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // Agar common prefix hi nahi bacha
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}