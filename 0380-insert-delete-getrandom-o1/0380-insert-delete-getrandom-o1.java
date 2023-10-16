class RandomizedSet {

    ArrayList<Integer> nums;
    HashMap<Integer, Integer> loc;
    java.util.Random rand = new java.util.Random();

    public RandomizedSet() {
        nums = new ArrayList<>();
        loc = new HashMap<>();
    }
    
    public boolean insert(int val) {
        boolean contain = loc.containsKey(val);
        if (contain) return false;

        loc.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        boolean contain = loc.containsKey(val);
        if (!contain) return false;
        
        int idx = loc.get(val);
        if (idx < nums.size()) {
            int lastOne = nums.get(nums.size() - 1);
            nums.set(idx, lastOne);
            loc.put(lastOne, idx);
        }
        nums.remove(nums.size() - 1);
        loc.remove(val);

        return true;
    }
    
    public int getRandom() {
        return nums.get( rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */