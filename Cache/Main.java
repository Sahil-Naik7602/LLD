public class Main {
    public static void main(String[] args) {
//        LFUCacheBruteForce cache = new LFUCacheBruteForce(3);
        LFUCacheDobleLL cache = new LFUCacheDobleLL(3);
        cache.put(1,600);
        cache.put(2,400);
//        cache.printFrequencyTable();

        System.out.println(cache.get(2));
        System.out.println(cache.get(1));

        cache.put(4,200);
        cache.printCache();
        cache.put(3,600);
        cache.printCache();

    }
}
