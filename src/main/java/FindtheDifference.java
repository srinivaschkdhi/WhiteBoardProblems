/*389. Find the Difference
Easy
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.*/

pulic class FindtheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char c : t.toCharArray()){
            if(map.containsKey(c) &&  map.get(c) == 0 || !map.containsKey(c))
                return c;
            else
                map.put(c,map.get(c) -1);
        }
        
        return '!';
    }
}
