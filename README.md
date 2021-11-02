# File-Indexer

This project goes through a text file that is passed to it and extracts each word, then adds the word and its line number to an AVL tree. Each element of the AVL tree contains a unique word and a LinkedList of line numbers where that word occurs. It then displays a list of unique words in the text file and the corresponding line numbers. The file being indexed should be passed into the program as a command line argument.

The AVL tree is constructed via the AVLTree class of String objects. It contains the following methods:

public void indexWord(String word, int line) - adds an occurrence of the word w in line l. If a word already exists in the AVL Tree, adds the new line number to the existing node.

public List getLinesForWord(String word) - returns a list of lines in which the passed word occurs.

public void printIndex() - prints out each unique word that is stored in the AVL tree along with a list of line numbers in which that word appears.
