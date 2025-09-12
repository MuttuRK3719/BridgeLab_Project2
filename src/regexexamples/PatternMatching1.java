package regexexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching1 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("geeks");
//        System.out.println(p.matches("geeks.*", "geeksForgeeks"));
//        Pattern p1 = Pattern.compile(Pattern.quote("gee.k^s.*"));//it make regex as plane text\
//        System.out.println(p1.matcher("geeks"));
//
//        Matcher m = p.matcher("geeksForgeeks");
//
////        System.out.println(m.find());
////        while (m.find()) {
////            System.out.println(m.start() + " " + m.end());
////            System.out.println(m.group());
////        }
//        Pattern p2=Pattern.compile("(geeks)(Forgeeks)");
//        m=p2.matcher("geeksForgeeksgeeks");
//        System.out.println(m.groupCount());
//        System.out.println(Pattern.matches("[a-zA-Z]?","Bzd"));//exactly one or zero char
//        System.out.println(Pattern.matches("[a-z]*",""));
//        System.out.println(Pattern.matches("[a-z]+",""));
        System.out.println(Pattern.matches("[^a-z]+","A"));
        System.out.println(Pattern.matches("[a-z[^A-Z]]+","B"));
        System.out.println(Pattern.matches("a{3,5}","aaaaa"));
        System.out.println(Pattern.matches("\\s+",""));
        System.out.println(Pattern.matches("\\S+","dfsagadsf"));
        System.out.println(Pattern.matches("\\w+","dfsagadsf"));
        System.out.println(Pattern.matches("\\W+","}|{|"));
        System.out.println(Pattern.matches("\\bis\\b","hii my name is"));
        System.out.println(Pattern.matches("\\bis\\b", "hii my name is sdsaf "));



    }
}
