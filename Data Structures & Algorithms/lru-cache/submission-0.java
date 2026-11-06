class LRUCache {
    HashMap<Integer,Integer> map;
    LinkedHashSet<Integer> s;
    int l;
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.s = new LinkedHashSet<>();
        this.l = capacity;
    }
    
    public int get(int key) {
        if(this.map.containsKey(key))
        {
            this.s.remove(key);
            this.s.add(key);
            return this.map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) 
    {
        if(this.map.size()<l||this.map.containsKey(key))
        {
            this.map.put(key,value);
            if(this.map.containsKey(key))
                this.s.remove(key);
            this.s.add(key);
            return;
        }
        int old = this.s.iterator().next();
        this.map.remove(old);
        this.s.remove(old);
        this.map.put(key,value);
        this.s.add(key);
    }


}
