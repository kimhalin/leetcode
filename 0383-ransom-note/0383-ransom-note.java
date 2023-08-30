class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            Character c = ransomNote.charAt(i);
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            Character c = magazine.charAt(i);
            if (map.containsKey(c))
                map.put(c, map.get(c) - 1);
            if (map.get(c) != null && map.get(c).equals(0))
                map.remove(c);
        }

        return map.isEmpty();
    }
}