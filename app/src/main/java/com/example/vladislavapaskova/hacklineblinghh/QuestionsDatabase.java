package com.example.vladislavapaskova.hacklineblinghh;
import java.util.Hashtable;
/**
 * Created by vladislavapaskova on 11/7/15.
 */
public class QuestionsDatabase {
    //Hashtable(String, Question> database = new Hashtable<String, Question>();
    private String array;
    private String ll;
    private String tree;
    private String stacks;

    private String stackans1 = "public static boolean isValid(String s) {"
            + "\nHashMap<Character, Character> map = new HashMap<Character, Character>();"
            + "\nmap.put('(', ')');"
            + "\nmap.put('[', ']');"
            + "\nmap.put('{', '}');"
            + "\n\nStack<Character> stack = new Stack<Character>();"
            + "\n\n\rfor (int i = 0; i < s.length(); i++) {"
            + "\n\r\rchar curr = s.charAt(i);"
            + "\n\n\r\r\rif (map.keySet().contains(curr)) {"
            + "\n\r\r\r\rstack.push(curr);"
            + "\n\r\r\r} else if (map.values().contains(curr)) {"
            + "\n\r\r\r\rif (!stack.empty() && map.get(stack.peek()) == curr) {"
            + "\n\r\r\r\r\rstack.pop();"
            + "\n\r\r\r\r} else {"
            + "\n\r\r\r\r\rreturn false;"
            + "\n\r\r\r\r}"
            + "\n\r\r\r}"
            + "\n\r\r}"
            + "\n\rreturn stack.empty();"
            + "\n}";

    private Question stack1 = new Question("Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.",
            stackans1,
            "stack");

    private String treeans1 = "public static int countNumLesserNodes(Node<Integer> root) {"
            + "\n\rif(root == null) {"
            + "\n\r\rreturn 0;"
            + "\n\r}"
            + "\n\rSet<Node<Integer>> set = new HashSet<>();"
            + "\n\rcountNumLesserNodes(root.left, root.data, set);"
            + "\n\rcountNumLesserNodes(root.right, root.data, set);"
            + "\n\rreturn set.size();"
            + "\n}"
            + "\npublic static void countNumLesserNodes(Node<Integer> root, int pVal, Set<Node<Integer>> set) {"
            + "\n\rif(root == null) {"
            + "\n\r\rreturn;"
            + "\n\r}"
            + "\n\rif(root.data < pVal) {"
            + "\n\r\rset.add(root);"
            + "\n\r\rpVal = root.data;"
            + "\n\r}"
            + "\n\rcountNumLesserNodes(root.left, pVal, set);"
            + "\n\rcountNumLesserNodes(root.right, pVal, set);"
            + "\n}";

    private Question tree1 = new Question("Assuming you have a binary tree that stores integers, count the number of nodes whose values are lower than the values of its upper nodes",
            treeans1,
            "tree");

    private String llans1 = "public boolean isPalindrome(ListNode head) {"
            + "\n\rif(head == null)"
            + "\n\r\rreturn true;"
            + "\n\n\rListNode p = head;"
            + "\n\rListNode prev = new ListNode(head.val);"
            + "\n\n\rwhile(p.next != null){"
            + "\n\r\rListNode temp = new ListNode(p.next.val);"
            + "\n\r\rtemp.next = prev;"
            + "\n\r\rprev = temp;"
            + "\n\r\rp = p.next;"
            + "\n\r}"
            + "\n\n\rListNode p1 = head;"
            + "\n\rListNode p2 = prev;"
            + "\n\n\rwhile(p1!=null){"
            + "\n\r\rif(p1.val != p2.val)"
            + "\n\r\r\rreturn false;"
            + "\n\r\rp1 = p1.next;"
            + "\n\r\rp2 = p2.next;"
            + "\n\r}"
            + "\n\rreturn true;"
            + "\n}";

    private Question linkedlist1 = new Question("Given a singly linked list, determine if it is a palindrome.",
            llans1,
            "linkedlist");


    public Hashtable<String, Question> database = new Hashtable<String, Question>();

    public QuestionsDatabase() {
        this.stacks = "stacks";
        this.tree = "tree";
        this.ll = "linkedlist";
        database.put(stacks, stack1);
        database.put(tree, tree1);
        database.put(ll, linkedlist1);
    }

    public String retrieve(String str)
    {
        if(str=="One")
        {
            return stack1.getqData();
        }
        else if(str =="Two")
        {
            return "Currently unavailable";
        }
        else if(str == "Four")
        {
            return tree1.getqData();
        }
        else if(str == "Three")
        {
            return linkedlist1.getqData();
        }
        else
        {
            return stack1.getqData();
        }
    }
    public String retrieveAnswer(String str)
    {
        if(str=="One")
        {
            return stack1.getAnswer();
        }
        else if(str =="Two")
        {
            return "Currently unavailable";
        }
        else if(str == "Four")
        {
            return tree1.getAnswer();
        }
        else if(str == "Three")
        {
            return linkedlist1.getAnswer();
        }
        else
        {
            return stack1.getAnswer();
        }
    }
}
