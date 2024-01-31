package FirstTask;

public class Main {
    public static void main(String[] args) {
        try{
            String result1 = StringHelper.GetTwoFirstBlocksWithNumbers("1234-ABC-5678-где-1ж2ш");
            System.out.println(result1);

            String result2 = StringHelper.GetDocumentNumber("1234-ABC-5678-где-1ж2ш");
            System.out.println(result2);

            String result3 = StringHelper.GetOnlyChars("1234-ABC-5678-где-1ж2ш");
            System.out.println(result3);

            String result4 = StringHelper.GetOnlyCharsWithStringBuilder("1234-ABC-5678-где-1ж2ш");
            System.out.println(result4);

            boolean result5 = StringHelper.CheckForSequenceOfChars("1234-ABC-5678-где-1ж2ш", "abc");
            System.out.println(result5);

            boolean result6 = StringHelper.CheckForStartingOfDocument("5551-ABC-5678-где-1ж2ш", "555");
            System.out.println(result6);

            boolean result7 = StringHelper.CheckForEndingOfDocument("1234-ABC-5678-где-1a2b", "1a2b");
            System.out.println(result7);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}