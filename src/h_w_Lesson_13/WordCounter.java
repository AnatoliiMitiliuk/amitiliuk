package h_w_Lesson_13;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "System.exit() can be used to run shutdown hooks before the program quits.  This is a convenient way to handle shutdown in bigger programs, where all parts of the program can't (and shouldn't) be aware of each other. Then, if someone wants to quit, he can simply call System.exit(), and the shutdown hooks (if properly set up) take care of doing all necessary shutdown ceremonies such as closing files, releasing resources etc.\n" +
                "\n" +
                "\"This method never returns normally.\" means just that the method won't return; once a thread goes there, it won't come back.\n" +
                "\n" +
                "Another, maybe more common, way to quit a program is to simply to reach the end of the main method. But if there are any non-daemon threads running, they will not be shut down and thus the JVM will not exit. Thus, if you have any such non-daemon threads, you need some other means (than the shutdown hooks) to shut down all non-daemon threads and release other resources. If there are no other non-daemon threads, returning from main will shut down the JVM and will call the shutdown hooks.\n" +
                "\n" +
                "For some reason shutdown hooks seem to be an undervalued and misunderstood mechanism, and people are reinventing the wheel with all kind of proprietary custom hacks to quit their programs. I would encourage using shutdown hooks; it's all there in the standard Runtime that you'll be using anyway.";
        String[] wordsArr = text.split("[ .,()]|[0-9]");

        Map<String, Integer> wordCount = new HashMap<>();
        fillMap(wordCount, wordsArr);
        System.out.println(wordCount);
    }

    public static Map<String, Integer> fillMap(Map<String, Integer> map, String[] arr) {
        for (String s : arr) {
            if (!s.equals("")) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s)+1);
                }
            }
        }
        return map;
    }
}
