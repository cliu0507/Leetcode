/*
389. Find the Difference

Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.
*/




Hashtable
public class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hash1 = new HashMap<Character, Integer>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!hash1.containsKey(s.charAt(i)))
            {
                hash1.put(s.charAt(i) , 1);
            }
            else
            {
                int freq = hash1.get(s.charAt(i));
                hash1.put(s.charAt(i), freq+1);
            }
        }
        for(int j = 0 ; j < t.length();j++)
        {
            if(hash1.containsKey(t.charAt(j)))
            {
                int freq = hash1.get(t.charAt(j));
                if(freq == 0)
                    return t.charAt(j);
                hash1.put(t.charAt(j), freq-1);
            }
            else
                return t.charAt(j);
        }
        return t.charAt(0);
    }
}


Bitwise Manipulation
public class Solution {
    public char findTheDifference(String s, String t) {
        StringBuffer p = new StringBuffer(s);
        p.append(t);
        String str = p.toString();
        int result = str.charAt(0);
        for(int i = 1 ; i < str.length() ; i++)
        {
            result = (int)result ^ (int)str.charAt(i);
        }
        return (char)result;
    }
}



public char findTheDifference(String s, String t) {
    int n = t.length();
    char c = t.charAt(n - 1);
    for (int i = 0; i < n - 1; ++i) {
        c ^= s.charAt(i);
        c ^= t.charAt(i);
    }
    return c;
}