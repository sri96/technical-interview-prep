import java.util.*;

public class WordLadderSolution{

    class State {
        String word;
        int length;

        State(String word, int length) {
            this.word = word;
            this.length = length;
        }
    }

    private static Queue<State> queue = new ArrayDeque<>();
    private static Set<String> dictionary = new HashSet<>();
    private static final String CONST = "abcdefghijklmnopqrstuvwxyz";
    private static Set<String> done = new HashSet<>();

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        System.out.println(new WordLadderSolution().ladderLength("hit", "cog", list));
    }


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        dictionary.addAll(wordList);
        queue.offer(new State(beginWord, 0));
        done.add(beginWord);
        while (!queue.isEmpty()) {
            State head = queue.poll();
            if (head.word.equals(endWord))
                return head.length + 1;
            for (int loopVariableI = 0, length = CONST.length(); loopVariableI < length; loopVariableI++) {
                StringBuilder word = new StringBuilder(head.word);
                for (int loopVariableJ = 0, lengh = word.length(); loopVariableJ < lengh; loopVariableJ++) {
                    char old = word.charAt(loopVariableJ);
                    word.replace(loopVariableJ, loopVariableJ + 1, String.valueOf(CONST.charAt(loopVariableI)));
                    if (!done.contains(word.toString())) {
                        if (dictionary.contains(word.toString())) {
                            done.add(word.toString());
                            queue.offer(new State(word.toString(), head.length + 1));
                        }
                    }
                    word.replace(loopVariableJ, loopVariableJ + 1, String.valueOf(old));
                }
            }
        }
        return 0;
    }

}
