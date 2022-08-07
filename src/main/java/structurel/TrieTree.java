package structurel;


public class TrieTree {
    private TrieTree[] children;
    private boolean isEnd;

    public TrieTree() {
        children = new TrieTree[26];
        isEnd = false;
    }

    public void insert(String word) {
        TrieTree node = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieTree();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieTree node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private TrieTree searchPrefix(String word) {
        TrieTree node = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }


}
