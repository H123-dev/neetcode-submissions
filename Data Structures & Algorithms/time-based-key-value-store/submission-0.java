class TimeMap {

    HashMap<String, ArrayList<HashMap<Integer, String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key))
            map.put(key, new ArrayList<>());

        HashMap<Integer, String> entry = new HashMap<>();
        entry.put(timestamp, value);
        map.get(key).add(entry);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";

        ArrayList<HashMap<Integer, String>> list = map.get(key);
        int left = 0, right = list.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = (left + right) / 2;
            HashMap<Integer, String> entry = list.get(mid);
            int t = entry.keySet().iterator().next();

            if (t <= timestamp) {
                result = entry.get(t);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}