package by;

class Remover {
    String stepOne(String text) {
        String result = text;
        result = result.replaceAll("(?i)(ci)", "si");
        result = result.replaceAll("(?i)(ce)", "se");
        result = result.replaceAll("(?i)(ck)", "k");
        result = result.replaceAll("(?i)(c)", "k");
        return result;
    }
    String stepTwo(String text) {
        String result = text;
        result = result.replaceAll("(?i)(ee)", "i");
        result = result.replaceAll("(?i)(oo)", "u");
        result = result.replaceAll("(?i)([a-z])\\1+", "$1");

        return result;
    }
    String stepThree(String text) {
        String result = text;
        result = result.replaceAll("(?i)(\\w+)e(\\W|$)", "$1$2");
        return result;
    }
    String stepFour(String text) {
        String result = text;
        String patternA = "(?i)(\\s*\\b)a(\\b\\s*)";
        String patternAn = "(?i)(\\s*\\b)an(\\b\\s*)";
        String patternThe = "(?i)(\\s*\\b)the(\\b\\s*)";
        result = result.replaceAll(patternA, " ");
        result = result.replaceAll(patternAn, " ");
        result = result.replaceAll(patternThe, " ");
        return result.trim();
    }
}